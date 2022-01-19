export class CreateWantlistRequest {
  listName: string;
  productIds: number[];

  constructor(listName: string, productIds: number[]) {
    this.listName = listName;
    this.productIds = productIds;
  }
}
