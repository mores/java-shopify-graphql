package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a free shipping discount code to apply to an order.
 */
public class OrderCreateFreeShippingDiscountCodeAttributesInput {
  /**
   * The discount code that was entered at checkout.
   */
  private String code;

  public OrderCreateFreeShippingDiscountCodeAttributesInput() {
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

  @Override
  public String toString() {
    return "OrderCreateFreeShippingDiscountCodeAttributesInput{code='" + code + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateFreeShippingDiscountCodeAttributesInput that = (OrderCreateFreeShippingDiscountCodeAttributesInput) o;
    return Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount code that was entered at checkout.
     */
    private String code;

    public OrderCreateFreeShippingDiscountCodeAttributesInput build() {
      OrderCreateFreeShippingDiscountCodeAttributesInput result = new OrderCreateFreeShippingDiscountCodeAttributesInput();
      result.code = this.code;
      return result;
    }

    /**
     * The discount code that was entered at checkout.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }
  }
}
