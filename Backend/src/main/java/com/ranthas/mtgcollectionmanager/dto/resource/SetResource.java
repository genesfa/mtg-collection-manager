package com.ranthas.mtgcollectionmanager.dto.resource;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SetResource implements Comparable<SetResource> {

    private final String id;
    private final String name;
    private final String code;
    private final LocalDate releasedAt;
    private final String iconUri;
    private final int cardCount;
    private final LocalDateTime lastUpdate;

    public SetResource(String id, String name, String code, LocalDate releasedAt, String iconUri, int cardCount) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.releasedAt = releasedAt;
        this.iconUri = iconUri;
        this.cardCount = cardCount;
        this.lastUpdate = null;
    }

    public SetResource(String id, String name, String code, LocalDate releasedAt, String iconUri, int cardCount, LocalDateTime lastUpdate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.releasedAt = releasedAt;
        this.iconUri = iconUri;
        this.cardCount = cardCount;
        this.lastUpdate = lastUpdate;
    }

    public String getId() {
        return id;
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

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public int compareTo(SetResource o) {
        return releasedAt.compareTo(o.getReleasedAt()) * -1;
    }
}
