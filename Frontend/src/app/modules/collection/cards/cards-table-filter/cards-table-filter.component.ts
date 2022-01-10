import {Component, OnInit} from '@angular/core';
import {BaseFormComponent} from "../../../../shared/components/base-form/base-form.component";
import {FormBuilder} from "@angular/forms";
import {CardColor} from "../../../../shared/models/collection/card/card-color";
import {CardFilter} from "../../../../shared/models/collection/card/card-filter";
import {Constant} from "../../../../shared/constant";

@Component({
  selector: 'app-cards-table-filter',
  templateUrl: './cards-table-filter.component.html',
  styleUrls: ['./cards-table-filter.component.css']
})
export class CardsTableFilterComponent extends BaseFormComponent implements OnInit {

  colors = CardColor.VALUES;
  rarities = Constant.CARD_RARITIES;

  constructor(private formBuilder: FormBuilder) {
    super();
  }

  override ngOnInit(): void {
    this.initializeForm();
  }

  initializeForm(): void {
    this.form = this.formBuilder.group({
      colors: [null],
      rarity: [null]
    });
  }

  onSubmit(): CardFilter {
    const filter = new CardFilter();
    filter.colors = this.form.get('colors').value;
    filter.rarity = this.form.get('rarity').value;
    return filter;
  }


}
