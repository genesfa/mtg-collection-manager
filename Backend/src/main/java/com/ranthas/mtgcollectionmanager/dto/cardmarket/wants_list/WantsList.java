package com.ranthas.mtgcollectionmanager.dto.cardmarket.wants_list;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WantsList {

    @JsonProperty("idWantslist")
    private int id;

    private String name;
    private int itemCount;

    @JsonProperty("item")
    private List<WantsListItem> items;

    public WantsList() {
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

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public List<WantsListItem> getItems() {
        return items;
    }

    public void setItems(List<WantsListItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "WantsList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itemCount=" + itemCount +
                ", items=" + items +
                '}';
    }
}
