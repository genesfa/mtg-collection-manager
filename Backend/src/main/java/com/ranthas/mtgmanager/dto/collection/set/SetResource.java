package com.ranthas.mtgmanager.dto.collection.set;

import java.time.LocalDate;

public class SetResource {

    private final String name;
    private final String code;
    private final LocalDate releasedAt;
    private final String iconUri;
    private final int cardCount;

    public SetResource(String name, String code, LocalDate releasedAt, String iconUri, int cardCount) {
        this.name = name;
        this.code = code;
        this.releasedAt = releasedAt;
        this.iconUri = iconUri;
        this.cardCount = cardCount;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public LocalDate getReleasedAt() {
        return releasedAt;
    }

    public String getIconUri() {
        return iconUri;
    }

    public int getCardCount() {
        return cardCount;
    }
}
