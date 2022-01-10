package com.ranthas.mtgcollectionmanager.converter.scryfall;

import com.ranthas.mtgcollectionmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgcollectionmanager.entity.Card;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ScryfallCardConverter implements Converter<ScryfallCard, Card> {

    // TODO 01/01/2022 Rubén: Falta por hacer

    @Override
    public Card convert(ScryfallCard source) {
        return null;
    }
}
