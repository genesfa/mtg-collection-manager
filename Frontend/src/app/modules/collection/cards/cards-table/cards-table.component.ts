import {Component, EventEmitter, Input, OnInit, Output, ViewChild} from '@angular/core';
import {CardResource} from "../../../../shared/models/collection/card/card-resource";
import {MatTableDataSource} from "@angular/material/table";
import {CardModify} from "../../../../shared/models/collection/card/card-modify";
import {SetResource} from "../../../../shared/models/collection/set/set-resource";
import {MatSort} from "@angular/material/sort";
import {SetStats} from "../../../../shared/models/collection/set/set-stats";
import {MatPaginator} from "@angular/material/paginator";

@Component({
  selector: 'app-cards-table',
  templateUrl: './cards-table.component.html',
  styleUrls: ['./cards-table.component.css']
})
export class CardsTableComponent implements OnInit {

  @Input() setData: SetResource;
  @Input() setStats: SetStats;

  dataSource = new MatTableDataSource<CardResource>();
  columns: string[] = ['quantity', 'image_data', 'rarity', 'collectorNumber', 'nonFoilPrice', 'foilPrice'];

  @ViewChild(MatSort) sort: MatSort;
  @ViewChild(MatPaginator) paginator: MatPaginator;

  @Input() set cards(value: CardResource[]) {
    this.dataSource.data = value;
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
  }

  @Output()
  modifyCollection = new EventEmitter<CardModify>();

  constructor() { }

  ngOnInit(): void {
  }

  addRegular(row: CardResource): void {
    if (row.nonFoil < 4) {
      row.nonFoil++;
      this.emitModifyCollection(row)
    }
  }

  removeRegular(row: CardResource): void {
    if (row.nonFoil > 0) {
      row.nonFoil--;
      this.emitModifyCollection(row)
    }
  }

  addFoil(row: CardResource): void {
    if (row.foil < 4) {
      row.foil++;
      this.emitModifyCollection(row)
    }
  }

  removeFoil(row: CardResource): void {
    if (row.foil > 0) {
      row.foil--;
      this.emitModifyCollection(row);
    }
  }

  private emitModifyCollection(row: CardResource): void {
    this.modifyCollection.emit(new CardModify(row.id, row.nonFoil, row.foil));
  }
}
