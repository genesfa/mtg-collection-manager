package com.ranthas.mtgmanager.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ranthas.mtgmanager.constant.Constant;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "MTG_SETS")
public class MtgSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "scryfall_id")
    private String scryfallId;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "released_at")
    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private LocalDate releasedAt;

    @Column(name = "card_count")
    private int cardCount;

    @Column(name = "icon_uri")
    private String iconUri;

    public MtgSet() {
        this.id = 0L;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getScryfallId() {
        return scryfallId;
    }

    public void setScryfallId(String scryfallId) {
        this.scryfallId = scryfallId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(LocalDate releasedAt) {
        this.releasedAt = releasedAt;
    }

    public int getCardCount() {
        return cardCount;
    }

    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }

    public String getIconUri() {
        return iconUri;
    }

    public void setIconUri(String iconUri) {
        this.iconUri = iconUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MtgSet mtgSet = (MtgSet) o;
        return id == mtgSet.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Set{" +
                "id=" + id +
                ", scryfallId='" + scryfallId + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", releasedAt=" + releasedAt +
                ", cardCount=" + cardCount +
                ", iconUri='" + iconUri + '\'' +
                '}';
    }
}
