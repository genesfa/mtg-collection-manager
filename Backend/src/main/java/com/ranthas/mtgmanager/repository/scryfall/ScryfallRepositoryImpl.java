package com.ranthas.mtgmanager.repository.scryfall;

import com.ranthas.mtgmanager.configuration.scryfall.ScryfallConfiguration;
import com.ranthas.mtgmanager.configuration.scryfall.ScryfallWebClientConfiguration;
import com.ranthas.mtgmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgmanager.dto.scryfall.card.ScryfallCardsResponse;
import com.ranthas.mtgmanager.dto.scryfall.set.ScryfallSet;
import com.ranthas.mtgmanager.dto.scryfall.set.ScryfallSetsResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ScryfallRepositoryImpl implements ScryfallRepository {

    private final ScryfallConfiguration configuration;
    private final ScryfallWebClientConfiguration webClientConfiguration;
    private final WebClient webClient;

    public ScryfallRepositoryImpl(ScryfallConfiguration configuration, ScryfallWebClientConfiguration webClientConfiguration) {
        this.configuration = configuration;
        this.webClientConfiguration = webClientConfiguration;
        this.webClient = webClientConfiguration.buildWebClient(configuration.getBaseURL(), configuration.getCodecMaxSizeInMemory());
    }

    @Override
    public ScryfallSetsResponse findAllSets() {
        return webClient
                .get()
                .uri(configuration.getSetsURL())
                .retrieve()
                .bodyToMono(ScryfallSetsResponse.class)
                .block();
    }

    @Override
    public ScryfallSet findSetById(String id) {
        return webClient
                .get()
                .uri(configuration.getSetByIdURL(), id)
                .retrieve()
                .bodyToMono(ScryfallSet.class)
                .block();
    }

    @Override
    public ScryfallSet findSetByCode(String code) {
        return webClient
                .get()
                .uri(configuration.getSetByCodeURL(), code)
                .retrieve()
                .bodyToMono(ScryfallSet.class)
                .block();
    }

    @Override
    public List<ScryfallCard> findAllCardsBySet(String setCode) {

        List<ScryfallCard> data = new ArrayList<>();
        ScryfallCardsResponse response =
                webClient
                        .get()
                        .uri(webClientConfiguration.buildCardSearchBySetCodeURL(configuration.getCardSearchURL(), setCode))
                        .retrieve()
                        .bodyToMono(ScryfallCardsResponse.class)
                        .block();

        data.addAll(response.getData());

        while (response.isHasMore()) {
            String nextURL = response.getNextPage().replace("%3A", ":");
            response = webClient.get().uri(nextURL).retrieve().bodyToMono(ScryfallCardsResponse.class).block();
            data.addAll(response.getData());
        }

        return data;
    }

    @Override
    public ScryfallCard findCardById(String id) {
        return webClient
                .get()
                .uri(configuration.getCardSearchURL(), id)
                .retrieve()
                .bodyToMono(ScryfallCard.class)
                .block();
    }
}
