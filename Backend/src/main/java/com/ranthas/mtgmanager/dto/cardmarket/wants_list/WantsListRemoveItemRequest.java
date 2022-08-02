package com.ranthas.mtgmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WantsListRemoveItemRequest {

    @JsonProperty("idWant")
    private final String id;

    public WantsListRemoveItemRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "WantsListRemoveItemRequest{" +
                "id='" + id + '\'' +
                '}';
    }
}
