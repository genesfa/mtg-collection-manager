import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {SetsComponent} from "./sets/sets.component";
import {CardsComponent} from "./cards/cards.component";
import {CardDetailComponent} from "./cards/card-detail/card-detail.component";

const routes: Routes = [
  {
    path: '',
    component: SetsComponent,
    data: {
      title: 'Ranthas MTG :: Sets'
    }
  },
  {
    path: 'sets/:id',
    component: CardsComponent
  },
  {
    path: 'cards/:id',
    component: CardDetailComponent
  }
]

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CollectionRoutingModule { }
