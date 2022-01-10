package com.ranthas.mtgcollectionmanager.repository.scryfall;

import com.ranthas.mtgcollectionmanager.configuration.scryfall.ScryfallConfiguration;
import com.ranthas.mtgcollectionmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgcollectionmanager.dto.scryfall.card.ScryfallCardsResponse;
import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSet;
import com.ranthas.mtgcollectionmanager.dto.scryfall.set.ScryfallSetsResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ScryfallRepositoryImpl implements ScryfallRepository {

    private final ScryfallConfiguration configuration;
    private final RestTemplate restTemplate;

    public ScryfallRepositoryImpl(
            ScryfallConfiguration configuration,
            RestTemplate restTemplate
    ) {
        this.configuration = configuration;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<ScryfallSet> findAllSets() {
        return restTemplate.getForObject(configuration.getSetsURL(), ScryfallSetsResponse.class).getData();
    }

    @Override
    public ScryfallSet findSetByCode(String code) {
        return restTemplate.getForObject(configuration.getSetByCodeURL(), ScryfallSet.class, code);
    }

    @Override
    public List<ScryfallCard> findAllCardsBySet(String setCode) {

        ScryfallCardsResponse response =
                restTemplate.getForObject(configuration.getCardSearchURL(), ScryfallCardsResponse.class, "set:" + setCode);

        List<ScryfallCard> cards = new ArrayList<>(response.getData());

        while (response.isHasMore()) {
            response = restTemplate.getForObject(response.getNextPage().replace("%3A", ":"), ScryfallCardsResponse.class);
            cards.addAll(response.getData());
        }

        return cards;
    }
}
