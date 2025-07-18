package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a token source that exchanges a control plane token for an endpoint-specific dataplane
 * token. It utilizes an underlying {@link TokenSource} to obtain the initial control plane token.
 */
public class EndpointTokenSource implements TokenSource {
  private static final Logger LOG = LoggerFactory.getLogger(EndpointTokenSource.class);
  private static final String JWT_GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";
  private static final String GRANT_TYPE_PARAM = "grant_type";
  private static final String AUTHORIZATION_DETAILS_PARAM = "authorization_details";
  private static final String ASSERTION_PARAM = "assertion";
  private static final String TOKEN_ENDPOINT = "/oidc/v1/token";

  private final TokenSource cpTokenSource;
  private final String authDetails;
  private final HttpClient httpClient;
  private final String host;

  /**
   * Constructs a new EndpointTokenSource.
   *
   * @param cpTokenSource The {@link TokenSource} used to obtain the control plane token.
   * @param authDetails The authorization details required for the token exchange.
   * @param httpClient The {@link HttpClient} used to make the token exchange request.
   * @param host The host for the token exchange request.
   * @throws IllegalArgumentException if authDetails is empty or host is empty.
   * @throws NullPointerException if any of the parameters are null.
   */
  public EndpointTokenSource(
      TokenSource cpTokenSource, String authDetails, HttpClient httpClient, String host) {
    this.cpTokenSource =
        Objects.requireNonNull(cpTokenSource, "Control plane token source cannot be null");
    this.authDetails = Objects.requireNonNull(authDetails, "Authorization details cannot be null");
    this.httpClient = Objects.requireNonNull(httpClient, "HTTP client cannot be null");
    this.host = Objects.requireNonNull(host, "Host cannot be null");

    if (authDetails.isEmpty()) {
      throw new IllegalArgumentException("Authorization details cannot be empty");
    }
    if (host.isEmpty()) {
      throw new IllegalArgumentException("Host cannot be empty");
    }
  }

  /**
   * Fetches an endpoint-specific dataplane token by exchanging a control plane token.
   *
   * <p>This method first obtains a control plane token from the configured {@code cpTokenSource}.
   * It then uses this token as an assertion along with the provided {@code authDetails} to request
   * a new, more scoped dataplane token from the Databricks OAuth token endpoint ({@value
   * #TOKEN_ENDPOINT}).
   *
   * @return A new {@link Token} containing the exchanged dataplane access token, its type, any
   *     accompanying refresh token, and its expiry time.
   * @throws DatabricksException if the token exchange with the OAuth endpoint fails.
   * @throws IllegalArgumentException if the token endpoint url is empty.
   * @throws NullPointerException if any of the parameters are null.
   */
  @Override
  public Token getToken() {
    Token cpToken = cpTokenSource.getToken();
    Map<String, String> params = new HashMap<>();
    params.put(GRANT_TYPE_PARAM, JWT_GRANT_TYPE);
    params.put(AUTHORIZATION_DETAILS_PARAM, authDetails);
    params.put(ASSERTION_PARAM, cpToken.getAccessToken());

    OAuthResponse oauthResponse;
    try {
      oauthResponse =
          TokenEndpointClient.requestToken(this.httpClient, this.host + TOKEN_ENDPOINT, params);
    } catch (DatabricksException | IllegalArgumentException | NullPointerException e) {
      LOG.error(
          "Failed to exchange control plane token for dataplane token at endpoint {}: {}",
          TOKEN_ENDPOINT,
          e.getMessage(),
          e);
      throw e;
    }

    Instant expiry = Instant.now().plusSeconds(oauthResponse.getExpiresIn());
    return new Token(
        oauthResponse.getAccessToken(),
        oauthResponse.getTokenType(),
        oauthResponse.getRefreshToken(),
        expiry);
  }
}
