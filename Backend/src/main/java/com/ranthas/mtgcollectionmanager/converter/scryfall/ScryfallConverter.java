package com.ranthas.mtgcollectionmanager.converter.scryfall;

import com.ranthas.mtgcollectionmanager.dto.resource.SetResource;
import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSet;

public interface ScryfallConverter {

    SetResource convertSet(ScryfallSet set);
}
