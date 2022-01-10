package com.ranthas.mtgcollectionmanager.dto.scryfall.set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ranthas.mtgcollectionmanager.constant.Constant;

import java.time.LocalDate;

public class ScryfallSet {

    @JsonProperty("object")
    private String object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("code")
    private String code;

    @JsonProperty("mtgo_code")
    private String mtgoCode;

    @JsonProperty("tcgplayer_id")
    private String tcgplayerId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("set_type")
    private String setType;

    @JsonProperty("released_at")
    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private LocalDate releasedAt;

    @JsonProperty("block_code")
    private String blockCode;

    @JsonProperty("block")
    private String block;

    @JsonProperty("parent_set_code")
    private String parentSetCode;

    @JsonProperty("card_count")
    private int cardCount;

    @JsonProperty("printed_size")
    private Integer printedSize;

    @JsonProperty("digital")
    private boolean digital;

    @JsonProperty("foil_only")
    private boolean foilOnly;

    @JsonProperty("non_foil_only")
    private boolean nonFoilOnly;

    @JsonProperty("scryfall_uri")
    private String scryfallUri;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("icon_svg_uri")
    private String iconURI;

    @JsonProperty("search_uri")
    private String searchUri;

    public ScryfallSet() {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMtgoCode() {
        return mtgoCode;
    }

    public void setMtgoCode(String mtgoCode) {
        this.mtgoCode = mtgoCode;
    }

    public String getTcgplayerId() {
        return tcgplayerId;
    }

    public void setTcgplayerId(String tcgplayerId) {
        this.tcgplayerId = tcgplayerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetType() {
        return setType;
    }

    public void setSetType(String setType) {
        this.setType = setType;
    }

    public LocalDate getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(LocalDate releasedAt) {
        this.releasedAt = releasedAt;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getParentSetCode() {
        return parentSetCode;
    }

    public void setParentSetCode(String parentSetCode) {
        this.parentSetCode = parentSetCode;
    }

    public int getCardCount() {
        return cardCount;
    }

    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }

    public Integer getPrintedSize() {
        return printedSize;
    }

    public void setPrintedSize(Integer printedSize) {
        this.printedSize = printedSize;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public boolean isFoilOnly() {
        return foilOnly;
    }

    public void setFoilOnly(boolean foilOnly) {
        this.foilOnly = foilOnly;
    }

    public boolean isNonFoilOnly() {
        return nonFoilOnly;
    }

    public void setNonFoilOnly(boolean nonFoilOnly) {
        this.nonFoilOnly = nonFoilOnly;
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

    public String getIconURI() {
        return iconURI;
    }

    public void setIconURI(String iconURI) {
        this.iconURI = iconURI;
    }

    public String getSearchUri() {
        return searchUri;
    }

    public void setSearchUri(String searchUri) {
        this.searchUri = searchUri;
    }

    /**
     * *********************************************************************
     */

    public boolean isValid() {
        return cardCount > 0 && !digital;
    }
}
