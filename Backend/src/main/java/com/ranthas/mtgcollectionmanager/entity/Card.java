package com.ranthas.mtgcollectionmanager.entity;

import com.ranthas.mtgcollectionmanager.dto.scryfall.card.ScryfallCard;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "Cards")
public class Card {

    @Id
    private ObjectId id;

    private Set set;
    private ScryfallCard data;
    private int foilQuantity;
    private int nonFoilQuantity;

    public Card() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public ScryfallCard getData() {
        return data;
    }

    public void setData(ScryfallCard data) {
        this.data = data;
    }

    public int getFoilQuantity() {
        return foilQuantity;
    }

    public void setFoilQuantity(int foilQuantity) {
        this.foilQuantity = foilQuantity;
    }

    public int getNonFoilQuantity() {
        return nonFoilQuantity;
    }

    public void setNonFoilQuantity(int nonFoilQuantity) {
        this.nonFoilQuantity = nonFoilQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return id.equals(card.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void addFoil() {
        foilQuantity++;
    }

    public void removeFoil() {
        if (foilQuantity > 0) {
            foilQuantity--;
        }
    }

    public void addNonFoil() {
        nonFoilQuantity++;
    }

    public void removeNonFoil() {
        if (nonFoilQuantity > 0) {
            foilQuantity--;
        }
    }
}
