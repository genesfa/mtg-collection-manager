import {Component, OnInit} from '@angular/core';
import {CollectionService} from "../../../core/http/collection.service";
import {StorageService} from "../../../core/services/storage.service";
import {MatDialog} from "@angular/material/dialog";
import {ActivatedRoute} from "@angular/router";
import {CardResource} from "../../../shared/models/collection/card/card-resource";
import {Constant} from "../../../shared/constant";
import {CardsTableFilterComponent} from "./cards-table-filter/cards-table-filter.component";
import {Title} from "@angular/platform-browser";
import {CardModify} from "../../../shared/models/collection/card/card-modify";
import {SetResource} from "../../../shared/models/collection/set/set-resource";
import {zip} from "rxjs";
import {StatisticService} from "../../../core/http/statistic.service";
import {SetStats} from "../../../shared/models/collection/set/set-stats";

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.css']
})
export class CardsComponent implements OnInit {

  private _cards: CardResource[];

  setId: string;
  setData: SetResource;
  setStats: SetStats;
  cards: CardResource[];

  constructor(
    private title: Title,
    private activatedRoute: ActivatedRoute,
    private collectionService: CollectionService,
    private statisticService: StatisticService,
    private storage: StorageService,
    private dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.setId = this.activatedRoute.snapshot.paramMap.get('id');
    this.findSet();
    this.findCardsInSet();
    this.findSetStatistics();
    this.title.setTitle(`Ranthas MTG :: ${this.setData?.name}`);
  }

  private findCardsInSet(): void {
    this.collectionService.findCardsInSet(this.setId).subscribe(
      response => {
        this.cards = response;
        this._cards = response;
      }
    );
  }

  private findSet(): void {
    this.setData = this.storage.get(Constant.COLLECTIONS_KEY).find(value => value.id === this.setId);
  }

  private findSetStatistics(): void {

    this.setStats = new SetStats();
    const observable = zip(
      this.statisticService.nonFoilOwnedCardsBySet(this.setId),
      this.statisticService.foilOwnedCardsBySet(this.setId)
    );

    observable.subscribe(
      response => {
        this.setStats.nonFoilOwned = (response[0] / this.setData.cardCount) * 100;
        this.setStats.foilOwned = (response[1] / this.setData.cardCount) * 100;
      }
    )
  }

  displayFilter() {
    const props = {
      width: '800px',
      height: '450px',
      disableClose: true,
      autoFocus: false,
      hasBackdrop: false
    };
    this.dialog
        .open(CardsTableFilterComponent, props)
        .afterClosed()
        .subscribe(
          filter => {
            if (filter) {
              if (filter.colors) {
                this.cards = this._cards.filter(value => value.colors.some(color => filter.colors.includes(color)));
              }
              if (filter.rarity) {
                this.cards = this.cards.filter(value => value.rarity.toUpperCase() === filter.rarity.toUpperCase());
              }
            }
      }
    )
  }

  clearFilter() {
    this.cards = this._cards;
  }

  modifyCollection(request: CardModify): void {
    this.collectionService
        .modifyCardQuantity(request)
        .subscribe(response => {
          const cardResource = this._cards.find(value => value.id === response.id);
          const index = this._cards.indexOf(cardResource);
          this._cards[index] = response;
        });
  }

  createWantlist() {
    let productIds = this._cards.filter(value => value.nonFoil === 0 && value.foil === 0).map(value => value.productId);
    // TODO: crea la wantlist con nombre => code_name
    // TODO: con el id de la wantlist, va añadiendo una a una las cartas
  }
}
