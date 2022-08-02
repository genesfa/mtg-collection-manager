package com.ranthas.mtgmanager.service;

import com.ranthas.mtgmanager.converter.ScryfallCardConverter;
import com.ranthas.mtgmanager.converter.ScryfallSetConverter;
import com.ranthas.mtgmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgmanager.dto.scryfall.set.ScryfallSet;
import com.ranthas.mtgmanager.entity.MtgCard;
import com.ranthas.mtgmanager.entity.MtgSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    private final H2Service h2Service;
    private final ScryfallService scryfallService;
    private final ScryfallSetConverter scryfallSetConverter;
    private final ScryfallCardConverter scryfallCardConverter;

    private static final Logger LOGGER = LoggerFactory.getLogger(MaintenanceServiceImpl.class);

    public MaintenanceServiceImpl(
            H2Service h2Service,
            ScryfallService scryfallService,
            ScryfallSetConverter scryfallSetConverter,
            ScryfallCardConverter scryfallCardConverter
    ) {
        this.h2Service = h2Service;
        this.scryfallService = scryfallService;
        this.scryfallSetConverter = scryfallSetConverter;
        this.scryfallCardConverter = scryfallCardConverter;
    }

    @Override
    @Transactional
    public void loadNewSetsFromScryfall() {

        LOGGER.info("Looking for new sets in the Scryfall API");
        List<ScryfallSet> scryfallSets = scryfallService.findAllSets();

        for (ScryfallSet scryfallSet : scryfallSets) {
            if (!h2Service.setExists(scryfallSet.getCode()) && scryfallSet.isValid()) {

                LOGGER.info("New set found!! {} - {}", scryfallSet.getCode(), scryfallSet.getName());
                MtgSet mtgSet = scryfallSetConverter.convert(scryfallSet);

                LOGGER.info("Saving set {}", mtgSet.getName());
                MtgSet savedSet = h2Service.saveSet(mtgSet);

                List<ScryfallCard> scryfallcards = scryfallService.findAllCardsFromSet(scryfallSet.getCode());
                for (ScryfallCard scryfallCard : scryfallcards) {
                    LOGGER.info("Adding card {} to set {}", scryfallCard.getName(), savedSet.getName());
                    MtgCard mtgCard = scryfallCardConverter.convert(scryfallCard);
                    mtgCard.setMtgSet(savedSet);
                    h2Service.saveCard(mtgCard);
                }
            }
        }
    }
}
