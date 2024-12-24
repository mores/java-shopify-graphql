package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketCurrencySettingsUpdateInput {
  
  private CurrencyCode baseCurrency;

  
  private Boolean localCurrencies;

  public MarketCurrencySettingsUpdateInput() {
  }

  
  public CurrencyCode getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(CurrencyCode baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  
  public Boolean getLocalCurrencies() {
    return localCurrencies;
  }

  public void setLocalCurrencies(Boolean localCurrencies) {
    this.localCurrencies = localCurrencies;
  }

  @Override
  public String toString() {
    return "MarketCurrencySettingsUpdateInput{baseCurrency='" + baseCurrency + "', localCurrencies='" + localCurrencies + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCurrencySettingsUpdateInput that = (MarketCurrencySettingsUpdateInput) o;
    return Objects.equals(baseCurrency, that.baseCurrency) &&
        Objects.equals(localCurrencies, that.localCurrencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrency, localCurrencies);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CurrencyCode baseCurrency;

    
    private Boolean localCurrencies;

    public MarketCurrencySettingsUpdateInput build() {
      MarketCurrencySettingsUpdateInput result = new MarketCurrencySettingsUpdateInput();
      result.baseCurrency = this.baseCurrency;
      result.localCurrencies = this.localCurrencies;
      return result;
    }

    
    public Builder baseCurrency(CurrencyCode baseCurrency) {
      this.baseCurrency = baseCurrency;
      return this;
    }

    
    public Builder localCurrencies(Boolean localCurrencies) {
      this.localCurrencies = localCurrencies;
      return this;
    }
  }
}
