package com.ranthas.mtgmanager.repository.scryfall;

import com.ranthas.mtgmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgmanager.dto.scryfall.set.ScryfallSet;
import com.ranthas.mtgmanager.dto.scryfall.set.ScryfallSetsResponse;

import java.util.List;

public interface ScryfallRepository {

    ScryfallSetsResponse findAllSets();

    ScryfallSet findSetById(String id);

    ScryfallSet findSetByCode(String code);

    List<ScryfallCard> findAllCardsBySet(String setCode);

    ScryfallCard findCardById(String id);
}
