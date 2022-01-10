import {Component, OnInit} from '@angular/core';
import {CollectionService} from "../../core/http/collection.service";
import {ScryfallService} from "../../core/http/scryfall.service";
import {SetResource} from "../../shared/models/collection/set/set-resource";
import {StorageService} from "../../core/services/storage.service";
import {zip} from "rxjs";
import {Constant} from "../../shared/constant";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  // TODO: esto a claras luces está mal, hay que revisarlo e implementarlo correctamente
  newSets: SetResource[];

  constructor(
    private collectionService: CollectionService,
    private scryfallService: ScryfallService,
    private storage: StorageService
  ) { }

  ngOnInit(): void {
    this.findNewCollections();
    this.findDatabaseCollections();
  }

  private findNewCollections(): void {
    if (!this.storage.get(Constant.FIND_NEW_SETS)) {
      let collectionSetCodes: string[];
      let scryfallSets: SetResource[];

      zip(this.collectionService.findSets(), this.scryfallService.findSets()).subscribe(
        response => {
          collectionSetCodes = response[0].map(value => value.code);
          scryfallSets = response[1];
          this.newSets = scryfallSets.filter(scryfallSet => !collectionSetCodes.includes(scryfallSet.code));
          this.storage.add(Constant.FIND_NEW_SETS, true);
        }
      );
    }
  }

  private findDatabaseCollections(): void {
    if (!this.storage.get(Constant.COLLECTIONS_KEY)) {
      this.collectionService.findSets().subscribe(response => this.storage.add(Constant.COLLECTIONS_KEY, response));
    }
  }
}
