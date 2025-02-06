package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A market's currency settings.
 */
public class MarketCurrencySettings {
  /**
   * The currency which this market's prices are defined in, and the
   * currency which its customers must use if local currencies are disabled.
   */
  private CurrencySetting baseCurrency;

  /**
   * Whether or not local currencies are enabled. If enabled, then prices will
   * be converted to give each customer the best experience based on their
   * region. If disabled, then all customers in this market will see prices
   * in the market's base currency. For single country markets this will be true when
   * the market's base currency is the same as the default currency for the region.
   */
  private boolean localCurrencies;

  public MarketCurrencySettings() {
  }

  /**
   * The currency which this market's prices are defined in, and the
   * currency which its customers must use if local currencies are disabled.
   */
  public CurrencySetting getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(CurrencySetting baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  /**
   * Whether or not local currencies are enabled. If enabled, then prices will
   * be converted to give each customer the best experience based on their
   * region. If disabled, then all customers in this market will see prices
   * in the market's base currency. For single country markets this will be true when
   * the market's base currency is the same as the default currency for the region.
   */
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
    /**
     * The currency which this market's prices are defined in, and the
     * currency which its customers must use if local currencies are disabled.
     */
    private CurrencySetting baseCurrency;

    /**
     * Whether or not local currencies are enabled. If enabled, then prices will
     * be converted to give each customer the best experience based on their
     * region. If disabled, then all customers in this market will see prices
     * in the market's base currency. For single country markets this will be true when
     * the market's base currency is the same as the default currency for the region.
     */
    private boolean localCurrencies;

    public MarketCurrencySettings build() {
      MarketCurrencySettings result = new MarketCurrencySettings();
      result.baseCurrency = this.baseCurrency;
      result.localCurrencies = this.localCurrencies;
      return result;
    }

    /**
     * The currency which this market's prices are defined in, and the
     * currency which its customers must use if local currencies are disabled.
     */
    public Builder baseCurrency(CurrencySetting baseCurrency) {
      this.baseCurrency = baseCurrency;
      return this;
    }

    /**
     * Whether or not local currencies are enabled. If enabled, then prices will
     * be converted to give each customer the best experience based on their
     * region. If disabled, then all customers in this market will see prices
     * in the market's base currency. For single country markets this will be true when
     * the market's base currency is the same as the default currency for the region.
     */
    public Builder localCurrencies(boolean localCurrencies) {
      this.localCurrencies = localCurrencies;
      return this;
    }
  }
}
