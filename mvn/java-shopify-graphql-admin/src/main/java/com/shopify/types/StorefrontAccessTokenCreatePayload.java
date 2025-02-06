package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `storefrontAccessTokenCreate` mutation.
 */
public class StorefrontAccessTokenCreatePayload {
  /**
   * The user's shop.
   */
  private Shop shop;

  /**
   * The storefront access token.
   */
  private StorefrontAccessToken storefrontAccessToken;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public StorefrontAccessTokenCreatePayload() {
  }

  /**
   * The user's shop.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  /**
   * The storefront access token.
   */
  public StorefrontAccessToken getStorefrontAccessToken() {
    return storefrontAccessToken;
  }

  public void setStorefrontAccessToken(StorefrontAccessToken storefrontAccessToken) {
    this.storefrontAccessToken = storefrontAccessToken;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "StorefrontAccessTokenCreatePayload{shop='" + shop + "', storefrontAccessToken='" + storefrontAccessToken + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorefrontAccessTokenCreatePayload that = (StorefrontAccessTokenCreatePayload) o;
    return Objects.equals(shop, that.shop) &&
        Objects.equals(storefrontAccessToken, that.storefrontAccessToken) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shop, storefrontAccessToken, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The user's shop.
     */
    private Shop shop;

    /**
     * The storefront access token.
     */
    private StorefrontAccessToken storefrontAccessToken;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public StorefrontAccessTokenCreatePayload build() {
      StorefrontAccessTokenCreatePayload result = new StorefrontAccessTokenCreatePayload();
      result.shop = this.shop;
      result.storefrontAccessToken = this.storefrontAccessToken;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The user's shop.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    /**
     * The storefront access token.
     */
    public Builder storefrontAccessToken(StorefrontAccessToken storefrontAccessToken) {
      this.storefrontAccessToken = storefrontAccessToken;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
