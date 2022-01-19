package com.ranthas.mtgcollectionmanager.constant;

public class Endpoint {

    public static final String COLLECTION_SETS = "/collection/sets";
    public static final String COLLECTION_SET_BY_ID = COLLECTION_SETS + "/{setId}";
    public static final String COLLECTION_CARDS_BY_SET = COLLECTION_SET_BY_ID + "/cards";
    public static final String COLLECTION_CARD_BY_ID = "/collection/cards/{id}";
    public static final String SCRYFALL_SETS = "/scryfall/sets";

    public static final String NON_FOIL_OWNED_CARDS_BY_SET = COLLECTION_SET_BY_ID + "/owned/non-foil";
    public static final String FOIL_OWNED_CARDS_BY_SET = COLLECTION_SET_BY_ID + "/owned/foil";
    public static final String DIFFERENT_OWNED_CARDS_BY_SET = COLLECTION_SET_BY_ID + "/owned/different";

    public static final String CARDMARKET_WANTLISTS = "/cardmarket/wantlists";
    public static final String CARDMARKET_WANTLIST_BY_ID = CARDMARKET_WANTLISTS + "/{id}";
    public static final String CARDMARKET_PRODUCT_BY_ID = "/cardmarket/products/{id}";
}
