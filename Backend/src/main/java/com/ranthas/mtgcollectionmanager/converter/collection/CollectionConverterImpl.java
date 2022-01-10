package com.ranthas.mtgcollectionmanager.converter.collection;

import com.ranthas.mtgcollectionmanager.converter.collection.concrete.CollectionCardConverter;
import com.ranthas.mtgcollectionmanager.converter.collection.concrete.CollectionSetConverter;
import com.ranthas.mtgcollectionmanager.dto.resource.CardResource;
import com.ranthas.mtgcollectionmanager.dto.resource.SetResource;
import com.ranthas.mtgcollectionmanager.entity.Card;
import com.ranthas.mtgcollectionmanager.entity.Set;
import org.springframework.stereotype.Component;

@Component
public class CollectionConverterImpl implements CollectionConverter {

    private final CollectionSetConverter collectionSetConverter;
    private final CollectionCardConverter collectionCardConverter;

    public CollectionConverterImpl(
            CollectionSetConverter collectionSetConverter,
            CollectionCardConverter collectionCardConverter
    ) {
        this.collectionSetConverter = collectionSetConverter;
        this.collectionCardConverter = collectionCardConverter;
    }

    @Override
    public SetResource convertSet(Set set) {
        return collectionSetConverter.convert(set);
    }

    @Override
    public CardResource convertCard(Card card) {
        return collectionCardConverter.convert(card);
    }
}
