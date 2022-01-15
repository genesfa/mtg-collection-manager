import {NgModule} from '@angular/core';
import {CardmarketTableContainerComponent} from './cardmarket-table-container/cardmarket-table-container.component';
import {SharedModule} from "../../shared/shared.module";
import {CardmarketRoutingModule} from "./cardmarket-routing.module";

@NgModule({
  declarations: [
    CardmarketTableContainerComponent
  ],
  imports: [
    SharedModule,
    CardmarketRoutingModule
  ],
  exports: [
    CardmarketTableContainerComponent
  ]
})
export class CardmarketModule { }
