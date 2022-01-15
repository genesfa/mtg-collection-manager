import {Component, Input, OnInit} from '@angular/core';
import {ManaCost} from "../../models/collection/mana-cost";

@Component({
  selector: 'app-mana-cost',
  templateUrl: './mana-cost.component.html',
  styleUrls: ['./mana-cost.component.css']
})
export class ManaCostComponent implements OnInit {

  // TODO: arreglar costes pirexianos
  // TODO: arreglar costes partidos

  private _manaCost: string;
  totalManaCost: ManaCost[] = [];

  @Input() set manaCost(value: string) {
    this._manaCost = value;
    this.evaluateManaCost();
  }

  constructor() { }

  ngOnInit(): void {
  }

  private evaluateManaCost(): void {
    for (let i = 0; i < this._manaCost.length; i = i + 3) {
      this.totalManaCost.push(new ManaCost(this._manaCost.charAt(i + 1)));
    }
  }
}
