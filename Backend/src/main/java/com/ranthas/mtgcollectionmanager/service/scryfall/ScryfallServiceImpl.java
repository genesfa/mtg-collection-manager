package com.ranthas.mtgcollectionmanager.service.scryfall;

import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSet;
import com.ranthas.mtgcollectionmanager.repository.scryfall.ScryfallRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScryfallServiceImpl implements ScryfallService {

    private final ScryfallRepository scryfallRepository;

    public ScryfallServiceImpl(ScryfallRepository scryfallRepository) {
        this.scryfallRepository = scryfallRepository;
    }

    @Override
    public List<ScryfallSet> findAllSets() {
        return scryfallRepository
                .findAllSets()
                .parallelStream()
                .filter(ScryfallSet::isValid)
                .collect(Collectors.toList());
    }
}
