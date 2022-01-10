export class ManaCost {
  value: string;
  classes: string;

  constructor(value: string) {
    this.value = value;
    this.classes = `symbol ${value.toLowerCase()}`;
  }
}
