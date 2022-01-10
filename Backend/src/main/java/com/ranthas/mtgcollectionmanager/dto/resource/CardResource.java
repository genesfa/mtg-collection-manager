package com.ranthas.mtgcollectionmanager.dto.resource;

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
            List<String> colors
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
}