package com.ranthas.mtgmanager.dto.cardmarket.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductResponse {

    @JsonProperty("idProduct")
    private int id;

    @JsonProperty("enName")
    private String name;

    private String website;
    private String image;
    private PriceGuide priceGuide;

    public ProductResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public PriceGuide getPriceGuide() {
        return priceGuide;
    }

    public void setPriceGuide(PriceGuide priceGuide) {
        this.priceGuide = priceGuide;
    }
}
