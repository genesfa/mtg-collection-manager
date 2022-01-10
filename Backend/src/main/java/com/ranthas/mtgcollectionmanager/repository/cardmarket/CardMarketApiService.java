package com.ranthas.mtgcollectionmanager.repository.cardmarket;

import com.ranthas.mtgcollectionmanager.dto.cardmarket.CardMarketDTO;

public interface CardMarketApiService {

    <T extends CardMarketDTO> T sendPostRequest(String url, Object body, Class<T> type);

    <T extends CardMarketDTO> T sendGetRequest(String url, Class<T> type);

    <T extends CardMarketDTO> T sendPutRequest(String url, Object body, Class<T> type);
}
