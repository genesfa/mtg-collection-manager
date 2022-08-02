package com.ranthas.mtgmanager.dto.cardmarket;

import java.util.List;

public class CardMarketDTO {

    private List<CardMarketError> failed;

    public CardMarketDTO() {
    }

    public List<CardMarketError> getFailed() {
        return failed;
    }

    public void setFailed(List<CardMarketError> failed) {
        this.failed = failed;
    }

    public boolean isErrorResponse() {
        return failed != null && !failed.isEmpty();
    }
}
