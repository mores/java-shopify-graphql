package com.shopify.storefront.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a filter used to view a subset of products in a collection matching a specific price range.
 */
public class PriceRangeFilter {
  /**
   * The minimum price in the range. Defaults to zero.
   */
  private Double min = 0d;

  /**
   * The maximum price in the range. Empty indicates no max price.
   */
  private Double max;

  public PriceRangeFilter() {
  }

  /**
   * The minimum price in the range. Defaults to zero.
   */
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  /**
   * The maximum price in the range. Empty indicates no max price.
   */
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  @Override
  public String toString() {
    return "PriceRangeFilter{min='" + min + "', max='" + max + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRangeFilter that = (PriceRangeFilter) o;
    return Objects.equals(min, that.min) &&
        Objects.equals(max, that.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The minimum price in the range. Defaults to zero.
     */
    private Double min = 0d;

    /**
     * The maximum price in the range. Empty indicates no max price.
     */
    private Double max;

    public PriceRangeFilter build() {
      PriceRangeFilter result = new PriceRangeFilter();
      result.min = this.min;
      result.max = this.max;
      return result;
    }

    /**
     * The minimum price in the range. Defaults to zero.
     */
    public Builder min(Double min) {
      this.min = min;
      return this;
    }

    /**
     * The maximum price in the range. Empty indicates no max price.
     */
    public Builder max(Double max) {
      this.max = max;
      return this;
    }
  }
}
