package com.ranthas.mtgcollectionmanager.dto.scryfall.card;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardURL {

    @JsonProperty("gatherer")
    private String gatherer;

    @JsonProperty("tcgplayer_infinite_articles")
    private String tcgplayerInfiniteArticles;

    @JsonProperty("tcgplayer_infinite_decks")
    private String tcgplayerInfiniteDecks;

    @JsonProperty("edhrec")
    private String edhrec;

    @JsonProperty("mtgtop8")
    private String mtgtop8;

    public CardURL() {
    }

    public String getGatherer() {
        return gatherer;
    }

    public void setGatherer(String gatherer) {
        this.gatherer = gatherer;
    }

    public String getTcgplayerInfiniteArticles() {
        return tcgplayerInfiniteArticles;
    }

    public void setTcgplayerInfiniteArticles(String tcgplayerInfiniteArticles) {
        this.tcgplayerInfiniteArticles = tcgplayerInfiniteArticles;
    }

    public String getTcgplayerInfiniteDecks() {
        return tcgplayerInfiniteDecks;
    }

    public void setTcgplayerInfiniteDecks(String tcgplayerInfiniteDecks) {
        this.tcgplayerInfiniteDecks = tcgplayerInfiniteDecks;
    }

    public String getEdhrec() {
        return edhrec;
    }

    public void setEdhrec(String edhrec) {
        this.edhrec = edhrec;
    }

    public String getMtgtop8() {
        return mtgtop8;
    }

    public void setMtgtop8(String mtgtop8) {
        this.mtgtop8 = mtgtop8;
    }
}
