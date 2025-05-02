package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The initial payment due for the purchase.
 */
public class SellingPlanCheckoutCharge {
  /**
   * The charge type for the checkout charge.
   */
  private SellingPlanCheckoutChargeType type;

  /**
   * The charge value for the checkout charge.
   */
  private SellingPlanCheckoutChargeValue value;

  public SellingPlanCheckoutCharge() {
  }

  /**
   * The charge type for the checkout charge.
   */
  public SellingPlanCheckoutChargeType getType() {
    return type;
  }

  public void setType(SellingPlanCheckoutChargeType type) {
    this.type = type;
  }

  /**
   * The charge value for the checkout charge.
   */
  public SellingPlanCheckoutChargeValue getValue() {
    return value;
  }

  public void setValue(SellingPlanCheckoutChargeValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SellingPlanCheckoutCharge{type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanCheckoutCharge that = (SellingPlanCheckoutCharge) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
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
     * The charge type for the checkout charge.
     */
    private SellingPlanCheckoutChargeType type;

    /**
     * The charge value for the checkout charge.
     */
    private SellingPlanCheckoutChargeValue value;

    public SellingPlanCheckoutCharge build() {
      SellingPlanCheckoutCharge result = new SellingPlanCheckoutCharge();
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The charge type for the checkout charge.
     */
    public Builder type(SellingPlanCheckoutChargeType type) {
      this.type = type;
      return this;
    }

    /**
     * The charge value for the checkout charge.
     */
    public Builder value(SellingPlanCheckoutChargeValue value) {
      this.value = value;
      return this;
    }
  }
}
