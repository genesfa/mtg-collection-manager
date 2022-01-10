package com.ranthas.mtgcollectionmanager.configuration.scryfall;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:scryfall.properties")
public class ScryfallConfiguration {

    @Value("${com.ranthas.scryfall.sets-url}")
    private String setsURL;

    @Value("${com.ranthas.scryfall.set-by-code-url}")
    private String setByCodeURL;

    @Value("${com.ranthas.scryfall.card-search-url}")
    private String cardSearchURL;

    public ScryfallConfiguration() {
    }

    public String getSetsURL() {
        return setsURL;
    }

    public void setSetsURL(String setsURL) {
        this.setsURL = setsURL;
    }

    public String getSetByCodeURL() {
        return setByCodeURL;
    }

    public void setSetByCodeURL(String setByCodeURL) {
        this.setByCodeURL = setByCodeURL;
    }

    public String getCardSearchURL() {
        return cardSearchURL;
    }

    public void setCardSearchURL(String cardSearchURL) {
        this.cardSearchURL = cardSearchURL;
    }
}
