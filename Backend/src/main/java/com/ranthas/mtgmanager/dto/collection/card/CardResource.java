package com.ranthas.mtgmanager.dto.collection.card;

import com.ranthas.mtgmanager.dto.scryfall.card.CardURL;

import java.util.List;

public class CardResource {

    private final String id;
    private final String name;
    private final CardImageResource image;
    private final String type;
    private final String manaCost;
    private final String rarity;
    private final String collectorNumber;
    private final Double nonFoilPrice;
    private final Double foilPrice;
    private final int nonFoil;
    private final int foil;
    private final List<String> colors;
    private final int productId;
    private final String oracleText;
    private final CreaturePower creaturePower;
    private final CardURL relatedLinks;

    public CardResource(
            String id,
            String name,
            CardImageResource image,
            String type,
            String manaCost,
            String rarity,
            String collectorNumber,
            Double nonFoilPrice,
            Double foilPrice,
            int nonFoil,
            int foil,
            List<String> colors,
            int productId,
            String oracleText,
            CreaturePower creaturePower,
            CardURL relatedLinks
    ) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.type = type;
        this.manaCost = manaCost;
        this.rarity = rarity;
        this.collectorNumber = collectorNumber;
        this.nonFoilPrice = nonFoilPrice;
        this.foilPrice = foilPrice;
        this.nonFoil = nonFoil;
        this.foil = foil;
        this.colors = colors;
        this.productId = productId;
        this.oracleText = oracleText;
        this.creaturePower = creaturePower;
        this.relatedLinks = relatedLinks;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CardImageResource getImage() {
        return image;
    }

    public int getNonFoil() {
        return nonFoil;
    }

    public int getFoil() {
        return foil;
    }

    public String getType() {
        return type;
    }

    public String getManaCost() {
        return manaCost;
    }

    public String getRarity() {
        return rarity;
    }

    public String getCollectorNumber() {
        return collectorNumber;
    }

    public Double getNonFoilPrice() {
        return nonFoilPrice;
    }

    public Double getFoilPrice() {
        return foilPrice;
    }

    public List<String> getColors() {
        return colors;
    }

    public int getProductId() {
        return productId;
    }

    public String getOracleText() {
        return oracleText;
    }

    public CreaturePower getCreaturePower() {
        return creaturePower;
    }

    public CardURL getRelatedLinks() {
        return relatedLinks;
    }
}
