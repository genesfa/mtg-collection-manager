import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";
import {SetResource} from "../../shared/models/collection/set/set-resource";
import {CardResource} from "../../shared/models/collection/card/card-resource";
import {CardModify} from "../../shared/models/collection/card/card-modify";

@Injectable({
  providedIn: 'root'
})
export class CollectionService {

  constructor(private http: HttpClient) { }

  findSets(): Observable<SetResource[]> {
    return this.http.get<SetResource[]>(`${environment.apiBaseURL}/collection/sets`);
  }

  findCardsInSet(setId: string): Observable<CardResource[]> {
    return this.http.get<CardResource[]>(`${environment.apiBaseURL}/collection/sets/${setId}/cards`);
  }

  modifyCardQuantity(request: CardModify): Observable<CardResource> {
    return this.http.put<any>(`${environment.apiBaseURL}/collection/cards/${request.id}`, {nonFoil: request.nonFoil, foil: request.foil});
  }
}
