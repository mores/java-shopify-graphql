package com.shopify.types;

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
   * The maximum price in the range. Empty indicates no max price.
   */
  private Double max;

  /**
   * The minimum price in the range. Defaults to zero.
   */
  private Double min = 0d;

  public PriceRangeFilter() {
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

  /**
   * The minimum price in the range. Defaults to zero.
   */
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  @Override
  public String toString() {
    return "PriceRangeFilter{max='" + max + "', min='" + min + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRangeFilter that = (PriceRangeFilter) o;
    return Objects.equals(max, that.max) &&
        Objects.equals(min, that.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The maximum price in the range. Empty indicates no max price.
     */
    private Double max;

    /**
     * The minimum price in the range. Defaults to zero.
     */
    private Double min = 0d;

    public PriceRangeFilter build() {
      PriceRangeFilter result = new PriceRangeFilter();
      result.max = this.max;
      result.min = this.min;
      return result;
    }

    /**
     * The maximum price in the range. Empty indicates no max price.
     */
    public Builder max(Double max) {
      this.max = max;
      return this;
    }

    /**
     * The minimum price in the range. Defaults to zero.
     */
    public Builder min(Double min) {
      this.min = min;
      return this;
    }
  }
}
