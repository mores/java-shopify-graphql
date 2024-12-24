package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ShopLocaleEnablePayload {
  
  private ShopLocale shopLocale;

  
  private List<UserError> userErrors;

  public ShopLocaleEnablePayload() {
  }

  
  public ShopLocale getShopLocale() {
    return shopLocale;
  }

  public void setShopLocale(ShopLocale shopLocale) {
    this.shopLocale = shopLocale;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShopLocaleEnablePayload{shopLocale='" + shopLocale + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopLocaleEnablePayload that = (ShopLocaleEnablePayload) o;
    return Objects.equals(shopLocale, that.shopLocale) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopLocale, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ShopLocale shopLocale;

    
    private List<UserError> userErrors;

    public ShopLocaleEnablePayload build() {
      ShopLocaleEnablePayload result = new ShopLocaleEnablePayload();
      result.shopLocale = this.shopLocale;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder shopLocale(ShopLocale shopLocale) {
      this.shopLocale = shopLocale;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
