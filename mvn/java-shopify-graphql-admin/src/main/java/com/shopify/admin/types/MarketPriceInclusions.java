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
    return "MarketPriceInclusions{inclusiveDutiesPricingStrategy='" + inclusiveDutiesPricingStrategy + "', inclusiveTaxPricingStrategy='" + inclusiveTaxPricingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketPriceInclusions that = (MarketPriceInclusions) o;
    return Objects.equals(inclusiveDutiesPricingStrategy, that.inclusiveDutiesPricingStrategy) &&
        Objects.equals(inclusiveTaxPricingStrategy, that.inclusiveTaxPricingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inclusiveDutiesPricingStrategy, inclusiveTaxPricingStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
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
      result.inclusiveDutiesPricingStrategy = this.inclusiveDutiesPricingStrategy;
      result.inclusiveTaxPricingStrategy = this.inclusiveTaxPricingStrategy;
      return result;
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
