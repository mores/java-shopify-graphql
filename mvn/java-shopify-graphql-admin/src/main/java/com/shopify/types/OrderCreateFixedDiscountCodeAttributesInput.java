package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a fixed amount discount code to apply to an order.
 */
public class OrderCreateFixedDiscountCodeAttributesInput {
  /**
   * The discount code that was entered at checkout.
   */
  private String code;

  /**
   * The amount that's deducted from the order total. When you create an order, this value is the monetary amount to deduct.
   */
  private MoneyBagInput amountSet;

  public OrderCreateFixedDiscountCodeAttributesInput() {
  }

  /**
   * The discount code that was entered at checkout.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The amount that's deducted from the order total. When you create an order, this value is the monetary amount to deduct.
   */
  public MoneyBagInput getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBagInput amountSet) {
    this.amountSet = amountSet;
  }

  @Override
  public String toString() {
    return "OrderCreateFixedDiscountCodeAttributesInput{code='" + code + "', amountSet='" + amountSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateFixedDiscountCodeAttributesInput that = (OrderCreateFixedDiscountCodeAttributesInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(amountSet, that.amountSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, amountSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount code that was entered at checkout.
     */
    private String code;

    /**
     * The amount that's deducted from the order total. When you create an order, this value is the monetary amount to deduct.
     */
    private MoneyBagInput amountSet;

    public OrderCreateFixedDiscountCodeAttributesInput build() {
      OrderCreateFixedDiscountCodeAttributesInput result = new OrderCreateFixedDiscountCodeAttributesInput();
      result.code = this.code;
      result.amountSet = this.amountSet;
      return result;
    }

    /**
     * The discount code that was entered at checkout.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The amount that's deducted from the order total. When you create an order, this value is the monetary amount to deduct.
     */
    public Builder amountSet(MoneyBagInput amountSet) {
      this.amountSet = amountSet;
      return this;
    }
  }
}
