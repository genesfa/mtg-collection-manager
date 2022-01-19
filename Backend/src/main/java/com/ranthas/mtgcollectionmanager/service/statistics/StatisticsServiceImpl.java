package com.ranthas.mtgcollectionmanager.service.statistics;

import com.ranthas.mtgcollectionmanager.entity.Card;
import com.ranthas.mtgcollectionmanager.repository.collection.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private final CardRepository cardRepository;

    public StatisticsServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public long calculateNonFoilOwnedCardsBySet(String setId) {
        return cardRepository
                .findAllNonFoilOwnedBySetId(setId)
                .size();
    }

    @Override
    public long calculateFoilOwnedCardsBySet(String setId) {
        return cardRepository
                .findAllFoilOwnedBySetId(setId)
                .size();
    }

    @Override
    public long calculateDifferentOwnedCards(String setId) {
        return cardRepository
                .findAllOwnedBySetId(setId)
                .size();
    }
}
