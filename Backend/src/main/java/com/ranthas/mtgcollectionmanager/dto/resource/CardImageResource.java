package com.ranthas.mtgcollectionmanager.dto.resource;

import com.ranthas.mtgcollectionmanager.constant.Constant;
import com.ranthas.mtgcollectionmanager.dto.scryfall.card.CardImageURL;

public class CardImageResource {

    private final String cropped;
    private final String normal;

    public CardImageResource(CardImageURL cardImageURL) {
        if (cardImageURL != null) {
            cropped = cardImageURL.getArtCrop();
            normal = cardImageURL.getNormal();
        } else {
            cropped = Constant.IMAGE_NOT_AVAILABLE;
            normal = Constant.IMAGE_NOT_AVAILABLE;
        }
    }

    public String getCropped() {
        return cropped;
    }

    public String getNormal() {
        return normal;
    }
}
