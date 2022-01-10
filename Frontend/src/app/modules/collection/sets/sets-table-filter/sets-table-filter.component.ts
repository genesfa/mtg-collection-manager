import {Component, OnInit} from '@angular/core';
import {MatDialogRef} from "@angular/material/dialog";
import {FormBuilder} from "@angular/forms";
import {SetFilter} from "../../../../shared/models/collection/set/set-filter";
import {BaseFormComponent} from "../../../../shared/components/base-form/base-form.component";

@Component({
  selector: 'app-sets-table-filter',
  templateUrl: './sets-table-filter.component.html',
  styleUrls: ['./sets-table-filter.component.css']
})
export class SetsTableFilterComponent extends BaseFormComponent implements OnInit {

  constructor(
    private dialogRef: MatDialogRef<SetsTableFilterComponent>,
    private formBuilder: FormBuilder
  ) {
    super();
    dialogRef.disableClose = true;
  }

  ngOnInit(): void {
    this.initializeForm();
  }

  initializeForm(): void {
    this.form = this.formBuilder.group({
      name: [null]
    })
  }

  onSubmit(): SetFilter {
    return new SetFilter(this.getValue('name'));
  }
}
