package com.ranthas.mtgcollectionmanager.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;
import java.net.URI;

@Component
public class RestTemplateResponseErrorHandler extends DefaultResponseErrorHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateResponseErrorHandler.class);

    @Override
    public void handleError(URI url, HttpMethod method, ClientHttpResponse response) throws IOException {

        LOGGER.error("URL: {}", url);
        LOGGER.error("Method: {}", method);
        LOGGER.error("Response: {}", response);

        super.handleError(url, method, response);
    }
}
