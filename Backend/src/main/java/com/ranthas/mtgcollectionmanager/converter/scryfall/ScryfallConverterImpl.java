package com.ranthas.mtgcollectionmanager.converter.scryfall;

import com.ranthas.mtgcollectionmanager.dto.resource.SetResource;
import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSet;
import org.springframework.stereotype.Component;

@Component
public class ScryfallConverterImpl implements ScryfallConverter {

    private final ScryfallSetConverter scryfallSetConverter;

    public ScryfallConverterImpl(ScryfallSetConverter scryfallSetConverter) {
        this.scryfallSetConverter = scryfallSetConverter;
    }

    @Override
    public SetResource convertSet(ScryfallSet set) {
        return scryfallSetConverter.convert(set);
    }
}
