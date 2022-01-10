package com.ranthas.mtgcollectionmanager.dto.scryfall.card;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardLegality {

    @JsonProperty("standard")
    private String standard;

    @JsonProperty("future")
    private String future;

    @JsonProperty("historic")
    private String historic;

    @JsonProperty("gladiator")
    private String gladiator;

    @JsonProperty("pioneer")
    private String pioneer;

    @JsonProperty("modern")
    private String modern;

    @JsonProperty("legacy")
    private String legacy;

    @JsonProperty("pauper")
    private String pauper;

    @JsonProperty("vintage")
    private String vintage;

    @JsonProperty("penny")
    private String penny;

    @JsonProperty("commander")
    private String commander;

    @JsonProperty("brawl")
    private String brawl;

    @JsonProperty("historicBrawl")
    private String historicBrawl;

    @JsonProperty("paupercommander")
    private String pauperCommander;

    @JsonProperty("duel")
    private String duel;

    @JsonProperty("oldschool")
    private String oldschool;

    @JsonProperty("premodern")
    private String premodern;

    public CardLegality() {
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }

    public String getHistoric() {
        return historic;
    }

    public void setHistoric(String historic) {
        this.historic = historic;
    }

    public String getGladiator() {
        return gladiator;
    }

    public void setGladiator(String gladiator) {
        this.gladiator = gladiator;
    }

    public String getPioneer() {
        return pioneer;
    }

    public void setPioneer(String pioneer) {
        this.pioneer = pioneer;
    }

    public String getModern() {
        return modern;
    }

    public void setModern(String modern) {
        this.modern = modern;
    }

    public String getLegacy() {
        return legacy;
    }

    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

    public String getPauper() {
        return pauper;
    }

    public void setPauper(String pauper) {
        this.pauper = pauper;
    }

    public String getVintage() {
        return vintage;
    }

    public void setVintage(String vintage) {
        this.vintage = vintage;
    }

    public String getPenny() {
        return penny;
    }

    public void setPenny(String penny) {
        this.penny = penny;
    }

    public String getCommander() {
        return commander;
    }

    public void setCommander(String commander) {
        this.commander = commander;
    }

    public String getBrawl() {
        return brawl;
    }

    public void setBrawl(String brawl) {
        this.brawl = brawl;
    }

    public String getHistoricBrawl() {
        return historicBrawl;
    }

    public void setHistoricBrawl(String historicBrawl) {
        this.historicBrawl = historicBrawl;
    }

    public String getPauperCommander() {
        return pauperCommander;
    }

    public void setPauperCommander(String pauperCommander) {
        this.pauperCommander = pauperCommander;
    }

    public String getDuel() {
        return duel;
    }

    public void setDuel(String duel) {
        this.duel = duel;
    }

    public String getOldschool() {
        return oldschool;
    }

    public void setOldschool(String oldschool) {
        this.oldschool = oldschool;
    }

    public String getPremodern() {
        return premodern;
    }

    public void setPremodern(String premodern) {
        this.premodern = premodern;
    }
}
