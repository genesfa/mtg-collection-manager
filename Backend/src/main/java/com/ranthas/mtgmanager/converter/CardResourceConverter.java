package com.ranthas.mtgmanager.converter;

import com.ranthas.mtgmanager.dto.collection.card.CardResource;
import com.ranthas.mtgmanager.entity.MtgCard;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CardResourceConverter implements Converter<MtgCard, CardResource> {

    @Override
    public CardResource convert(MtgCard source) {
        return null;
    }
}
