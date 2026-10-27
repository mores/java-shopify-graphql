package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The inclusive pricing strategy for a market.
 */
public class MarketPriceInclusions {
  /**
   * Whether adaptive pricing is enabled for the market. Only applicable to Managed Markets and must be ignored otherwise.
   */
  private boolean adaptivePricingEnabled;

  /**
   * The inclusive duties pricing strategy of the market. This determines if prices include duties.
   */
  private InclusiveDutiesPricingStrategy inclusiveDutiesPricingStrategy;

  /**
   * The inclusive tax pricing strategy of the market. This determines if prices include taxes.
   */
  private InclusiveTaxPricingStrategy inclusiveTaxPricingStrategy;

  public MarketPriceInclusions() {
  }

  /**
   * Whether adaptive pricing is enabled for the market. Only applicable to Managed Markets and must be ignored otherwise.
   */
  public boolean getAdaptivePricingEnabled() {
    return adaptivePricingEnabled;
  }

  public void setAdaptivePricingEnabled(boolean adaptivePricingEnabled) {
    this.adaptivePricingEnabled = adaptivePricingEnabled;
  }

  /**
   * The inclusive duties pricing strategy of the market. This determines if prices include duties.
   */
  public InclusiveDutiesPricingStrategy getInclusiveDutiesPricingStrategy() {
    return inclusiveDutiesPricingStrategy;
  }

  public void setInclusiveDutiesPricingStrategy(
      InclusiveDutiesPricingStrategy inclusiveDutiesPricingStrategy) {
    this.inclusiveDutiesPricingStrategy = inclusiveDutiesPricingStrategy;
  }

  /**
   * The inclusive tax pricing strategy of the market. This determines if prices include taxes.
   */
  public InclusiveTaxPricingStrategy getInclusiveTaxPricingStrategy() {
    return inclusiveTaxPricingStrategy;
  }

  public void setInclusiveTaxPricingStrategy(
      InclusiveTaxPricingStrategy inclusiveTaxPricingStrategy) {
    this.inclusiveTaxPricingStrategy = inclusiveTaxPricingStrategy;
  }

  @Override
  public String toString() {
    return "MarketPriceInclusions{adaptivePricingEnabled='" + adaptivePricingEnabled + "', inclusiveDutiesPricingStrategy='" + inclusiveDutiesPricingStrategy + "', inclusiveTaxPricingStrategy='" + inclusiveTaxPricingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketPriceInclusions that = (MarketPriceInclusions) o;
    return adaptivePricingEnabled == that.adaptivePricingEnabled &&
        Objects.equals(inclusiveDutiesPricingStrategy, that.inclusiveDutiesPricingStrategy) &&
        Objects.equals(inclusiveTaxPricingStrategy, that.inclusiveTaxPricingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptivePricingEnabled, inclusiveDutiesPricingStrategy, inclusiveTaxPricingStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether adaptive pricing is enabled for the market. Only applicable to Managed Markets and must be ignored otherwise.
     */
    private boolean adaptivePricingEnabled;

    /**
     * The inclusive duties pricing strategy of the market. This determines if prices include duties.
     */
    private InclusiveDutiesPricingStrategy inclusiveDutiesPricingStrategy;

    /**
     * The inclusive tax pricing strategy of the market. This determines if prices include taxes.
     */
    private InclusiveTaxPricingStrategy inclusiveTaxPricingStrategy;

    public MarketPriceInclusions build() {
      MarketPriceInclusions result = new MarketPriceInclusions();
      result.adaptivePricingEnabled = this.adaptivePricingEnabled;
      result.inclusiveDutiesPricingStrategy = this.inclusiveDutiesPricingStrategy;
      result.inclusiveTaxPricingStrategy = this.inclusiveTaxPricingStrategy;
      return result;
    }

    /**
     * Whether adaptive pricing is enabled for the market. Only applicable to Managed Markets and must be ignored otherwise.
     */
    public Builder adaptivePricingEnabled(boolean adaptivePricingEnabled) {
      this.adaptivePricingEnabled = adaptivePricingEnabled;
      return this;
    }

    /**
     * The inclusive duties pricing strategy of the market. This determines if prices include duties.
     */
    public Builder inclusiveDutiesPricingStrategy(
        InclusiveDutiesPricingStrategy inclusiveDutiesPricingStrategy) {
      this.inclusiveDutiesPricingStrategy = inclusiveDutiesPricingStrategy;
      return this;
    }

    /**
     * The inclusive tax pricing strategy of the market. This determines if prices include taxes.
     */
    public Builder inclusiveTaxPricingStrategy(
        InclusiveTaxPricingStrategy inclusiveTaxPricingStrategy) {
      this.inclusiveTaxPricingStrategy = inclusiveTaxPricingStrategy;
      return this;
    }
  }
}
