package com.ranthas.mtgcollectionmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "request")
public class WantsListRequestWrapper {

    @JsonProperty("wantslist")
    private final WantsListRequest wantsList;

    public WantsListRequestWrapper(WantsListRequest wantsList) {
        this.wantsList = wantsList;
    }

    public WantsListRequest getWantsList() {
        return wantsList;
    }

    @Override
    public String toString() {
        return "WantsListRequestWrapper{" +
                "wantsList=" + wantsList +
                '}';
    }
}
