package com.ranthas.mtgcollectionmanager.dto.scryfall.card;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardPrice {

    @JsonProperty("eur")
    private String eur;

    @JsonProperty("eur_foil")
    private String eurFoil;

    public CardPrice() {
    }

    public String getEur() {
        return eur;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }

    public String getEurFoil() {
        return eurFoil;
    }

    public void setEurFoil(String eurFoil) {
        this.eurFoil = eurFoil;
    }
}
