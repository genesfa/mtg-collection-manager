package com.ranthas.mtgcollectionmanager.configuration.rest;

import com.ranthas.mtgcollectionmanager.exception.RestTemplateResponseErrorHandler;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                    .errorHandler(new RestTemplateResponseErrorHandler())
                    .build();
    }
}
