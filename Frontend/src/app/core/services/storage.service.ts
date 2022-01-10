import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StorageService {

  constructor() {
  }

  add(key: string, item: any): void {
    sessionStorage.setItem(key, JSON.stringify(item));
  }

  get(key: string): any {
    return JSON.parse(sessionStorage.getItem(key));
  }

  clear(): void {
    sessionStorage.clear();
  }
}
