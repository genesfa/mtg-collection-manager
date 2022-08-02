import { Component, OnInit } from '@angular/core';
import {PageLoaderService} from "../../../core/services/page-loader.service";

@Component({
  selector: 'app-page-loading',
  templateUrl: './page-loading.component.html',
  styleUrls: ['./page-loading.component.css']
})
export class PageLoadingComponent implements OnInit {

  loading$ = this.pageLoader.loading$;

  constructor(public pageLoader: PageLoaderService) {}

  ngOnInit(): void {
  }

}
