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
   * Whether the quantity rule fields match one increment, one minimum and no maximum.
   */
  private boolean isDefault;

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

  /**
   * Whether the values of the quantity rule were explicitly set.
   */
  private QuantityRuleOriginType originType;

  /**
   * The product variant for which the quantity rule is applied.
   */
  private ProductVariant productVariant;

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
   * Whether the quantity rule fields match one increment, one minimum and no maximum.
   */
  public boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(boolean isDefault) {
    this.isDefault = isDefault;
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

  /**
   * Whether the values of the quantity rule were explicitly set.
   */
  public QuantityRuleOriginType getOriginType() {
    return originType;
  }

  public void setOriginType(QuantityRuleOriginType originType) {
    this.originType = originType;
  }

  /**
   * The product variant for which the quantity rule is applied.
   */
  public ProductVariant getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(ProductVariant productVariant) {
    this.productVariant = productVariant;
  }

  @Override
  public String toString() {
    return "QuantityRule{increment='" + increment + "', isDefault='" + isDefault + "', maximum='" + maximum + "', minimum='" + minimum + "', originType='" + originType + "', productVariant='" + productVariant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityRule that = (QuantityRule) o;
    return increment == that.increment &&
        isDefault == that.isDefault &&
        Objects.equals(maximum, that.maximum) &&
        minimum == that.minimum &&
        Objects.equals(originType, that.originType) &&
        Objects.equals(productVariant, that.productVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increment, isDefault, maximum, minimum, originType, productVariant);
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
     * Whether the quantity rule fields match one increment, one minimum and no maximum.
     */
    private boolean isDefault;

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

    /**
     * Whether the values of the quantity rule were explicitly set.
     */
    private QuantityRuleOriginType originType;

    /**
     * The product variant for which the quantity rule is applied.
     */
    private ProductVariant productVariant;

    public QuantityRule build() {
      QuantityRule result = new QuantityRule();
      result.increment = this.increment;
      result.isDefault = this.isDefault;
      result.maximum = this.maximum;
      result.minimum = this.minimum;
      result.originType = this.originType;
      result.productVariant = this.productVariant;
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
     * Whether the quantity rule fields match one increment, one minimum and no maximum.
     */
    public Builder isDefault(boolean isDefault) {
      this.isDefault = isDefault;
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

    /**
     * Whether the values of the quantity rule were explicitly set.
     */
    public Builder originType(QuantityRuleOriginType originType) {
      this.originType = originType;
      return this;
    }

    /**
     * The product variant for which the quantity rule is applied.
     */
    public Builder productVariant(ProductVariant productVariant) {
      this.productVariant = productVariant;
      return this;
    }
  }
}
