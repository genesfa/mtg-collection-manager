package com.ranthas.mtgcollectionmanager.converter.collection.concrete;

import com.ranthas.mtgcollectionmanager.constant.Constant;
import com.ranthas.mtgcollectionmanager.dto.resource.SetResource;
import com.ranthas.mtgcollectionmanager.entity.Set;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CollectionSetConverter implements Converter<Set, SetResource> {

    @Override
    public SetResource convert(Set source) {
        return new SetResource(
                source.getId().toHexString(),
                source.getData().getName(),
                source.getData().getCode(),
                source.getData().getReleasedAt(),
                Objects.requireNonNullElse(source.getData().getIconURI(), Constant.IMAGE_NOT_AVAILABLE),
                source.getData().getCardCount(),
                source.getLastUpdate()
        );
    }
}
