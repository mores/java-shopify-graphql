package com.shopify.admin.types;

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

  @Override
  public String toString() {
    return "MarketPriceInclusionsInput{taxPricingStrategy='" + taxPricingStrategy + "', dutiesPricingStrategy='" + dutiesPricingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketPriceInclusionsInput that = (MarketPriceInclusionsInput) o;
    return Objects.equals(taxPricingStrategy, that.taxPricingStrategy) &&
        Objects.equals(dutiesPricingStrategy, that.dutiesPricingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxPricingStrategy, dutiesPricingStrategy);
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

    public MarketPriceInclusionsInput build() {
      MarketPriceInclusionsInput result = new MarketPriceInclusionsInput();
      result.taxPricingStrategy = this.taxPricingStrategy;
      result.dutiesPricingStrategy = this.dutiesPricingStrategy;
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
  }
}
