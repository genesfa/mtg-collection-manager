package com.ranthas.mtgmanager.converter;

import com.ranthas.mtgmanager.dto.scryfall.card.CardFace;
import com.ranthas.mtgmanager.entity.MtgCardFace;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ScryfallCardFaceConverter implements Converter<CardFace, MtgCardFace> {

    @Override
    public MtgCardFace convert(CardFace source) {

        MtgCardFace mtgCardFace = new MtgCardFace();

        mtgCardFace.setName(source.getName());
        mtgCardFace.setManaCost(source.getManaCost());
        mtgCardFace.setTypeLine(source.getTypeLine());
        mtgCardFace.setOracleText(source.getOracleText());
        mtgCardFace.setPower(source.getPower());
        mtgCardFace.setToughness(source.getToughness());

        return mtgCardFace;
    }
}
