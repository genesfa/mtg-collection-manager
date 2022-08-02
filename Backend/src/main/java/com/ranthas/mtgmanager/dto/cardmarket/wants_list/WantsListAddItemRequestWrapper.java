package com.ranthas.mtgmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "request")
public class WantsListAddItemRequestWrapper {

    private final String action;
    private final WantsListAddItemRequest product;

    public WantsListAddItemRequestWrapper(WantsListAddItemRequest product) {
        this.action = "addItem";
        this.product = product;
    }

    public String getAction() {
        return action;
    }

    public WantsListAddItemRequest getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "WantsListAddItemRequestWrapper{" +
                "action='" + action + '\'' +
                ", product=" + product +
                '}';
    }
}
