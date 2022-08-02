package com.ranthas.mtgmanager.dto.cardmarket;

import java.util.List;

public class CreateWantListRequest {

    private String listName;
    private List<Integer> productIds;

    public CreateWantListRequest() {
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public List<Integer> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }
}