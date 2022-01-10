export class CardModify {

  id: string;
  nonFoil: number;
  foil: number;

  constructor(id: string, nonFoil: number, foil: number) {
    this.id = id;
    this.nonFoil = nonFoil;
    this.foil = foil;
  }
}
