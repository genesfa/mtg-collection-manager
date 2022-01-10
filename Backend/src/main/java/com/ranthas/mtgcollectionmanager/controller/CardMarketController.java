package com.ranthas.mtgcollectionmanager.controller;

import com.ranthas.mtgcollectionmanager.constant.Endpoint;
import com.ranthas.mtgcollectionmanager.dto.cardmarket.product.ProductResponse;
import com.ranthas.mtgcollectionmanager.dto.cardmarket.wants_list.WantsList;
import com.ranthas.mtgcollectionmanager.service.cardmarket.CardMarketService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CardMarketController {

    private final CardMarketService cardMarketService;

    public CardMarketController(CardMarketService cardMarketService) {
        this.cardMarketService = cardMarketService;
    }

    @GetMapping(Endpoint.CARDMARKET_WANTLISTS)
    @ResponseStatus(HttpStatus.OK)
    public List<WantsList> findWantLists() {
        return cardMarketService.findAllWantsLists();
    }

    @GetMapping(Endpoint.CARDMARKET_WANTLIST_BY_ID)
    @ResponseStatus(HttpStatus.OK)
    public WantsList findWantListById(@PathVariable int id) {
        return cardMarketService.findWantsListById(id);
    }

    @GetMapping(Endpoint.CARDMARKET_PRODUCT_BY_ID)
    @ResponseStatus(HttpStatus.OK)
    public ProductResponse findProductById(@PathVariable int id) {
        return cardMarketService.findProductById(id);
    }
}
