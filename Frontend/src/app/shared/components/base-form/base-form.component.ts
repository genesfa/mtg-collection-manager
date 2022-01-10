import {Component, OnInit} from "@angular/core";
import {FormArray, FormGroup} from "@angular/forms";

@Component({
  template: ''
})
export abstract class BaseFormComponent implements OnInit {

  form: FormGroup;

  ngOnInit(): void {
  }

  hasError(controlName: string, errorName: string): boolean {
    return this.form.get(controlName).hasError(errorName);
  }

  hasErrorArray(controlName: string, errorName: string, formArrayIndex: number): boolean {
    return (this.form.get(controlName) as FormArray).controls[formArrayIndex].hasError(errorName);
  }

  getValue(controlName: string): any {
    return this.form.get(controlName).value;
  }

  onCancel(): void {
    this.form.reset();
    this.initializeForm();
  }

  abstract onSubmit(): void;

  abstract initializeForm(): void;
}
