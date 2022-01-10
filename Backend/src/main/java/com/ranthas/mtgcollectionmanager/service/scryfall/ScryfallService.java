package com.ranthas.mtgcollectionmanager.service.scryfall;

import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSet;

import java.util.List;

public interface ScryfallService {

    List<ScryfallSet> findAllSets();
}
