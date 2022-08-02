package com.ranthas.mtgmanager.dto.collection.card;

public class CreaturePower {

    private final String power;
    private final String toughness;

    public CreaturePower(String power, String toughness) {
        this.power = power;
        this.toughness = toughness;
    }

    public String getPower() {
        return power;
    }

    public String getToughness() {
        return toughness;
    }
}
