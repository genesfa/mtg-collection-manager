package com.ranthas.mtgcollectionmanager.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ranthas.mtgcollectionmanager.constant.Constant;
import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSet;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document(collection = "Sets")
public class Set {

    @Id
    private ObjectId id;

    private ScryfallSet data;

    @JsonFormat(pattern = Constant.DATE_TIME_FORMAT)
    private LocalDateTime lastUpdate;

    public Set() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ScryfallSet getData() {
        return data;
    }

    public void setData(ScryfallSet data) {
        this.data = data;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Set set = (Set) o;
        return id.equals(set.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
