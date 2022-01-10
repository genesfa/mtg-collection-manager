package com.ranthas.mtgcollectionmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ranthas.mtgcollectionmanager.constant.Constant;

public class WantsListAddItemRequest {

    @JsonProperty("idProduct")
    private final int id;

    @JsonProperty("count")
    private final int count;

    @JsonProperty("minCondition")
    private final String minCondition;

    @JsonProperty("mailAlert")
    private final boolean mailAlert;

    @JsonProperty("wishPrice")
    private final String wishPrice;

    public WantsListAddItemRequest(int id) {
        this.id = id;
        this.count = 1;
        this.minCondition = Constant.EXCELLENT;
        this.mailAlert = false;
        this.wishPrice = null;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public String getMinCondition() {
        return minCondition;
    }

    public boolean isMailAlert() {
        return mailAlert;
    }

    public String getWishPrice() {
        return wishPrice;
    }

    @Override
    public String toString() {
        return "WantsListAddItemRequest{" +
                "id=" + id +
                ", count=" + count +
                ", minCondition='" + minCondition + '\'' +
                ", mailAlert=" + mailAlert +
                ", wishPrice='" + wishPrice + '\'' +
                '}';
    }
}
