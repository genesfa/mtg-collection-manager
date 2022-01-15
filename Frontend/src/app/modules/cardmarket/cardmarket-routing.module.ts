import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {CardmarketTableContainerComponent} from "./cardmarket-table-container/cardmarket-table-container.component";

const routes: Routes = [
  {
    path: '',
    component: CardmarketTableContainerComponent
  }
]

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CardmarketRoutingModule { }
