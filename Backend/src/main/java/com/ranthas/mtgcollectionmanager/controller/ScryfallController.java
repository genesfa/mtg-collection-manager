package com.ranthas.mtgcollectionmanager.controller;

import com.ranthas.mtgcollectionmanager.constant.Endpoint;
import com.ranthas.mtgcollectionmanager.converter.scryfall.ScryfallConverter;
import com.ranthas.mtgcollectionmanager.dto.resource.SetResource;
import com.ranthas.mtgcollectionmanager.service.scryfall.ScryfallService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
public class ScryfallController {

    private final ScryfallService scryfallService;
    private final ScryfallConverter scryfallConverter;

    public ScryfallController(
            ScryfallService scryfallService,
            ScryfallConverter scryfallConverter
    ) {
        this.scryfallService = scryfallService;
        this.scryfallConverter = scryfallConverter;
    }

    @GetMapping(Endpoint.SCRYFALL_SETS)
    @ResponseStatus(HttpStatus.OK)
    public List<SetResource> findAll() {
        return scryfallService
                .findAllSets()
                .stream()
                .map(scryfallConverter::convertSet)
                .sorted()
                .collect(Collectors.toList());
    }
}
