package com.ranthas.mtgcollectionmanager.controller;

import com.ranthas.mtgcollectionmanager.constant.Endpoint;
import com.ranthas.mtgcollectionmanager.service.statistics.StatisticsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class StatisticController {

    /**
     * Total cards
     * Total sets
     * Total cards owned
     * Percent cards owned
     * Playsets
     * Stats by set
     * Total cards price
     * Total cards foil price
     * Total owned cards price
     */

    private final StatisticsService statisticsService;

    public StatisticController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping(Endpoint.NON_FOIL_OWNED_CARDS_BY_SET)
    @ResponseStatus(HttpStatus.OK)
    public long nonFoilOwnedCardsBySet(@PathVariable String setId) {
        return statisticsService.calculateNonFoilOwnedCardsBySet(setId);
    }

    @GetMapping(Endpoint.FOIL_OWNED_CARDS_BY_SET)
    @ResponseStatus(HttpStatus.OK)
    public long foilOwnedCardsBySet(@PathVariable String setId) {
        return statisticsService.calculateFoilOwnedCardsBySet(setId);
    }

    @GetMapping(Endpoint.DIFFERENT_OWNED_CARDS_BY_SET)
    @ResponseStatus(HttpStatus.OK)
    public long differentOwnedCardsBySet(@PathVariable String setId) {
        return statisticsService.calculateDifferentOwnedCards(setId);
    }
}
