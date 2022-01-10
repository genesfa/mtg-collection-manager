package com.ranthas.mtgcollectionmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WantsListItem {

    @JsonProperty("idWant")
    private String id;

    private int count;
    private float wishPrice;
    private float fromPrice;
    private boolean mailAlert;

    @JsonProperty("idProduct")
    private int productId;

    public WantsListItem() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getWishPrice() {
        return wishPrice;
    }

    public void setWishPrice(float wishPrice) {
        this.wishPrice = wishPrice;
    }

    public float getFromPrice() {
        return fromPrice;
    }

    public void setFromPrice(float fromPrice) {
        this.fromPrice = fromPrice;
    }

    public boolean isMailAlert() {
        return mailAlert;
    }

    public void setMailAlert(boolean mailAlert) {
        this.mailAlert = mailAlert;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "WantsListItem{" +
                "id='" + id + '\'' +
                ", count=" + count +
                ", wishPrice=" + wishPrice +
                ", fromPrice=" + fromPrice +
                ", mailAlert=" + mailAlert +
                ", productId=" + productId +
                '}';
    }
}
