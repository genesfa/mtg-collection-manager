package com.ranthas.mtgmanager.converter;

import com.ranthas.mtgmanager.dto.scryfall.card.CardFace;
import com.ranthas.mtgmanager.dto.scryfall.card.CardImageURL;
import com.ranthas.mtgmanager.dto.scryfall.card.CardPrice;
import com.ranthas.mtgmanager.dto.scryfall.card.ScryfallCard;
import com.ranthas.mtgmanager.entity.MtgCard;
import com.ranthas.mtgmanager.entity.MtgCardFace;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScryfallCardConverter implements Converter<ScryfallCard, MtgCard> {

    private final ScryfallCardFaceConverter scryfallCardFaceConverter;

    public ScryfallCardConverter(ScryfallCardFaceConverter scryfallCardFaceConverter) {
        this.scryfallCardFaceConverter = scryfallCardFaceConverter;
    }

    @Override
    public MtgCard convert(ScryfallCard source) {

        MtgCard mtgCard = new MtgCard();
        CardPrice cardPrice = source.getCardPrice();
        CardImageURL cardImages = source.getCardImageURLs();
        List<CardFace> cardFaces = source.getCardFaces();

        mtgCard.setScryfallId(source.getId());
        mtgCard.setCardmarketId(source.getCardmarketId());
        mtgCard.setName(source.getName());
        mtgCard.setManaCost(source.getManaCost());
        mtgCard.setTypeLine(source.getTypeLine());
        mtgCard.setOracleText(source.getOracleText());
        mtgCard.setPower(source.getPower());
        mtgCard.setToughness(source.getToughness());
        mtgCard.setRarity(source.getRarity());
        mtgCard.setPriceEur(cardPrice.getEur());
        mtgCard.setPriceFoilEur(cardPrice.getEurFoil());
        mtgCard.setPriceUsd(cardPrice.getUsd());
        mtgCard.setPriceFoilUsd(cardPrice.getUsdFoil());
        mtgCard.setCollectorNumber(source.getCollectorNumber());

        if (cardImages != null) {
            mtgCard.setSmallImageURL(cardImages.getSmall());
            mtgCard.setNormalImageURL(cardImages.getNormal());
            mtgCard.setLargeImageURL(cardImages.getLarge());
            mtgCard.setArtCropImageURL(cardImages.getArtCrop());
            mtgCard.setBorderCropImageURL(cardImages.getBorderCrop());

        }

        if (cardFaces != null) {
            cardFaces.forEach(cardFace -> {
                MtgCardFace convert = scryfallCardFaceConverter.convert(cardFace);
                mtgCard.addCardFace(convert);
            });
        }

        return mtgCard;
    }
}
