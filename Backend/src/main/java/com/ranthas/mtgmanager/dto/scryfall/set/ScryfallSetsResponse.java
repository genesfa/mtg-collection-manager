package com.ranthas.mtgmanager.dto.scryfall.set;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ScryfallSetsResponse {

    @JsonProperty("list")
    private String list;

    @JsonProperty("has_more")
    private boolean hasMore;

    @JsonProperty("data")
    private List<ScryfallSet> data;

    public ScryfallSetsResponse() {
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<ScryfallSet> getData() {
        return data;
    }

    public void setData(List<ScryfallSet> data) {
        this.data = data;
    }
}
