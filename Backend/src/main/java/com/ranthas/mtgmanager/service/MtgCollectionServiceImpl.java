package com.ranthas.mtgmanager.service;

import com.ranthas.mtgmanager.converter.CardResourceConverter;
import com.ranthas.mtgmanager.converter.SetResourceConverter;
import com.ranthas.mtgmanager.dto.collection.card.CardResource;
import com.ranthas.mtgmanager.dto.collection.set.SetResource;
import com.ranthas.mtgmanager.entity.MtgCard;
import com.ranthas.mtgmanager.entity.MtgSet;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MtgCollectionServiceImpl implements MtgCollectionService {

    private final H2Service h2Service;
    private final SetResourceConverter setResourceConverter;
    private final CardResourceConverter cardResourceConverter;

    public MtgCollectionServiceImpl(
            H2Service h2Service,
            SetResourceConverter setResourceConverter,
            CardResourceConverter cardResourceConverter
    ) {
        this.h2Service = h2Service;
        this.setResourceConverter = setResourceConverter;
        this.cardResourceConverter = cardResourceConverter;
    }

    @Override
    public List<SetResource> findAllSets() {
        return h2Service
                .findAllSets()
                .parallelStream()
                .map(setResourceConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public SetResource findSetByCode(String code) {
        MtgSet set = h2Service.findSetByCode(code);
        return setResourceConverter.convert(set);
    }

    @Override
    public List<CardResource> findCardsInSet(String setCode) {

        MtgSet set = h2Service.findSetByCode(setCode);
        List<MtgCard> cards = h2Service.findAllCardsBySet(set);

        return cards.parallelStream().map(cardResourceConverter::convert).collect(Collectors.toList());
    }

    @Override
    public CardResource findCardById(long cardId) {
        return cardResourceConverter.convert(h2Service.findCardById(cardId));
    }

    @Override
    public CardResource modifyCollection(long cardId, boolean isAddition, boolean isFoil) {

        MtgCard card = h2Service.findCardById(cardId);
        card.modifyQuantity(isAddition, isFoil);
        MtgCard saved = h2Service.saveCard(card);

        return cardResourceConverter.convert(saved);
    }
}
