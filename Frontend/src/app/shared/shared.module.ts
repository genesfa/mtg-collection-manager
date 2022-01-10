import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";
import {MaterialModule} from "./material.module";
import {FlexLayoutModule} from "@angular/flex-layout";
import {ToolbarComponent} from './components/toolbar/toolbar.component';
import {PageLoadingComponent} from './components/page-loading/page-loading.component';
import { ManaCostComponent } from './components/mana-cost/mana-cost.component';

@NgModule({
  declarations: [
    ToolbarComponent,
    PageLoadingComponent,
    ManaCostComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule,
    MaterialModule,
    FlexLayoutModule
  ],
    exports: [
        CommonModule,
        ReactiveFormsModule,
        HttpClientModule,
        RouterModule,
        MaterialModule,
        FlexLayoutModule,
        ToolbarComponent,
        PageLoadingComponent,
        ManaCostComponent
    ]
})
export class SharedModule { }
