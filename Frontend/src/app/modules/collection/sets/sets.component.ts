import {Component, OnInit} from '@angular/core';
import {SetResource} from "../../../shared/models/collection/set/set-resource";
import {StorageService} from "../../../core/services/storage.service";
import {MatDialog} from "@angular/material/dialog";
import {Constant} from "../../../shared/constant";
import {SetsTableFilterComponent} from "./sets-table-filter/sets-table-filter.component";

@Component({
  selector: 'app-sets',
  templateUrl: './sets.component.html',
  styleUrls: ['./sets.component.css']
})
export class SetsComponent implements OnInit {

  private _sets: SetResource[];
  sets: SetResource[];

  constructor(
    private storage: StorageService,
    private dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.findCollections();
  }

  findCollections(): void {
    this._sets = this.storage.get(Constant.COLLECTIONS_KEY);
    this.sets = this._sets;
  }

  displayFilter() {
    this.dialog.open(SetsTableFilterComponent).afterClosed().subscribe(
      filter => {
        if (filter) {
          this.sets = this._sets.filter(value => filter.filterValue(value));
        }
      }
    )
  }

  clearFilter() {
    this.findCollections();
  }
}
