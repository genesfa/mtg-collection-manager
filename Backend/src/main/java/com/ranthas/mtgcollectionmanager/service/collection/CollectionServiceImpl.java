package com.ranthas.mtgcollectionmanager.service.collection;

import com.ranthas.mtgcollectionmanager.dto.CardQuantity;
import com.ranthas.mtgcollectionmanager.entity.Card;
import com.ranthas.mtgcollectionmanager.entity.Set;
import com.ranthas.mtgcollectionmanager.repository.collection.CardRepository;
import com.ranthas.mtgcollectionmanager.repository.collection.SetRepository;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionServiceImpl implements CollectionService {

    private final SetRepository setRepository;
    private final CardRepository cardRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectionServiceImpl.class);

    public CollectionServiceImpl(
            SetRepository setRepository,
            CardRepository cardRepository
    ) {
        this.setRepository = setRepository;
        this.cardRepository = cardRepository;
    }

    @Override
    public List<Set> findSets() {
        return setRepository.findAll();
    }
    @Override
    public List<Card> findCardsInSet(String setId) {
        return cardRepository.findAllBySetId(setId);
    }

    @Override
    public Card modifyCardQuantity(String cardId, CardQuantity request) {

        Card card = cardRepository.findById(new ObjectId(cardId)).get();
        card.setFoilQuantity(request.getFoil());
        card.setNonFoilQuantity(request.getNonFoil());

        return cardRepository.save(card);
    }
}
