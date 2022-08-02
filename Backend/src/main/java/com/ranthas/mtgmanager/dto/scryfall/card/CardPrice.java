package com.ranthas.mtgmanager.dto.scryfall.card;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardPrice {

    @JsonProperty("eur")
    private String eur;

    @JsonProperty("eur_foil")
    private String eurFoil;

    @JsonProperty("usd")
    private String usd;

    @JsonProperty("usd_foil")
    private String usdFoil;

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

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getUsdFoil() {
        return usdFoil;
    }

    public void setUsdFoil(String usdFoil) {
        this.usdFoil = usdFoil;
    }
}
