package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The quantity rule for the product variant in a given context.
 */
public class QuantityRule {
  /**
   * The value that specifies the quantity increment between minimum and maximum of the rule.
   * Only quantities divisible by this value will be considered valid.
   *   
   * The increment must be lower than or equal to the minimum and the maximum, and both minimum and maximum
   * must be divisible by this value.
   */
  private int increment;

  /**
   * An optional value that defines the highest allowed quantity purchased by the customer.
   * If defined, maximum must be lower than or equal to the minimum and must be a multiple of the increment.
   */
  private Integer maximum;

  /**
   * The value that defines the lowest allowed quantity purchased by the customer.
   * The minimum must be a multiple of the quantity rule's increment.
   */
  private int minimum;

  public QuantityRule() {
  }

  /**
   * The value that specifies the quantity increment between minimum and maximum of the rule.
   * Only quantities divisible by this value will be considered valid.
   *   
   * The increment must be lower than or equal to the minimum and the maximum, and both minimum and maximum
   * must be divisible by this value.
   */
  public int getIncrement() {
    return increment;
  }

  public void setIncrement(int increment) {
    this.increment = increment;
  }

  /**
   * An optional value that defines the highest allowed quantity purchased by the customer.
   * If defined, maximum must be lower than or equal to the minimum and must be a multiple of the increment.
   */
  public Integer getMaximum() {
    return maximum;
  }

  public void setMaximum(Integer maximum) {
    this.maximum = maximum;
  }

  /**
   * The value that defines the lowest allowed quantity purchased by the customer.
   * The minimum must be a multiple of the quantity rule's increment.
   */
  public int getMinimum() {
    return minimum;
  }

  public void setMinimum(int minimum) {
    this.minimum = minimum;
  }

  @Override
  public String toString() {
    return "QuantityRule{increment='" + increment + "', maximum='" + maximum + "', minimum='" + minimum + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityRule that = (QuantityRule) o;
    return increment == that.increment &&
        Objects.equals(maximum, that.maximum) &&
        minimum == that.minimum;
  }

  @Override
  public int hashCode() {
    return Objects.hash(increment, maximum, minimum);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value that specifies the quantity increment between minimum and maximum of the rule.
     * Only quantities divisible by this value will be considered valid.
     *   
     * The increment must be lower than or equal to the minimum and the maximum, and both minimum and maximum
     * must be divisible by this value.
     */
    private int increment;

    /**
     * An optional value that defines the highest allowed quantity purchased by the customer.
     * If defined, maximum must be lower than or equal to the minimum and must be a multiple of the increment.
     */
    private Integer maximum;

    /**
     * The value that defines the lowest allowed quantity purchased by the customer.
     * The minimum must be a multiple of the quantity rule's increment.
     */
    private int minimum;

    public QuantityRule build() {
      QuantityRule result = new QuantityRule();
      result.increment = this.increment;
      result.maximum = this.maximum;
      result.minimum = this.minimum;
      return result;
    }

    /**
     * The value that specifies the quantity increment between minimum and maximum of the rule.
     * Only quantities divisible by this value will be considered valid.
     *   
     * The increment must be lower than or equal to the minimum and the maximum, and both minimum and maximum
     * must be divisible by this value.
     */
    public Builder increment(int increment) {
      this.increment = increment;
      return this;
    }

    /**
     * An optional value that defines the highest allowed quantity purchased by the customer.
     * If defined, maximum must be lower than or equal to the minimum and must be a multiple of the increment.
     */
    public Builder maximum(Integer maximum) {
      this.maximum = maximum;
      return this;
    }

    /**
     * The value that defines the lowest allowed quantity purchased by the customer.
     * The minimum must be a multiple of the quantity rule's increment.
     */
    public Builder minimum(int minimum) {
      this.minimum = minimum;
      return this;
    }
  }
}
