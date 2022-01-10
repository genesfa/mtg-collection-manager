import {Injectable} from '@angular/core';
import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from '@angular/common/http';
import {Observable} from 'rxjs';
import {PageLoaderService} from "../services/page-loader.service";
import {finalize} from "rxjs/operators";

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
