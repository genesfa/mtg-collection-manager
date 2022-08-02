package com.ranthas.mtgmanager.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "MTG_CARDS")
public class MtgCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "scryfall_id")
    private String scryfallId;

    @Column(name = "cardmarket_id")
    private Integer cardmarketId;

    @Column(name = "name")
    private String name;

    @Column(name = "mana_cost")
    private String manaCost;

    @Column(name = "type_line")
    private String typeLine;

    @Column(name = "oracle_text", length = 1000)
    private String oracleText;

    @Column(name = "power")
    private String power;

    @Column(name = "toughness")
    private String toughness;

    @Column(name = "rarity")
    private String rarity;

    @Column(name = "price_eur")
    private Double priceEur;

    @Column(name = "price_foil_eur")
    private Double priceFoilEur;

    @Column(name = "price_usd")
    private Double priceUsd;

    @Column(name = "price_foil_usd")
    private Double priceFoilUsd;

    @Column(name = "collector_number")
    private String collectorNumber;

    @Column(name = "small_image_url")
    private String smallImageURL;

    @Column(name = "normal_image_url")
    private String normalImageURL;

    @Column(name = "large_image_url")
    private String largeImageURL;

    @Column(name = "art_crop_image_url")
    private String artCropImageURL;

    @Column(name = "border_crop_image_url")
    private String borderCropImageURL;

    @Column(name = "non_foil_quantity")
    private long nonFoilQuantity;

    @Column(name = "foil_quantity")
    private long foilQuantity;

    @ManyToOne
    @JoinColumn(name = "mtg_set_id")
    private MtgSet mtgSet;

    @OneToMany(mappedBy = "mtgCard")
    private List<MtgCardFace> mtgCardFaces;

    public MtgCard() {
        this.id = 0L;
        this.nonFoilQuantity = 0L;
        this.foilQuantity = 0L;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getScryfallId() {
        return scryfallId;
    }

    public void setScryfallId(String scryfallId) {
        this.scryfallId = scryfallId;
    }

    public Integer getCardmarketId() {
        return cardmarketId;
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

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
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

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Double getPriceEur() {
        return priceEur;
    }

    public void setPriceEur(Double price) {
        this.priceEur = price;
    }

    public void setPriceEur(String price) {
        this.priceEur = parseDouble(price);
    }

    public Double getPriceFoilEur() {
        return priceFoilEur;
    }

    public void setPriceFoilEur(Double priceFoil) {
        this.priceFoilEur = priceFoil;
    }

    public void setPriceFoilEur(String priceFoil) {
        this.priceFoilEur = parseDouble(priceFoil);
    }

    public Double getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(Double priceUsd) {
        this.priceUsd = priceUsd;
    }

    public void setPriceUsd(String priceUsd) {
        this.priceUsd = parseDouble(priceUsd);
    }

    public Double getPriceFoilUsd() {
        return priceFoilUsd;
    }

    public void setPriceFoilUsd(Double priceFoilUsd) {
        this.priceFoilUsd = priceFoilUsd;
    }

    public void setPriceFoilUsd(String priceFoilUsd) {
        this.priceFoilUsd = parseDouble(priceFoilUsd);
    }

    public String getCollectorNumber() {
        return collectorNumber;
    }

    public void setCollectorNumber(String collectorNumber) {
        this.collectorNumber = collectorNumber;
    }

    public String getSmallImageURL() {
        return smallImageURL;
    }

    public void setSmallImageURL(String smallImageURL) {
        this.smallImageURL = smallImageURL;
    }

    public String getNormalImageURL() {
        return normalImageURL;
    }

    public void setNormalImageURL(String normalImageURL) {
        this.normalImageURL = normalImageURL;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public String getArtCropImageURL() {
        return artCropImageURL;
    }

    public void setArtCropImageURL(String artCropImageURL) {
        this.artCropImageURL = artCropImageURL;
    }

    public String getBorderCropImageURL() {
        return borderCropImageURL;
    }

    public void setBorderCropImageURL(String borderCropImageURL) {
        this.borderCropImageURL = borderCropImageURL;
    }

    public long getNonFoilQuantity() {
        return nonFoilQuantity;
    }

    public void setNonFoilQuantity(long nonFoilQuantity) {
        this.nonFoilQuantity = nonFoilQuantity;
    }

    public long getFoilQuantity() {
        return foilQuantity;
    }

    public void setFoilQuantity(long foilQuantity) {
        this.foilQuantity = foilQuantity;
    }

    public MtgSet getMtgSet() {
        return mtgSet;
    }

    public void setMtgSet(MtgSet mtgSet) {
        this.mtgSet = mtgSet;
    }

    public List<MtgCardFace> getMtgCardFaces() {
        return mtgCardFaces;
    }

    public void setMtgCardFaces(List<MtgCardFace> mtgCardFaces) {
        this.mtgCardFaces = mtgCardFaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MtgCard mtgCard = (MtgCard) o;
        return id == mtgCard.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void addCardFace(MtgCardFace mtgCardFace) {
        if (mtgCardFaces == null) {
            mtgCardFaces = new ArrayList<>();
        }
        mtgCardFaces.add(mtgCardFace);
        mtgCardFace.setMtgCard(this);
    }

    public void modifyQuantity(boolean isAddition, boolean isFoil) {
        if (isAddition) {
            if (isFoil) {
                foilQuantity = foilQuantity + 1;
            } else {
                foilQuantity = foilQuantity > 0 ? foilQuantity - 1 : 0;
            }
        } else {
            if (isFoil) {
                nonFoilQuantity = nonFoilQuantity + 1;
            } else {
                nonFoilQuantity = nonFoilQuantity > 0 ? nonFoilQuantity - 1 : 0;
            }
        }
    }

    private Double parseDouble(String value) {
        return value == null ? null : Double.valueOf(value);
    }
}
