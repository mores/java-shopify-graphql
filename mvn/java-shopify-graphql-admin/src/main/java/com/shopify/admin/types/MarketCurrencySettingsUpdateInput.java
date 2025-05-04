package com.shopify.admin.types;

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
   * The currency which this market’s customers must use if local currencies are disabled.
   */
  private CurrencyCode baseCurrency;

  /**
   * The manual exchange rate that will be used to convert shop currency prices. If
   * null, then the automatic exchange rates will be used.
   */
  private String baseCurrencyManualRate;

  /**
   * Whether or not local currencies are enabled. If enabled, then prices will
   * be converted to give each customer the best experience based on their
   * region. If disabled, then all customers in this market will see prices
   * in the market's base currency.
   */
  private Boolean localCurrencies;

  /**
   * Whether or not rounding is enabled on multi-currency prices.
   */
  private Boolean roundingEnabled;

  public MarketCurrencySettingsUpdateInput() {
  }

  /**
   * The currency which this market’s customers must use if local currencies are disabled.
   */
  public CurrencyCode getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(CurrencyCode baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  /**
   * The manual exchange rate that will be used to convert shop currency prices. If
   * null, then the automatic exchange rates will be used.
   */
  public String getBaseCurrencyManualRate() {
    return baseCurrencyManualRate;
  }

  public void setBaseCurrencyManualRate(String baseCurrencyManualRate) {
    this.baseCurrencyManualRate = baseCurrencyManualRate;
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

  /**
   * Whether or not rounding is enabled on multi-currency prices.
   */
  public Boolean getRoundingEnabled() {
    return roundingEnabled;
  }

  public void setRoundingEnabled(Boolean roundingEnabled) {
    this.roundingEnabled = roundingEnabled;
  }

  @Override
  public String toString() {
    return "MarketCurrencySettingsUpdateInput{baseCurrency='" + baseCurrency + "', baseCurrencyManualRate='" + baseCurrencyManualRate + "', localCurrencies='" + localCurrencies + "', roundingEnabled='" + roundingEnabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCurrencySettingsUpdateInput that = (MarketCurrencySettingsUpdateInput) o;
    return Objects.equals(baseCurrency, that.baseCurrency) &&
        Objects.equals(baseCurrencyManualRate, that.baseCurrencyManualRate) &&
        Objects.equals(localCurrencies, that.localCurrencies) &&
        Objects.equals(roundingEnabled, that.roundingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrency, baseCurrencyManualRate, localCurrencies, roundingEnabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The currency which this market’s customers must use if local currencies are disabled.
     */
    private CurrencyCode baseCurrency;

    /**
     * The manual exchange rate that will be used to convert shop currency prices. If
     * null, then the automatic exchange rates will be used.
     */
    private String baseCurrencyManualRate;

    /**
     * Whether or not local currencies are enabled. If enabled, then prices will
     * be converted to give each customer the best experience based on their
     * region. If disabled, then all customers in this market will see prices
     * in the market's base currency.
     */
    private Boolean localCurrencies;

    /**
     * Whether or not rounding is enabled on multi-currency prices.
     */
    private Boolean roundingEnabled;

    public MarketCurrencySettingsUpdateInput build() {
      MarketCurrencySettingsUpdateInput result = new MarketCurrencySettingsUpdateInput();
      result.baseCurrency = this.baseCurrency;
      result.baseCurrencyManualRate = this.baseCurrencyManualRate;
      result.localCurrencies = this.localCurrencies;
      result.roundingEnabled = this.roundingEnabled;
      return result;
    }

    /**
     * The currency which this market’s customers must use if local currencies are disabled.
     */
    public Builder baseCurrency(CurrencyCode baseCurrency) {
      this.baseCurrency = baseCurrency;
      return this;
    }

    /**
     * The manual exchange rate that will be used to convert shop currency prices. If
     * null, then the automatic exchange rates will be used.
     */
    public Builder baseCurrencyManualRate(String baseCurrencyManualRate) {
      this.baseCurrencyManualRate = baseCurrencyManualRate;
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

    /**
     * Whether or not rounding is enabled on multi-currency prices.
     */
    public Builder roundingEnabled(Boolean roundingEnabled) {
      this.roundingEnabled = roundingEnabled;
      return this;
    }
  }
}
