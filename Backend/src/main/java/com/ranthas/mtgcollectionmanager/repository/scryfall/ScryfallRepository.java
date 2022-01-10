package com.ranthas.mtgcollectionmanager.repository.scryfall;

import com.ranthas.mtgcollectionmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSet;

import java.util.List;

public interface ScryfallRepository {

    List<ScryfallSet> findAllSets();

    ScryfallSet findSetByCode(String code);

    List<ScryfallCard> findAllCardsBySet(String setCode);
}
