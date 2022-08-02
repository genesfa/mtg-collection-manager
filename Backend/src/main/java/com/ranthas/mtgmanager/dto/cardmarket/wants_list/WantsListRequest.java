package com.ranthas.mtgmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ranthas.mtgmanager.constant.Constant;

public class WantsListRequest {

    @JsonProperty("name")
    private final String name;

    @JsonProperty("idGame")
    private final int gameId;

    public WantsListRequest(String name) {
        this.name = name;
        this.gameId = Constant.MTG_ID_GAME;
    }

    public String getName() {
        return name;
    }

    public int getGameId() {
        return gameId;
    }

    @Override
    public String toString() {
        return "WantsListRequest{" +
                "name='" + name + '\'' +
                ", gameId=" + gameId +
                '}';
    }
}
