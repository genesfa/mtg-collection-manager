package com.ranthas.mtgmanager.configuration.scryfall;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:scryfall.properties")
public class ScryfallConfiguration {

    @Value("${com.ranthas.scryfall.base-url}")
    private String baseURL;

    @Value("${com.ranthas.scryfall.sets-url}")
    private String setsURL;

    @Value("${com.ranthas.scryfall.set-by-id-url}")
    private String setByIdURL;

    @Value("${com.ranthas.scryfall.set-by-code-url}")
    private String setByCodeURL;

    @Value("${com.ranthas.scryfall.card-search-url}")
    private String cardSearchURL;

    @Value("${com.ranthas.scryfall.codec-max-size-in-memory}")
    private Integer codecMaxSizeInMemory;

    @Value("${com.ranthas.scryfall.card-by-id-url}")
    private String cardByIdURL;

    public ScryfallConfiguration() {
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getSetsURL() {
        return setsURL;
    }

    public void setSetsURL(String setsURL) {
        this.setsURL = setsURL;
    }

    public String getSetByIdURL() {
        return setByIdURL;
    }

    public void setSetByIdURL(String setByIdURL) {
        this.setByIdURL = setByIdURL;
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

    public Integer getCodecMaxSizeInMemory() {
        return codecMaxSizeInMemory;
    }

    public void setCodecMaxSizeInMemory(Integer codecMaxSizeInMemory) {
        this.codecMaxSizeInMemory = codecMaxSizeInMemory;
    }

    public String getCardByIdURL() {
        return cardByIdURL;
    }

    public void setCardByIdURL(String cardByIdURL) {
        this.cardByIdURL = cardByIdURL;
    }
}
