package com.ranthas.mtgcollectionmanager.repository.cardmarket;

import com.ranthas.mtgcollectionmanager.configuration.cardmarket.CardMarketConfiguration;
import com.ranthas.mtgcollectionmanager.dto.cardmarket.CardMarketDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CardMarketApiServiceImpl implements CardMarketApiService {

    private final CardMarketConfiguration configuration;
    private final CardMarketHeaderBuilder headerBuilder;
    private final RestTemplate restTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(CardMarketApiServiceImpl.class);

    public CardMarketApiServiceImpl(
            CardMarketConfiguration configuration,
            CardMarketHeaderBuilder headerBuilder,
            RestTemplate restTemplate
    ) {
        this.configuration = configuration;
        this.headerBuilder = headerBuilder;
        this.restTemplate = restTemplate;
    }

    @Override
    public <T extends CardMarketDTO> T sendPostRequest(String url, Object body, Class<T> type) {
        return execute(HttpMethod.POST, url, body, type);
    }

    @Override
    public <T extends CardMarketDTO> T sendGetRequest(String url, Class<T> type) {
        return execute(HttpMethod.GET, url, type);
    }

    @Override
    public <T extends CardMarketDTO> T sendPutRequest(String url, Object body, Class<T> type) {
        return execute(HttpMethod.PUT, url, body, type);
    }

    /**
     * *********************************************************************
     */

    private <T extends CardMarketDTO> T execute(HttpMethod method, String url, Class<T> type) {
        return execute(method, url, null, type);
    }

    private <T extends CardMarketDTO> T execute(HttpMethod method, String url, Object body, Class<T> type) {

        String completeURL = configuration.getBaseURL() + url;
        HttpHeaders headers = headerBuilder.buildHeaders(method, completeURL);
        HttpEntity entity = new HttpEntity<>(body, headers);

        LOGGER.info("{} request", method.name());
        LOGGER.info("URL :: {}", completeURL);
        LOGGER.info("Request :: {}", entity);

        ResponseEntity<T> exchange = restTemplate.exchange(completeURL, method, entity, type);
        T exchangeBody = exchange.getBody();
        checkErrorResponse(exchangeBody);

        return exchangeBody;
    }

    private <T extends CardMarketDTO> void checkErrorResponse(T response) {
        if (response.isErrorResponse()) {
//            throw new BadRequestException(response.getFailed());
            // TODO 10/01/2022 Rubén: Ver que hacer con este tipop de excepciones
        }
    }
}
