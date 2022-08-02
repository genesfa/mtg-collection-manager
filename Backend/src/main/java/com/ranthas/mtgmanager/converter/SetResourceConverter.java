package com.ranthas.mtgmanager.converter;

import com.ranthas.mtgmanager.dto.collection.set.SetResource;
import com.ranthas.mtgmanager.entity.MtgSet;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SetResourceConverter implements Converter<MtgSet, SetResource> {

    @Override
    public SetResource convert(MtgSet source) {
        return new SetResource(
                source.getName(),
                source.getCode(),
                source.getReleasedAt(),
                source.getIconUri(),
                source.getCardCount()
        );
    }
}
