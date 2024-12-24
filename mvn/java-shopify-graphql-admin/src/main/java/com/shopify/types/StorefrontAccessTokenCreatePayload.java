package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class StorefrontAccessTokenCreatePayload {
  
  private Shop shop;

  
  private StorefrontAccessToken storefrontAccessToken;

  
  private List<UserError> userErrors;

  public StorefrontAccessTokenCreatePayload() {
  }

  
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  
  public StorefrontAccessToken getStorefrontAccessToken() {
    return storefrontAccessToken;
  }

  public void setStorefrontAccessToken(StorefrontAccessToken storefrontAccessToken) {
    this.storefrontAccessToken = storefrontAccessToken;
  }

  
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
    
    private Shop shop;

    
    private StorefrontAccessToken storefrontAccessToken;

    
    private List<UserError> userErrors;

    public StorefrontAccessTokenCreatePayload build() {
      StorefrontAccessTokenCreatePayload result = new StorefrontAccessTokenCreatePayload();
      result.shop = this.shop;
      result.storefrontAccessToken = this.storefrontAccessToken;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    
    public Builder storefrontAccessToken(StorefrontAccessToken storefrontAccessToken) {
      this.storefrontAccessToken = storefrontAccessToken;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
