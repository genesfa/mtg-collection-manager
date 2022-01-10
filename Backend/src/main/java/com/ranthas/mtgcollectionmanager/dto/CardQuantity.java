package com.ranthas.mtgcollectionmanager.dto;

public class CardQuantity {

    private int nonFoil;
    private int foil;

    public CardQuantity() {
    }

    public int getNonFoil() {
        return nonFoil;
    }

    public void setNonFoil(int nonFoil) {
        this.nonFoil = nonFoil;
    }

    public int getFoil() {
        return foil;
    }

    public void setFoil(int foil) {
        this.foil = foil;
    }
}
