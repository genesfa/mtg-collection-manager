package com.ranthas.mtgmanager.dto.collection.card;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ModifyCardQuantityRequest {

    private final boolean foil;
    private final boolean addition;

    @JsonCreator
    public ModifyCardQuantityRequest(
            @JsonProperty("foil") boolean foil,
            @JsonProperty("addition") boolean addition
    ) {
        this.foil = foil;
        this.addition = addition;
    }

    public boolean isFoil() {
        return foil;
    }

    public boolean isAddition() {
        return addition;
    }
}
