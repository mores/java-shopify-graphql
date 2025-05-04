package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The type and value of a price list adjustment.
 *
 * For more information on price lists, refer to
 * [Support different pricing models](https://shopify.dev/apps/internationalization/product-price-lists).
 */
public class PriceListAdjustment {
  /**
   * The type of price adjustment, such as percentage increase or decrease.
   */
  private PriceListAdjustmentType type;

  /**
   * The value of price adjustment, where positive numbers reduce the prices and negative numbers
   * increase them.
   */
  private double value;

  public PriceListAdjustment() {
  }

  /**
   * The type of price adjustment, such as percentage increase or decrease.
   */
  public PriceListAdjustmentType getType() {
    return type;
  }

  public void setType(PriceListAdjustmentType type) {
    this.type = type;
  }

  /**
   * The value of price adjustment, where positive numbers reduce the prices and negative numbers
   * increase them.
   */
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "PriceListAdjustment{type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListAdjustment that = (PriceListAdjustment) o;
    return Objects.equals(type, that.type) &&
        value == that.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of price adjustment, such as percentage increase or decrease.
     */
    private PriceListAdjustmentType type;

    /**
     * The value of price adjustment, where positive numbers reduce the prices and negative numbers
     * increase them.
     */
    private double value;

    public PriceListAdjustment build() {
      PriceListAdjustment result = new PriceListAdjustment();
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The type of price adjustment, such as percentage increase or decrease.
     */
    public Builder type(PriceListAdjustmentType type) {
      this.type = type;
      return this;
    }

    /**
     * The value of price adjustment, where positive numbers reduce the prices and negative numbers
     * increase them.
     */
    public Builder value(double value) {
      this.value = value;
      return this;
    }
  }
}
