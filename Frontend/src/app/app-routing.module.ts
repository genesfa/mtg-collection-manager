import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {ContainerComponent} from "./layout/container/container.component";

const routes: Routes = [
  {
    path: '',
    component: ContainerComponent,
    children: [
      {
        path: '',
        pathMatch: 'full',
        redirectTo: 'home'
      },
      {
        path: 'home',
        loadChildren: () => import('./modules/home/home.module').then(m => m.HomeModule),
        data: {
          title: 'Ranthas MTG Collection Manager'
        }
      },
      {
        path: 'settings',
        loadChildren: () => import('./modules/settings/settings.module').then(m => m.SettingsModule)
      },
      {
        path: 'collections',
        loadChildren: () => import('./modules/collection/collection.module').then(m => m.CollectionModule)
      },
      {
        path: 'cardmarket',
        loadChildren: () => import('./modules/cardmarket/cardmarket.module').then(m => m.CardmarketModule)
      }
    ]
  }
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
