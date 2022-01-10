package com.ranthas.mtgcollectionmanager.controller;

import com.ranthas.mtgcollectionmanager.constant.Endpoint;
import com.ranthas.mtgcollectionmanager.converter.collection.CollectionConverter;
import com.ranthas.mtgcollectionmanager.dto.CardQuantity;
import com.ranthas.mtgcollectionmanager.dto.resource.CardResource;
import com.ranthas.mtgcollectionmanager.dto.resource.SetResource;
import com.ranthas.mtgcollectionmanager.service.collection.CollectionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
public class CollectionController {

    private final CollectionService collectionService;
    private final CollectionConverter collectionConverter;

    public CollectionController(
            CollectionService collectionService,
            CollectionConverter collectionConverter
    ) {
        this.collectionService = collectionService;
        this.collectionConverter = collectionConverter;
    }

    @GetMapping(Endpoint.COLLECTION_SETS)
    @ResponseStatus(HttpStatus.OK)
    public List<SetResource> findSets() {
        return collectionService
                .findSets()
                .stream()
                .map(collectionConverter::convertSet)
                .sorted()
                .collect(Collectors.toList());
    }

    @GetMapping(Endpoint.COLLECTION_CARDS_BY_SET)
    @ResponseStatus(HttpStatus.OK)
    public List<CardResource> findCardsBySet(@PathVariable String setId) {
        return collectionService
                .findCardsInSet(setId)
                .stream()
                .map(collectionConverter::convertCard)
                .collect(Collectors.toList());
    }

    @PutMapping(Endpoint.COLLECTION_CARD_BY_ID)
    @ResponseStatus(HttpStatus.OK)
    public CardResource modifyCardQuantity(@PathVariable String id, @RequestBody CardQuantity request) {
        return collectionConverter.convertCard(collectionService.modifyCardQuantity(id, request));
    }
}
