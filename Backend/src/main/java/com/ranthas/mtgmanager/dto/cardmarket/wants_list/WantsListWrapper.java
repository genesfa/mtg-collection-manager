package com.ranthas.mtgmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ranthas.mtgmanager.dto.cardmarket.CardMarketDTO;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WantsListWrapper extends CardMarketDTO {

    @JsonProperty("wantslist")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<WantsList> wantsLists;

    public WantsListWrapper() {
    }

    public List<WantsList> getWantsLists() {
        return wantsLists;
    }

    public WantsList getWantsList() {
        return wantsLists.get(0);
    }

    public void setWantsLists(List<WantsList> wantsLists) {
        this.wantsLists = wantsLists;
    }

    @Override
    public String toString() {
        return "WantsListResponseWrapper{" +
                "wantsLists=" + wantsLists +
                '}';
    }
}
