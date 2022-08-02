package com.ranthas.mtgmanager.dto.scryfall.card;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ScryfallCardsResponse {

    @JsonProperty("object")
    private String object;

    @JsonProperty("total_cards")
    private int totalCards;

    @JsonProperty("has_more")
    private boolean hasMore;

    @JsonProperty("next_page")
    private String nextPage;

    private List<ScryfallCard> data;

    public ScryfallCardsResponse() {
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getTotalCards() {
        return totalCards;
    }

    public void setTotalCards(int totalCards) {
        this.totalCards = totalCards;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public List<ScryfallCard> getData() {
        return data;
    }

    public void setData(List<ScryfallCard> data) {
        this.data = data;
    }
}
