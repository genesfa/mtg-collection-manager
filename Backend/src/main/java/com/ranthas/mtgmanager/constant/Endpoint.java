package com.ranthas.mtgmanager.constant;

public class Endpoint {

    private static final String BASE_URL = "/api/mtg";

    public static final String SETS = BASE_URL + "/sets";
    public static final String SET_BY_CODE = SETS + "/{code}";
    public static final String CARDS_BY_SET_CODE = SET_BY_CODE + "/cards";
    public static final String CARDS_BY_ID = BASE_URL + "/cards/{id}";
}
