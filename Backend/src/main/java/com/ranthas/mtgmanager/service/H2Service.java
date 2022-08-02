package com.ranthas.mtgmanager.service;

import com.ranthas.mtgmanager.entity.MtgCard;
import com.ranthas.mtgmanager.entity.MtgSet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface H2Service {


    List<MtgSet> findAllSets();

    MtgSet findSetByCode(String code);

    boolean setExists(String code);

    MtgSet saveSet(MtgSet mtgSet);

    MtgCard saveCard(MtgCard mtgCard);

    List<MtgCard> findAllCardsBySet(MtgSet mtgSet);

    MtgCard findCardById(Long id);
}
