package com.ranthas.mtgmanager.service;

import com.ranthas.mtgmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgmanager.dto.scryfall.set.ScryfallSet;
import com.ranthas.mtgmanager.repository.scryfall.ScryfallRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScryfallServiceImpl implements ScryfallService {

    private final ScryfallRepository scryfallRepository;

    public ScryfallServiceImpl(ScryfallRepository scryfallRepository) {
        this.scryfallRepository = scryfallRepository;
    }

    @Override
    public List<ScryfallSet> findAllSets() {
        return scryfallRepository.findAllSets().getData();
    }

    @Override
    public ScryfallSet findSetById(String id) {
        return scryfallRepository.findSetById(id);
    }

    @Override
    public ScryfallSet findSetByCode(String code) {
        return scryfallRepository.findSetByCode(code);
    }

    @Override
    public List<ScryfallCard> findAllCardsFromSet(String setCode) {
        return scryfallRepository.findAllCardsBySet(setCode);
    }

    @Override
    public ScryfallCard findCardById(String id) {
        return scryfallRepository.findCardById(id);
    }
}
