import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import {finalize, Observable} from 'rxjs';
import {PageLoaderService} from "../services/page-loader.service";

@Injectable()
export class PageLoaderInterceptor implements HttpInterceptor {

  constructor(private pageLoader: PageLoaderService) {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    this.pageLoader.show();
    return next.handle(request).pipe(
      finalize(() => this.pageLoader.hide())
    );
  }
}
