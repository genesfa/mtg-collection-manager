import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {SetResource} from "../../shared/models/set-resource";

@Injectable({
  providedIn: 'root'
})
export class CollectionService {

  constructor(private http: HttpClient) { }

  findAllSets(): Observable<SetResource[]> {
    return this.http.get<SetResource[]>(`http://localhost:8080/api/mtg/sets`);
  }
}
