package com.ranthas.mtgmanager.repository.cardmarket;

import com.ranthas.mtgmanager.configuration.cardmarket.CardMarketConfiguration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

@Component
public class CardMarketHeaderBuilder {

    private final CardMarketConfiguration configuration;
    private final List<String> queryParams = new ArrayList<>();
    private final List<String> auxiliarQueryParams = new ArrayList<>();

    private String oAuthTimestamp;
    private String oAuthNonce;
    private String authorizationProperty;

    private static final String REALM_WILDCARD = "::URL";
    private static final String OAUTH_SIGNATURE_WILDCARD = "::OAUTH_SIGNATURE";

    public CardMarketHeaderBuilder(CardMarketConfiguration configuration) {
        this.configuration = configuration;
    }

    public HttpHeaders buildHeaders(HttpMethod method, String url) {

        initBaseParamString();
        initAuthorizationProperty();

        String paramString = buildParamString();
        String baseString = method.toString() + "&" + rawURLEncode(url) + "&" + rawURLEncode(paramString);
        String oAuthSignature = buildOAuthSignature(baseString);
        authorizationProperty = authorizationProperty.replace(REALM_WILDCARD, url).replace(OAUTH_SIGNATURE_WILDCARD, oAuthSignature);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", authorizationProperty);

        return headers;
    }

    public HttpHeaders buildHeaders(HttpMethod method, String url, Map<String, String> queryParams) {
        auxiliarQueryParams.clear();
        queryParams.forEach((key, value) -> auxiliarQueryParams.add(key + "=" + rawURLEncode(value)));
        return buildHeaders(method, url);
    }

    private void initBaseParamString() {
        oAuthNonce = generateRandomString();
        oAuthTimestamp = generateTimestamp();
        queryParams.clear();
        queryParams.add("oauth_consumer_key=" + rawURLEncode(configuration.getToken()));
        queryParams.add("oauth_nonce=" + rawURLEncode(oAuthNonce));
        queryParams.add("oauth_signature_method=" + rawURLEncode(configuration.getoAuthSignatureMethod()));
        queryParams.add("oauth_timestamp=" + rawURLEncode(oAuthTimestamp));
        queryParams.add("oauth_token=" + rawURLEncode(configuration.getAccessToken()));
        queryParams.add("oauth_version=" + rawURLEncode(configuration.getoAuthVersion()));
        queryParams.addAll(auxiliarQueryParams);
        Collections.sort(queryParams);
    }

    private void initAuthorizationProperty() {
        authorizationProperty =
                "OAuth " +
                        "realm=\"" + REALM_WILDCARD + "\", " +
                        "oauth_version=\"" + configuration.getoAuthVersion() + "\", " +
                        "oauth_timestamp=\"" + oAuthTimestamp + "\", " +
                        "oauth_nonce=\"" + oAuthNonce + "\", " +
                        "oauth_consumer_key=\"" + configuration.getToken() + "\", " +
                        "oauth_token=\"" + configuration.getAccessToken() + "\", " +
                        "oauth_signature_method=\"" + configuration.getoAuthSignatureMethod() + "\", " +
                        "oauth_signature=\"" + OAUTH_SIGNATURE_WILDCARD + "\"" ;
    }

    private String buildParamString() {
        return String.join("&", queryParams);
    }

    private String rawURLEncode(String url) {
        return URLEncoder.encode(url, StandardCharsets.UTF_8);
    }

    private String generateRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    private String generateTimestamp() {
        return "" + (System.currentTimeMillis() / 1000);
    }

    private String buildOAuthSignature(String baseString) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            String signingKey = rawURLEncode(configuration.getSecret()) + "&" + rawURLEncode(configuration.getAccessTokenSecret());
            SecretKeySpec secretKeySpec = new SecretKeySpec(signingKey.getBytes(), mac.getAlgorithm());
            mac.init(secretKeySpec);

            byte[] digest = mac.doFinal(baseString.getBytes());
            return Base64.getEncoder().encodeToString(digest);

        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
//            throw new OAuthSignatureException(e.getMessage(), e);
            // TODO 10/01/2022 Rubén: Ver que hacer con este tipo de excepciones
            return null;
        }
    }
}
