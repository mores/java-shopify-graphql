package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to create a price inclusion.
 */
public class MarketPriceInclusionsInput {
  /**
   * The inclusive tax pricing strategy for the market.
   */
  private InclusiveTaxPricingStrategy taxPricingStrategy;

  /**
   * The inclusive duties pricing strategy for the market.
   */
  private InclusiveDutiesPricingStrategy dutiesPricingStrategy;

  /**
   * Whether adaptive pricing is enabled for the market. Only applicable for
   * Markets with Managed Market enabled. When enabled, forces a state of
   * `INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY`, `INCLUDE_DUTIES_IN_PRICE`, and
   * `DDP`. When disabled, defaults to `INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY`,
   * `ADD_DUTIES_AT_CHECKOUT`, and `DDP` unless otherwise specified.
   */
  private Boolean adaptivePricingEnabled;

  public MarketPriceInclusionsInput() {
  }

  /**
   * The inclusive tax pricing strategy for the market.
   */
  public InclusiveTaxPricingStrategy getTaxPricingStrategy() {
    return taxPricingStrategy;
  }

  public void setTaxPricingStrategy(InclusiveTaxPricingStrategy taxPricingStrategy) {
    this.taxPricingStrategy = taxPricingStrategy;
  }

  /**
   * The inclusive duties pricing strategy for the market.
   */
  public InclusiveDutiesPricingStrategy getDutiesPricingStrategy() {
    return dutiesPricingStrategy;
  }

  public void setDutiesPricingStrategy(InclusiveDutiesPricingStrategy dutiesPricingStrategy) {
    this.dutiesPricingStrategy = dutiesPricingStrategy;
  }

  /**
   * Whether adaptive pricing is enabled for the market. Only applicable for
   * Markets with Managed Market enabled. When enabled, forces a state of
   * `INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY`, `INCLUDE_DUTIES_IN_PRICE`, and
   * `DDP`. When disabled, defaults to `INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY`,
   * `ADD_DUTIES_AT_CHECKOUT`, and `DDP` unless otherwise specified.
   */
  public Boolean getAdaptivePricingEnabled() {
    return adaptivePricingEnabled;
  }

  public void setAdaptivePricingEnabled(Boolean adaptivePricingEnabled) {
    this.adaptivePricingEnabled = adaptivePricingEnabled;
  }

  @Override
  public String toString() {
    return "MarketPriceInclusionsInput{taxPricingStrategy='" + taxPricingStrategy + "', dutiesPricingStrategy='" + dutiesPricingStrategy + "', adaptivePricingEnabled='" + adaptivePricingEnabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketPriceInclusionsInput that = (MarketPriceInclusionsInput) o;
    return Objects.equals(taxPricingStrategy, that.taxPricingStrategy) &&
        Objects.equals(dutiesPricingStrategy, that.dutiesPricingStrategy) &&
        Objects.equals(adaptivePricingEnabled, that.adaptivePricingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxPricingStrategy, dutiesPricingStrategy, adaptivePricingEnabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The inclusive tax pricing strategy for the market.
     */
    private InclusiveTaxPricingStrategy taxPricingStrategy;

    /**
     * The inclusive duties pricing strategy for the market.
     */
    private InclusiveDutiesPricingStrategy dutiesPricingStrategy;

    /**
     * Whether adaptive pricing is enabled for the market. Only applicable for
     * Markets with Managed Market enabled. When enabled, forces a state of
     * `INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY`, `INCLUDE_DUTIES_IN_PRICE`, and
     * `DDP`. When disabled, defaults to `INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY`,
     * `ADD_DUTIES_AT_CHECKOUT`, and `DDP` unless otherwise specified.
     */
    private Boolean adaptivePricingEnabled;

    public MarketPriceInclusionsInput build() {
      MarketPriceInclusionsInput result = new MarketPriceInclusionsInput();
      result.taxPricingStrategy = this.taxPricingStrategy;
      result.dutiesPricingStrategy = this.dutiesPricingStrategy;
      result.adaptivePricingEnabled = this.adaptivePricingEnabled;
      return result;
    }

    /**
     * The inclusive tax pricing strategy for the market.
     */
    public Builder taxPricingStrategy(InclusiveTaxPricingStrategy taxPricingStrategy) {
      this.taxPricingStrategy = taxPricingStrategy;
      return this;
    }

    /**
     * The inclusive duties pricing strategy for the market.
     */
    public Builder dutiesPricingStrategy(InclusiveDutiesPricingStrategy dutiesPricingStrategy) {
      this.dutiesPricingStrategy = dutiesPricingStrategy;
      return this;
    }

    /**
     * Whether adaptive pricing is enabled for the market. Only applicable for
     * Markets with Managed Market enabled. When enabled, forces a state of
     * `INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY`, `INCLUDE_DUTIES_IN_PRICE`, and
     * `DDP`. When disabled, defaults to `INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY`,
     * `ADD_DUTIES_AT_CHECKOUT`, and `DDP` unless otherwise specified.
     */
    public Builder adaptivePricingEnabled(Boolean adaptivePricingEnabled) {
      this.adaptivePricingEnabled = adaptivePricingEnabled;
      return this;
    }
  }
}
