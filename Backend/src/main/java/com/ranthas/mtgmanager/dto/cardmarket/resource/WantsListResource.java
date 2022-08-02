package com.ranthas.mtgmanager.dto.cardmarket.resource;

public class WantsListResource {

    private final int id;
    private final String name;
    private final int itemCount;

    public WantsListResource(int id, String name, int itemCount) {
        this.id = id;
        this.name = name;
        this.itemCount = itemCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getItemCount() {
        return itemCount;
    }
}
