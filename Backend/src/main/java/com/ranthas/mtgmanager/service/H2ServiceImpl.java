package com.ranthas.mtgmanager.service;

import com.ranthas.mtgmanager.entity.MtgCard;
import com.ranthas.mtgmanager.entity.MtgSet;
import com.ranthas.mtgmanager.repository.h2.MtgCardRepository;
import com.ranthas.mtgmanager.repository.h2.MtgSetRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class H2ServiceImpl implements H2Service {

    private final MtgSetRepository mtgSetRepository;
    private final MtgCardRepository mtgCardRepository;

    public H2ServiceImpl(MtgSetRepository mtgSetRepository, MtgCardRepository mtgCardRepository) {
        this.mtgSetRepository = mtgSetRepository;
        this.mtgCardRepository = mtgCardRepository;
    }

    @Override
    public List<MtgSet> findAllSets() {
        return mtgSetRepository.findAll(Sort.by("releasedAt"));
    }

    @Override
    public MtgSet findSetByCode(String code) {
        return mtgSetRepository.findByCode(code).get(); // TODO 23/05/2022 Rubén: Controlar 404
    }

    @Override
    public boolean setExists(String code) {
        return mtgSetRepository.findByCode(code).isPresent();
    }

    @Override
    public MtgSet saveSet(MtgSet mtgSet) {
        return mtgSetRepository.save(mtgSet);
    }

    @Override
    public MtgCard saveCard(MtgCard mtgCard) {
        return mtgCardRepository.save(mtgCard);
    }

    @Override
    public List<MtgCard> findAllCardsBySet(MtgSet mtgSet) {
        return mtgCardRepository.findAllCardsBySet(mtgSet);
    }

    @Override
    public MtgCard findCardById(Long id) {
        return mtgCardRepository.findById(id).orElseThrow(() -> new RuntimeException("asdfasdf")); // TODO 04/06/2022 Rubén: Better exception here
    }
}
