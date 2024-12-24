package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketCurrencySettingsUpdatePayload {
  
  private Market market;

  
  private List<MarketCurrencySettingsUserError> userErrors;

  public MarketCurrencySettingsUpdatePayload() {
  }

  
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  
  public List<MarketCurrencySettingsUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketCurrencySettingsUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketCurrencySettingsUpdatePayload{market='" + market + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCurrencySettingsUpdatePayload that = (MarketCurrencySettingsUpdatePayload) o;
    return Objects.equals(market, that.market) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(market, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Market market;

    
    private List<MarketCurrencySettingsUserError> userErrors;

    public MarketCurrencySettingsUpdatePayload build() {
      MarketCurrencySettingsUpdatePayload result = new MarketCurrencySettingsUpdatePayload();
      result.market = this.market;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    
    public Builder userErrors(List<MarketCurrencySettingsUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
