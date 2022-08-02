package com.ranthas.mtgmanager.dto.collection.card;

import com.ranthas.mtgmanager.constant.Constant;
import com.ranthas.mtgmanager.dto.scryfall.card.CardImageURL;

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
