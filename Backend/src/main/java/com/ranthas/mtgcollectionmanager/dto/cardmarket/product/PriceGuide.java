package com.ranthas.mtgcollectionmanager.dto.cardmarket.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceGuide {

    @JsonProperty("SELL")
    private float sell; // Average price of articles ever sold of this product

    @JsonProperty("LOW")
    private float low; // Current lowest non-foil price (all conditions)

    @JsonProperty("LOWEX")
    private float lowEx; // Current lowest non-foil price (condition EX or better)

    @JsonProperty("LOWFOIL")
    private float lowFoil; // Current average non-foil price of all available articles of this products

    @JsonProperty("AVG")
    private float avg; // Current average non-foil price of all available articles of this product

    @JsonProperty("TREND")
    private float trend; // Current trend price

    @JsonProperty("TRENDFOIL")
    private float trendFoil; // Current foil trend price

    public PriceGuide() {
    }

    public float getSell() {
        return sell;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getLowEx() {
        return lowEx;
    }

    public void setLowEx(float lowEx) {
        this.lowEx = lowEx;
    }

    public float getLowFoil() {
        return lowFoil;
    }

    public void setLowFoil(float lowFoil) {
        this.lowFoil = lowFoil;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public float getTrend() {
        return trend;
    }

    public void setTrend(float trend) {
        this.trend = trend;
    }

    public float getTrendFoil() {
        return trendFoil;
    }

    public void setTrendFoil(float trendFoil) {
        this.trendFoil = trendFoil;
    }
}
