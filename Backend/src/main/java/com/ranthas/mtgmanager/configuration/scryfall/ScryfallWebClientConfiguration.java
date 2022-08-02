package com.ranthas.mtgmanager.configuration.scryfall;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.util.function.Function;

@Configuration
public class ScryfallWebClientConfiguration {

    private final WebClient.Builder builder;

    public ScryfallWebClientConfiguration(WebClient.Builder builder) {
        this.builder = builder;
    }

    public WebClient buildWebClient(String baseURL, Integer codecMaxInMemorySize) {
        return builder
                .baseUrl(baseURL)
                .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(codecMaxInMemorySize))
                .build();
    }

    public Function<UriBuilder, URI> buildCardSearchBySetCodeURL(String cardSearchURL, String setCode) {
        return uriBuilder ->
                uriBuilder
                        .path(cardSearchURL)
                        .queryParam("order", "set")
                        .queryParam("q", String.format("e:%s", setCode))
                        .queryParam("unique", "prints")
                        .build();
    }
}
