package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DelegateAccessTokenCreatePayload {
  
  private DelegateAccessToken delegateAccessToken;

  
  private Shop shop;

  
  private List<DelegateAccessTokenCreateUserError> userErrors;

  public DelegateAccessTokenCreatePayload() {
  }

  
  public DelegateAccessToken getDelegateAccessToken() {
    return delegateAccessToken;
  }

  public void setDelegateAccessToken(DelegateAccessToken delegateAccessToken) {
    this.delegateAccessToken = delegateAccessToken;
  }

  
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  
  public List<DelegateAccessTokenCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DelegateAccessTokenCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DelegateAccessTokenCreatePayload{delegateAccessToken='" + delegateAccessToken + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DelegateAccessTokenCreatePayload that = (DelegateAccessTokenCreatePayload) o;
    return Objects.equals(delegateAccessToken, that.delegateAccessToken) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegateAccessToken, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DelegateAccessToken delegateAccessToken;

    
    private Shop shop;

    
    private List<DelegateAccessTokenCreateUserError> userErrors;

    public DelegateAccessTokenCreatePayload build() {
      DelegateAccessTokenCreatePayload result = new DelegateAccessTokenCreatePayload();
      result.delegateAccessToken = this.delegateAccessToken;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder delegateAccessToken(DelegateAccessToken delegateAccessToken) {
      this.delegateAccessToken = delegateAccessToken;
      return this;
    }

    
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    
    public Builder userErrors(List<DelegateAccessTokenCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
