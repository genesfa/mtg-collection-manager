package com.ranthas.mtgcollectionmanager.dto.scryfall.card;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CardFace {

    @JsonProperty("name")
    private String name;

    @JsonProperty("mana_cost")
    private String manaCost;

    @JsonProperty("type_line")
    private String typeLine;

    @JsonProperty("oracle_text")
    private String oracleText;

    public CardFace() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getTypeLine() {
        return typeLine;
    }

    public void setTypeLine(String typeLine) {
        this.typeLine = typeLine;
    }

    public String getOracleText() {
        return oracleText;
    }

    public void setOracleText(String oracleText) {
        this.oracleText = oracleText;
    }
}
