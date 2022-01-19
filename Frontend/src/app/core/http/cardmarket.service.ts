import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";
import {Wantlist} from "../../shared/models/collection/cardmarket/wantlist";
import {CreateWantlistRequest} from "../../shared/models/collection/cardmarket/create-wantlist-request";

@Injectable({
  providedIn: 'root'
})
export class CardmarketService {

  constructor(private http: HttpClient) { }

  findWantLists(): Observable<Wantlist[]> {
    return this.http.get<Wantlist[]>(`${environment.apiBaseURL}/cardmarket/wantlists`);
  }

  createWantList(request: CreateWantlistRequest): Observable<any> {
    return this.http.post<any>(`${environment.apiBaseURL}/cardmarket/wantlists`, request);
  }
}
