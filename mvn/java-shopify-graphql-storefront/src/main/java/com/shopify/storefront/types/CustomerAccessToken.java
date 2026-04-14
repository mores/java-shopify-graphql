package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A unique authentication token that identifies a logged-in customer and
 * authorizes modifications to the
 * [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer)
 * object. The token is required for customer-specific operations like updating
 * profile information or managing addresses.
 *
 * Tokens have an expiration date and must be renewed using [`customerAccessTokenRenew`](https://shopify.dev/docs/api/storefront/current/mutations/customerAccessTokenRenew)
 * before they expire. Create tokens with [`customerAccessTokenCreate`](https://shopify.dev/docs/api/storefront/current/mutations/customerAccessTokenCreate)
 * using legacy customer account authentication (email and password), or with [`customerAccessTokenCreateWithMultipass`](https://shopify.dev/docs/api/storefront/current/mutations/customerAccessTokenCreateWithMultipass)
 * for single sign-on flows.
 */
public class CustomerAccessToken {
  /**
   * The customer’s access token.
   */
  private String accessToken;

  /**
   * The date and time when the customer access token expires.
   */
  private OffsetDateTime expiresAt;

  public CustomerAccessToken() {
  }

  /**
   * The customer’s access token.
   */
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * The date and time when the customer access token expires.
   */
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Override
  public String toString() {
    return "CustomerAccessToken{accessToken='" + accessToken + "', expiresAt='" + expiresAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAccessToken that = (CustomerAccessToken) o;
    return Objects.equals(accessToken, that.accessToken) &&
        Objects.equals(expiresAt, that.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer’s access token.
     */
    private String accessToken;

    /**
     * The date and time when the customer access token expires.
     */
    private OffsetDateTime expiresAt;

    public CustomerAccessToken build() {
      CustomerAccessToken result = new CustomerAccessToken();
      result.accessToken = this.accessToken;
      result.expiresAt = this.expiresAt;
      return result;
    }

    /**
     * The customer’s access token.
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    /**
     * The date and time when the customer access token expires.
     */
    public Builder expiresAt(OffsetDateTime expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }
  }
}
