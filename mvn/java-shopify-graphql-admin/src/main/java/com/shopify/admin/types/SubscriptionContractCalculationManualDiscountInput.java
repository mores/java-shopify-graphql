package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a manual (merchant-specified) discount used for contract calculation.
 * This is a oneOf input: one, and only one, field can be provided.
 * Line-scoped discounts are provided on the line inputs instead. Discount codes are provided
 * through the separate `discountCodes` field.
 */
public class SubscriptionContractCalculationManualDiscountInput {
  /**
   * Input for an order discount that applies to all lines on the contract.
   */
  private SubscriptionContractCalculationOrderDiscountInput orderDiscount;

  /**
   * Input for a delivery discount that applies to the shipping line.
   */
  private SubscriptionContractCalculationDeliveryDiscountInput deliveryDiscount;

  public SubscriptionContractCalculationManualDiscountInput() {
  }

  /**
   * Input for an order discount that applies to all lines on the contract.
   */
  public SubscriptionContractCalculationOrderDiscountInput getOrderDiscount() {
    return orderDiscount;
  }

  public void setOrderDiscount(SubscriptionContractCalculationOrderDiscountInput orderDiscount) {
    this.orderDiscount = orderDiscount;
  }

  /**
   * Input for a delivery discount that applies to the shipping line.
   */
  public SubscriptionContractCalculationDeliveryDiscountInput getDeliveryDiscount() {
    return deliveryDiscount;
  }

  public void setDeliveryDiscount(
      SubscriptionContractCalculationDeliveryDiscountInput deliveryDiscount) {
    this.deliveryDiscount = deliveryDiscount;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationManualDiscountInput{orderDiscount='" + orderDiscount + "', deliveryDiscount='" + deliveryDiscount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationManualDiscountInput that = (SubscriptionContractCalculationManualDiscountInput) o;
    return Objects.equals(orderDiscount, that.orderDiscount) &&
        Objects.equals(deliveryDiscount, that.deliveryDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderDiscount, deliveryDiscount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Input for an order discount that applies to all lines on the contract.
     */
    private SubscriptionContractCalculationOrderDiscountInput orderDiscount;

    /**
     * Input for a delivery discount that applies to the shipping line.
     */
    private SubscriptionContractCalculationDeliveryDiscountInput deliveryDiscount;

    public SubscriptionContractCalculationManualDiscountInput build() {
      SubscriptionContractCalculationManualDiscountInput result = new SubscriptionContractCalculationManualDiscountInput();
      result.orderDiscount = this.orderDiscount;
      result.deliveryDiscount = this.deliveryDiscount;
      return result;
    }

    /**
     * Input for an order discount that applies to all lines on the contract.
     */
    public Builder orderDiscount(SubscriptionContractCalculationOrderDiscountInput orderDiscount) {
      this.orderDiscount = orderDiscount;
      return this;
    }

    /**
     * Input for a delivery discount that applies to the shipping line.
     */
    public Builder deliveryDiscount(
        SubscriptionContractCalculationDeliveryDiscountInput deliveryDiscount) {
      this.deliveryDiscount = deliveryDiscount;
      return this;
    }
  }
}
