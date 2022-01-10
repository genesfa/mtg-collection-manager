import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {SetResource} from "../../shared/models/collection/set/set-resource";
import {environment} from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ScryfallService {

  constructor(private http: HttpClient) { }

  findSets(): Observable<SetResource[]> {
    return this.http.get<SetResource[]>(`${environment.apiBaseURL}/scryfall/sets`);
  }
}
