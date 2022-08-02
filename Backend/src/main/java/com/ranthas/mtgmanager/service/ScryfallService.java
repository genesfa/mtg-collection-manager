package com.ranthas.mtgmanager.service;

import com.ranthas.mtgmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgmanager.dto.scryfall.set.ScryfallSet;

import java.util.List;

public interface ScryfallService {

    List<ScryfallSet> findAllSets();

    ScryfallSet findSetById(String id);

    ScryfallSet findSetByCode(String code);

    List<ScryfallCard> findAllCardsFromSet(String setCode);

    ScryfallCard findCardById(String id);
}
