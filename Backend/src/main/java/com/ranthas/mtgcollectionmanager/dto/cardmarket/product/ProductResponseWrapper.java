package com.ranthas.mtgcollectionmanager.dto.cardmarket.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ranthas.mtgcollectionmanager.dto.cardmarket.CardMarketDTO;

public class ProductResponseWrapper extends CardMarketDTO {

    @JsonProperty("product")
    private ProductResponse product;

    public ProductResponseWrapper() {
    }

    public ProductResponse getProduct() {
        return product;
    }

    public void setProduct(ProductResponse product) {
        this.product = product;
    }
}
