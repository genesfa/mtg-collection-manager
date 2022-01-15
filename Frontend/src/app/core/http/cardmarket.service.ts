import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Wantlist} from "../../shared/models/cardmarket/wantlist";
import {environment} from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class CardmarketService {

  constructor(private http: HttpClient) { }

  findWantLists(): Observable<Wantlist[]> {
    return this.http.get<Wantlist[]>(`${environment.apiBaseURL}/cardmarket/wantlists`);
  }
}
