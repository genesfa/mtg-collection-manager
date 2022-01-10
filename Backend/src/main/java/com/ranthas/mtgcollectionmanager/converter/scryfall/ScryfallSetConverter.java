package com.ranthas.mtgcollectionmanager.converter.scryfall;

import com.ranthas.mtgcollectionmanager.dto.resource.SetResource;
import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSet;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ScryfallSetConverter implements Converter<ScryfallSet, SetResource> {

    @Override
    public SetResource convert(ScryfallSet source) {
        return new SetResource(
                source.getId(),
                source.getName(),
                source.getCode(),
                source.getReleasedAt(),
                source.getIconURI(),
                source.getCardCount()
        );
    }
}
