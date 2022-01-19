import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class StatisticService {

  constructor(private http: HttpClient) { }

  nonFoilOwnedCardsBySet(setId: string): Observable<number> {
    return this.http.get<number>(`${environment.apiBaseURL}/collection/sets/${setId}/owned/non-foil`);
  }

  foilOwnedCardsBySet(setId: string): Observable<number> {
    return this.http.get<number>(`${environment.apiBaseURL}/collection/sets/${setId}/owned/foil`);
  }

  differentOwnedCardsBySet(setId: string): Observable<number> {
    return this.http.get<number>(`${environment.apiBaseURL}/collection/sets/${setId}/owned/different`);
  }
}
