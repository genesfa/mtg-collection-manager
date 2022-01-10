package com.ranthas.mtgcollectionmanager.dto.cardmarket;

public class CardMarketError {

    private String error;

    public CardMarketError() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "CardMarketError{" +
                "error='" + error + '\'' +
                '}';
    }
}
