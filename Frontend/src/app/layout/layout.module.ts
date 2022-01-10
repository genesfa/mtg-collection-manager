import {NgModule} from '@angular/core';
import {ContainerComponent} from './container/container.component';
import {SidebarComponent} from "./sidebar/sidebar.component";
import {TopbarComponent} from "./topbar/topbar.component";
import {SharedModule} from "../shared/shared.module";

@NgModule({
  declarations: [
    ContainerComponent,
    SidebarComponent,
    TopbarComponent
  ],
  imports: [
    SharedModule
  ],
  exports: [
    ContainerComponent,
    SidebarComponent,
    TopbarComponent
  ]
})
export class LayoutModule { }
