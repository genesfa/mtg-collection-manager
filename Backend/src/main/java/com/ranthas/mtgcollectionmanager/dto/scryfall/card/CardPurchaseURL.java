package com.ranthas.mtgcollectionmanager.dto.scryfall.card;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardPurchaseURL {

    @JsonProperty("tcgplayer")
    private String tcgplayer;

    @JsonProperty("cardmarket")
    private String cardmarket;

    @JsonProperty("cardhoarder")
    private String cardhoarder;

    public CardPurchaseURL() {
    }

    public String getTcgplayer() {
        return tcgplayer;
    }

    public void setTcgplayer(String tcgplayer) {
        this.tcgplayer = tcgplayer;
    }

    public String getCardmarket() {
        return cardmarket;
    }

    public void setCardmarket(String cardmarket) {
        this.cardmarket = cardmarket;
    }

    public String getCardhoarder() {
        return cardhoarder;
    }

    public void setCardhoarder(String cardhoarder) {
        this.cardhoarder = cardhoarder;
    }
}
