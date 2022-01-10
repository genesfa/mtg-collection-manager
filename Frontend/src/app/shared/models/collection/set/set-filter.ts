import {SetResource} from "./set-resource";

export class SetFilter {

  name?: string;

  constructor(name: string) {
    this.name = name;
  }

  filterValue(value: SetResource): boolean {
    if (this.name) {
      return value.name.toLowerCase().includes(this.name.toLowerCase());
    } else {
      return false;
    }
  }
}
