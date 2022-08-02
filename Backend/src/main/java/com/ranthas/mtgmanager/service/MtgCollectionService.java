package com.ranthas.mtgmanager.service;

import com.ranthas.mtgmanager.dto.collection.card.CardResource;
import com.ranthas.mtgmanager.dto.collection.set.SetResource;
import com.ranthas.mtgmanager.entity.MtgSet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface MtgCollectionService {

    List<SetResource> findAllSets();

    SetResource findSetByCode(String code);

    List<CardResource> findCardsInSet(String setCode);

    CardResource findCardById(long cardId);

    CardResource modifyCollection(long cardId, boolean isAddition, boolean isFoil);
}
