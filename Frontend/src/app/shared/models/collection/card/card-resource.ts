import {CardImageResource} from "./card-image-resource";

export class CardResource {
  id: string;
  name: string;
  image: CardImageResource;
  type: string;
  manaCost: string;
  rarity: string;
  collectorNumber: string;
  nonFoilPrice?: number;
  foilPrice?: number;
  nonFoil: number;
  foil: number;
  colors: string[];
}
