package com.ranthas.mtgcollectionmanager.converter.collection.concrete;

import com.ranthas.mtgcollectionmanager.dto.resource.CardImageResource;
import com.ranthas.mtgcollectionmanager.dto.resource.CardResource;
import com.ranthas.mtgcollectionmanager.entity.Card;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CollectionCardConverter implements Converter<Card, CardResource> {

    @Override
    public CardResource convert(Card source) {

        Double nonFoilPrice = null;
        Double foilPrice = null;
        String manaCost = "-";
        CardImageResource cardImageResource = new CardImageResource(source.getData().getCardImageURLs());

        if (source.getData().getCardPrice().getEur() != null) {
            nonFoilPrice = Double.parseDouble(source.getData().getCardPrice().getEur());
        }

        if (source.getData().getCardPrice().getEurFoil() != null) {
            foilPrice = Double.parseDouble(source.getData().getCardPrice().getEurFoil());
        }

        if (source.getData().getManaCost() != null) {
            manaCost = source.getData().getManaCost();
        }

        return new CardResource(
                source.getId().toHexString(),
                source.getData().getName(),
                cardImageResource,
                source.getData().getTypeLine(),
                manaCost,
                source.getData().getRarity(),
                source.getData().getCollectorNumber(),
                nonFoilPrice,
                foilPrice,
                source.getNonFoilQuantity(),
                source.getFoilQuantity(),
                source.getData().getColors()
        );
    }
}
