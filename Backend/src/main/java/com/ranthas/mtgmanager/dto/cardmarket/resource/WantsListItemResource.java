package com.ranthas.mtgmanager.dto.cardmarket.resource;

public class WantsListItemResource {

    private final String id;
    private final int count;
    private final float wishPrice;
    private final float fromPrice;
    private final boolean mailAlert;
    private final int productId;
    private final String productName;

    public WantsListItemResource(String id, int count, float wishPrice, float fromPrice, boolean mailAlert, int productId, String productName) {
        this.id = id;
        this.count = count;
        this.wishPrice = wishPrice;
        this.fromPrice = fromPrice;
        this.mailAlert = mailAlert;
        this.productId = productId;
        this.productName = productName;
    }

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public float getWishPrice() {
        return wishPrice;
    }

    public float getFromPrice() {
        return fromPrice;
    }

    public boolean isMailAlert() {
        return mailAlert;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}
