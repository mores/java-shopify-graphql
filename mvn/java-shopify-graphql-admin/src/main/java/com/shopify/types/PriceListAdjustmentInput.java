package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to set a price list adjustment.
 */
public class PriceListAdjustmentInput {
  /**
   * The value of the price adjustment as specified by the `type`.
   */
  private double value;

  /**
   * The type of price adjustment, such as percentage increase or decrease.
   */
  private PriceListAdjustmentType type;

  public PriceListAdjustmentInput() {
  }

  /**
   * The value of the price adjustment as specified by the `type`.
   */
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
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

  @Override
  public String toString() {
    return "PriceListAdjustmentInput{value='" + value + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListAdjustmentInput that = (PriceListAdjustmentInput) o;
    return value == that.value &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value of the price adjustment as specified by the `type`.
     */
    private double value;

    /**
     * The type of price adjustment, such as percentage increase or decrease.
     */
    private PriceListAdjustmentType type;

    public PriceListAdjustmentInput build() {
      PriceListAdjustmentInput result = new PriceListAdjustmentInput();
      result.value = this.value;
      result.type = this.type;
      return result;
    }

    /**
     * The value of the price adjustment as specified by the `type`.
     */
    public Builder value(double value) {
      this.value = value;
      return this;
    }

    /**
     * The type of price adjustment, such as percentage increase or decrease.
     */
    public Builder type(PriceListAdjustmentType type) {
      this.type = type;
      return this;
    }
  }
}
