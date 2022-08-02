package com.ranthas.mtgmanager.converter;

import com.ranthas.mtgmanager.dto.scryfall.set.ScryfallSet;
import com.ranthas.mtgmanager.entity.MtgSet;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ScryfallSetConverter implements Converter<ScryfallSet, MtgSet> {

    @Override
    public MtgSet convert(ScryfallSet source) {

        MtgSet mtgSet = new MtgSet();

        mtgSet.setScryfallId(source.getId());
        mtgSet.setCode(source.getCode());
        mtgSet.setName(source.getName());
        mtgSet.setReleasedAt(source.getReleasedAt());
        mtgSet.setCardCount(source.getCardCount());
        mtgSet.setIconUri(source.getIconURI());

        return mtgSet;
    }
}
