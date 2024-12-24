package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ShopLocaleDisablePayload {
  
  private String locale;

  
  private List<UserError> userErrors;

  public ShopLocaleDisablePayload() {
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShopLocaleDisablePayload{locale='" + locale + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopLocaleDisablePayload that = (ShopLocaleDisablePayload) o;
    return Objects.equals(locale, that.locale) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locale;

    
    private List<UserError> userErrors;

    public ShopLocaleDisablePayload build() {
      ShopLocaleDisablePayload result = new ShopLocaleDisablePayload();
      result.locale = this.locale;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
