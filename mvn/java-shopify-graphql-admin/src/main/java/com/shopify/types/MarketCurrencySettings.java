package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketCurrencySettings {
  
  private CurrencySetting baseCurrency;

  
  private boolean localCurrencies;

  public MarketCurrencySettings() {
  }

  
  public CurrencySetting getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(CurrencySetting baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  
  public boolean getLocalCurrencies() {
    return localCurrencies;
  }

  public void setLocalCurrencies(boolean localCurrencies) {
    this.localCurrencies = localCurrencies;
  }

  @Override
  public String toString() {
    return "MarketCurrencySettings{baseCurrency='" + baseCurrency + "', localCurrencies='" + localCurrencies + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCurrencySettings that = (MarketCurrencySettings) o;
    return Objects.equals(baseCurrency, that.baseCurrency) &&
        localCurrencies == that.localCurrencies;
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrency, localCurrencies);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CurrencySetting baseCurrency;

    
    private boolean localCurrencies;

    public MarketCurrencySettings build() {
      MarketCurrencySettings result = new MarketCurrencySettings();
      result.baseCurrency = this.baseCurrency;
      result.localCurrencies = this.localCurrencies;
      return result;
    }

    
    public Builder baseCurrency(CurrencySetting baseCurrency) {
      this.baseCurrency = baseCurrency;
      return this;
    }

    
    public Builder localCurrencies(boolean localCurrencies) {
      this.localCurrencies = localCurrencies;
      return this;
    }
  }
}
