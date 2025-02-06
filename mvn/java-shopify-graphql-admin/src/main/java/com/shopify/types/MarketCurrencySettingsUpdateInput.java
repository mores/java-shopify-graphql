package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the currency settings of a market.
 */
public class MarketCurrencySettingsUpdateInput {
  /**
   * The currency which this market’s prices are defined in, and the
   * currency which its customers must use if local currencies are disabled.
   */
  private CurrencyCode baseCurrency;

  /**
   * Whether or not local currencies are enabled. If enabled, then prices will
   * be converted to give each customer the best experience based on their
   * region. If disabled, then all customers in this market will see prices
   * in the market's base currency.
   */
  private Boolean localCurrencies;

  public MarketCurrencySettingsUpdateInput() {
  }

  /**
   * The currency which this market’s prices are defined in, and the
   * currency which its customers must use if local currencies are disabled.
   */
  public CurrencyCode getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(CurrencyCode baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  /**
   * Whether or not local currencies are enabled. If enabled, then prices will
   * be converted to give each customer the best experience based on their
   * region. If disabled, then all customers in this market will see prices
   * in the market's base currency.
   */
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
    /**
     * The currency which this market’s prices are defined in, and the
     * currency which its customers must use if local currencies are disabled.
     */
    private CurrencyCode baseCurrency;

    /**
     * Whether or not local currencies are enabled. If enabled, then prices will
     * be converted to give each customer the best experience based on their
     * region. If disabled, then all customers in this market will see prices
     * in the market's base currency.
     */
    private Boolean localCurrencies;

    public MarketCurrencySettingsUpdateInput build() {
      MarketCurrencySettingsUpdateInput result = new MarketCurrencySettingsUpdateInput();
      result.baseCurrency = this.baseCurrency;
      result.localCurrencies = this.localCurrencies;
      return result;
    }

    /**
     * The currency which this market’s prices are defined in, and the
     * currency which its customers must use if local currencies are disabled.
     */
    public Builder baseCurrency(CurrencyCode baseCurrency) {
      this.baseCurrency = baseCurrency;
      return this;
    }

    /**
     * Whether or not local currencies are enabled. If enabled, then prices will
     * be converted to give each customer the best experience based on their
     * region. If disabled, then all customers in this market will see prices
     * in the market's base currency.
     */
    public Builder localCurrencies(Boolean localCurrencies) {
      this.localCurrencies = localCurrencies;
      return this;
    }
  }
}
