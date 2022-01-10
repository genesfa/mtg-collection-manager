package com.ranthas.mtgcollectionmanager.service.collection;

import com.ranthas.mtgcollectionmanager.dto.CardQuantity;
import com.ranthas.mtgcollectionmanager.entity.Card;
import com.ranthas.mtgcollectionmanager.entity.Set;

import java.util.List;

public interface CollectionService {

    List<Set> findSets();

    List<Card> findCardsInSet(String setId);

    Card modifyCardQuantity(String cardId, CardQuantity request);
}
