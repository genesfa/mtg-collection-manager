package com.ranthas.mtgcollectionmanager.converter.collection;

import com.ranthas.mtgcollectionmanager.dto.resource.CardResource;
import com.ranthas.mtgcollectionmanager.dto.resource.SetResource;
import com.ranthas.mtgcollectionmanager.entity.Card;
import com.ranthas.mtgcollectionmanager.entity.Set;

public interface CollectionConverter {

    SetResource convertSet(Set set);

    CardResource convertCard(Card card);
}
