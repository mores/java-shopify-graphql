package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the per-order quantity rule to be applied on the product variant.
 */
public class QuantityRuleInput {
  /**
   * The quantity increment.
   */
  private int increment;

  /**
   * The maximum quantity.
   */
  private Integer maximum = null;

  /**
   * The minimum quantity.
   */
  private int minimum;

  /**
   * Product variant on which to apply the quantity rule.
   */
  private String variantId;

  public QuantityRuleInput() {
  }

  /**
   * The quantity increment.
   */
  public int getIncrement() {
    return increment;
  }

  public void setIncrement(int increment) {
    this.increment = increment;
  }

  /**
   * The maximum quantity.
   */
  public Integer getMaximum() {
    return maximum;
  }

  public void setMaximum(Integer maximum) {
    this.maximum = maximum;
  }

  /**
   * The minimum quantity.
   */
  public int getMinimum() {
    return minimum;
  }

  public void setMinimum(int minimum) {
    this.minimum = minimum;
  }

  /**
   * Product variant on which to apply the quantity rule.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  @Override
  public String toString() {
    return "QuantityRuleInput{increment='" + increment + "', maximum='" + maximum + "', minimum='" + minimum + "', variantId='" + variantId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityRuleInput that = (QuantityRuleInput) o;
    return increment == that.increment &&
        Objects.equals(maximum, that.maximum) &&
        minimum == that.minimum &&
        Objects.equals(variantId, that.variantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increment, maximum, minimum, variantId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity increment.
     */
    private int increment;

    /**
     * The maximum quantity.
     */
    private Integer maximum = null;

    /**
     * The minimum quantity.
     */
    private int minimum;

    /**
     * Product variant on which to apply the quantity rule.
     */
    private String variantId;

    public QuantityRuleInput build() {
      QuantityRuleInput result = new QuantityRuleInput();
      result.increment = this.increment;
      result.maximum = this.maximum;
      result.minimum = this.minimum;
      result.variantId = this.variantId;
      return result;
    }

    /**
     * The quantity increment.
     */
    public Builder increment(int increment) {
      this.increment = increment;
      return this;
    }

    /**
     * The maximum quantity.
     */
    public Builder maximum(Integer maximum) {
      this.maximum = maximum;
      return this;
    }

    /**
     * The minimum quantity.
     */
    public Builder minimum(int minimum) {
      this.minimum = minimum;
      return this;
    }

    /**
     * Product variant on which to apply the quantity rule.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }
  }
}
