export class SetResource {

  id: string;
  name: string;
  code: string;
  releasedAt: Date;
  iconUri: string;
  cardCount: number;
  lastUpdate: Date;

  constructor(id: string, name: string, code: string, releasedAt: Date, iconUri: string, cardCount: number, lastUpdate: Date) {
    this.id = id;
    this.name = name;
    this.code = code;
    this.releasedAt = releasedAt;
    this.iconUri = iconUri;
    this.cardCount = cardCount;
    this.lastUpdate = lastUpdate;
  }
}
