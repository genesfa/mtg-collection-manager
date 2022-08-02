package com.ranthas.mtgmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "request")
public class WantsListRemoveItemRequestWrapper {

    private final String action;
    private final WantsListRemoveItemRequest want;

    public WantsListRemoveItemRequestWrapper(WantsListRemoveItemRequest want) {
        this.action = "deleteItem";
        this.want = want;
    }

    public String getAction() {
        return action;
    }

    public WantsListRemoveItemRequest getWant() {
        return want;
    }

    @Override
    public String toString() {
        return "WantsListRemoveItemRequestWrapper{" +
                "action='" + action + '\'' +
                ", want=" + want +
                '}';
    }
}
