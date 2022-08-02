package com.ranthas.mtgmanager.controller;

import com.ranthas.mtgmanager.constant.Endpoint;
import com.ranthas.mtgmanager.dto.collection.card.CardResource;
import com.ranthas.mtgmanager.dto.collection.card.ModifyCardQuantityRequest;
import com.ranthas.mtgmanager.dto.collection.set.SetResource;
import com.ranthas.mtgmanager.service.MtgCollectionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MtgCollectionController {

    private final MtgCollectionService mtgCollectionService;

    public MtgCollectionController(MtgCollectionService mtgCollectionService) {
        this.mtgCollectionService = mtgCollectionService;
    }

    @GetMapping(value = Endpoint.SETS, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<SetResource> findAllSets() {
        return mtgCollectionService.findAllSets();
    }

    @GetMapping(value = Endpoint.SET_BY_CODE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public SetResource findSetByCode(@PathVariable String code) {
        return mtgCollectionService.findSetByCode(code);
    }

    @GetMapping(value = Endpoint.CARDS_BY_SET_CODE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<CardResource> findSetCardsByCode(@PathVariable String code) {
        return mtgCollectionService.findCardsInSet(code);
    }

    @GetMapping(value = Endpoint.CARDS_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public CardResource findCardById(@PathVariable Long id) {
        return mtgCollectionService.findCardById(id);
    }

    @PutMapping(value = Endpoint.CARDS_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public CardResource modifyCollection(@PathVariable Long id, @RequestBody ModifyCardQuantityRequest request) {
        return mtgCollectionService.modifyCollection(id, request.isAddition(), request.isFoil());
    }
}
