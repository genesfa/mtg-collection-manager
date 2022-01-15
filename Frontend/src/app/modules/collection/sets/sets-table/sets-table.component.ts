import {Component, Input, OnInit} from '@angular/core';
import {SetResource} from "../../../../shared/models/collection/set/set-resource";
import {MatTableDataSource} from "@angular/material/table";

@Component({
  selector: 'app-sets-table',
  templateUrl: './sets-table.component.html',
  styleUrls: ['./sets-table.component.css']
})
export class SetsTableComponent implements OnInit {

  @Input() set sets(value: SetResource[]) {
    this.dataSource.data = value;
  }

  dataSource = new MatTableDataSource<SetResource>();
  columns: string[] = ['icon', 'name', 'releaseDate', 'total_cards'];

  constructor() { }

  ngOnInit(): void {
  }

}
