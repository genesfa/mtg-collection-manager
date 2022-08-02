package com.ranthas.mtgmanager.dto.cardmarket;

public class CreateWantListResponse {

    private final String message;

    public CreateWantListResponse(String listName) {
        message = String.format("Wants list %s updated", listName);
    }

    public CreateWantListResponse(String listName, int size) {
        message = String.format("Wants list %s created with %d cards", listName, size);
    }

    public String getMessage() {
        return message;
    }
}
