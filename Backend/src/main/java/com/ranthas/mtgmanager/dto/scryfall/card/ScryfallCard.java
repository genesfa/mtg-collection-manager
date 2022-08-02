package com.ranthas.mtgmanager.dto.scryfall.card;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ranthas.mtgmanager.constant.Constant;

import java.time.LocalDate;
import java.util.List;

public class ScryfallCard {

    @JsonProperty("arena_id")
    private Integer arenaId;

    @JsonProperty("object")
    private String object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("oracle_id")
    private String oracleId;

    @JsonProperty("multiverse_ids")
    private List<Integer> multiverseIds;

    @JsonProperty("tcgplayer_id")
    private Integer tcgplayerId;

    @JsonProperty("tcgplayer_etched_id")
    private Integer tcgplayerEtchedId;

    @JsonProperty("cardmarket_id")
    private Integer cardmarketId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("lang")
    private String lang;

    @JsonProperty("released_at")
    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private LocalDate releasedAt;

    @JsonProperty("mtgo_id")
    private Integer mtgoId;

    @JsonProperty("mtgo_foil_id")
    private Integer mtgoFoilId;

    @JsonProperty("prints_search_uri")
    private String printsSearchUri;

    @JsonProperty("rulings_uri")
    private String rulingsUri;

    @JsonProperty("scryfall_uri")
    private String scryfallUri;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("layout")
    private String layout;

    @JsonProperty("highres_image")
    private String highresImage;

    @JsonProperty("image_status")
    private String imageStatus;

    @JsonProperty("image_uris")
    private CardImageURL cardImageURLs;

    @JsonProperty("mana_cost")
    private String manaCost;

    @JsonProperty("cmc")
    private Double cmc;

    @JsonProperty("type_line")
    private String typeLine;

    @JsonProperty("oracle_text")
    private String oracleText;

    @JsonProperty("power")
    private String power;

    @JsonProperty("toughness")
    private String toughness;

    @JsonProperty("colors")
    private List<String> colors;

    @JsonProperty("color_identity")
    private List<String> colorIdentity;

    @JsonProperty("keywords")
    private List<String> keywords;

    @JsonProperty("legalities")
    private CardLegality legalities;

    @JsonProperty("games")
    private List<String> games;

    @JsonProperty("reserved")
    private boolean reserved;

    @JsonProperty("foil")
    private boolean foil;

    @JsonProperty("non_foil")
    private boolean nonFoil;

    @JsonProperty("card_faces")
    private List<CardFace> cardFaces;

    @JsonProperty("related_uris")
    private CardURL cardURLs;

    @JsonProperty("purchase_uris")
    private CardPurchaseURL cardPurchaseURLs;

    @JsonProperty("collector_number")
    private String collectorNumber;

    @JsonProperty("prices")
    private CardPrice cardPrice;

    @JsonProperty("set_id")
    private String setId;

    @JsonProperty("rarity")
    private String rarity;

    public ScryfallCard() {
    }

    public Integer getArenaId() {
        return arenaId;
    }

    public void setArenaId(Integer arenaId) {
        this.arenaId = arenaId;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOracleId() {
        return oracleId;
    }

    public void setOracleId(String oracleId) {
        this.oracleId = oracleId;
    }

    public List<Integer> getMultiverseIds() {
        return multiverseIds;
    }

    public void setMultiverseIds(List<Integer> multiverseIds) {
        this.multiverseIds = multiverseIds;
    }

    public Integer getTcgplayerId() {
        return tcgplayerId;
    }

    public void setTcgplayerId(Integer tcgplayerId) {
        this.tcgplayerId = tcgplayerId;
    }

    public Integer getTcgplayerEtchedId() {
        return tcgplayerEtchedId;
    }

    public void setTcgplayerEtchedId(Integer tcgplayerEtchedId) {
        this.tcgplayerEtchedId = tcgplayerEtchedId;
    }

    public Integer getCardmarketId() {
        return cardmarketId == null ? -1 : cardmarketId;
    }

    public void setCardmarketId(Integer cardmarketId) {
        this.cardmarketId = cardmarketId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public LocalDate getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(LocalDate releasedAt) {
        this.releasedAt = releasedAt;
    }

    public Integer getMtgoId() {
        return mtgoId;
    }

    public void setMtgoId(Integer mtgoId) {
        this.mtgoId = mtgoId;
    }

    public Integer getMtgoFoilId() {
        return mtgoFoilId;
    }

    public void setMtgoFoilId(Integer mtgoFoilId) {
        this.mtgoFoilId = mtgoFoilId;
    }

    public String getPrintsSearchUri() {
        return printsSearchUri;
    }

    public void setPrintsSearchUri(String printsSearchUri) {
        this.printsSearchUri = printsSearchUri;
    }

    public String getRulingsUri() {
        return rulingsUri;
    }

    public void setRulingsUri(String rulingsUri) {
        this.rulingsUri = rulingsUri;
    }

    public String getScryfallUri() {
        return scryfallUri;
    }

    public void setScryfallUri(String scryfallUri) {
        this.scryfallUri = scryfallUri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getHighresImage() {
        return highresImage;
    }

    public void setHighresImage(String highresImage) {
        this.highresImage = highresImage;
    }

    public String getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
    }

    public CardImageURL getCardImageURLs() {
        return cardImageURLs;
    }

    public void setCardImageURLs(CardImageURL cardImageURLs) {
        this.cardImageURLs = cardImageURLs;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public Double getCmc() {
        return cmc;
    }

    public void setCmc(Double cmc) {
        this.cmc = cmc;
    }

    public String getTypeLine() {
        return typeLine;
    }

    public void setTypeLine(String typeLine) {
        this.typeLine = typeLine;
    }

    public String getOracleText() {
        return oracleText;
    }

    public void setOracleText(String oracleText) {
        this.oracleText = oracleText;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public List<String> getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(List<String> colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public CardLegality getLegalities() {
        return legalities;
    }

    public void setLegalities(CardLegality legalities) {
        this.legalities = legalities;
    }

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isFoil() {
        return foil;
    }

    public void setFoil(boolean foil) {
        this.foil = foil;
    }

    public boolean isNonFoil() {
        return nonFoil;
    }

    public void setNonFoil(boolean nonFoil) {
        this.nonFoil = nonFoil;
    }

    public List<CardFace> getCardFaces() {
        return cardFaces;
    }

    public void setCardFaces(List<CardFace> cardFaces) {
        this.cardFaces = cardFaces;
    }

    public CardURL getCardURLs() {
        return cardURLs;
    }

    public void setCardURLs(CardURL cardURLs) {
        this.cardURLs = cardURLs;
    }

    public CardPurchaseURL getCardPurchaseURLs() {
        return cardPurchaseURLs;
    }

    public void setCardPurchaseURLs(CardPurchaseURL cardPurchaseURLs) {
        this.cardPurchaseURLs = cardPurchaseURLs;
    }

    public String getCollectorNumber() {
        return collectorNumber;
    }

    public void setCollectorNumber(String collectorNumber) {
        this.collectorNumber = collectorNumber;
    }

    public CardPrice getCardPrice() {
        return cardPrice;
    }

    public void setCardPrice(CardPrice cardPrice) {
        this.cardPrice = cardPrice;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public boolean isBasicLand() {
        return typeLine.toUpperCase().startsWith("BASIC LAND");
    }
}
