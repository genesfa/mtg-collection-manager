package com.ranthas.mtgmanager.configuration.cardmarket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:cardmarket-${spring.profiles.active}.properties")
public class CardMarketConfiguration {

    @Value("${com.ranthas.cardmarket.api-base-url}")
    private String baseURL;

    @Value("${com.ranthas.cardmarket.token}")
    private String token;

    @Value("${com.ranthas.cardmarket.secret}")
    private String secret;

    @Value("${com.ranthas.cardmarket.access-token}")
    private String accessToken;

    @Value("${com.ranthas.cardmarket.access-token-secret}")
    private String accessTokenSecret;

    @Value("${com.ranthas.cardmarket.oauth-version}")
    private String oAuthVersion;

    @Value("${com.ranthas.cardmarket.oauth-signature-method}")
    private String oAuthSignatureMethod;

    public CardMarketConfiguration() {
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessTokenSecret() {
        return accessTokenSecret;
    }

    public void setAccessTokenSecret(String accessTokenSecret) {
        this.accessTokenSecret = accessTokenSecret;
    }

    public String getoAuthVersion() {
        return oAuthVersion;
    }

    public void setoAuthVersion(String oAuthVersion) {
        this.oAuthVersion = oAuthVersion;
    }

    public String getoAuthSignatureMethod() {
        return oAuthSignatureMethod;
    }

    public void setoAuthSignatureMethod(String oAuthSignatureMethod) {
        this.oAuthSignatureMethod = oAuthSignatureMethod;
    }
}
