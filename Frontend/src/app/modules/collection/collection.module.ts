import {NgModule} from '@angular/core';
import {SharedModule} from "../../shared/shared.module";
import {CollectionRoutingModule} from "./collection-routing.module";
import {CardsComponent} from './cards/cards.component';
import {SetsComponent} from './sets/sets.component';
import {SetsTableFilterComponent} from './sets/sets-table-filter/sets-table-filter.component';
import {CardsTableFilterComponent} from './cards/cards-table-filter/cards-table-filter.component';
import {SetsTableComponent} from './sets/sets-table/sets-table.component';
import {CardsTableComponent} from './cards/cards-table/cards-table.component';
import {FormsModule} from "@angular/forms";
import { CardDetailComponent } from './cards/card-detail/card-detail.component';

@NgModule({
  declarations: [
    SetsComponent,
    SetsTableComponent,
    SetsTableFilterComponent,
    CardsComponent,
    CardsTableComponent,
    CardsTableFilterComponent,
    CardDetailComponent
  ],
    imports: [
        SharedModule,
        CollectionRoutingModule,
        FormsModule
    ]
})
export class CollectionModule { }
