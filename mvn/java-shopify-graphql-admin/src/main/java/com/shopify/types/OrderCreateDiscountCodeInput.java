package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderCreateDiscountCodeInput {
  
  private OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode;

  
  private OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode;

  
  private OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode;

  public OrderCreateDiscountCodeInput() {
  }

  
  public OrderCreatePercentageDiscountCodeAttributesInput getItemPercentageDiscountCode() {
    return itemPercentageDiscountCode;
  }

  public void setItemPercentageDiscountCode(
      OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode) {
    this.itemPercentageDiscountCode = itemPercentageDiscountCode;
  }

  
  public OrderCreateFixedDiscountCodeAttributesInput getItemFixedDiscountCode() {
    return itemFixedDiscountCode;
  }

  public void setItemFixedDiscountCode(
      OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode) {
    this.itemFixedDiscountCode = itemFixedDiscountCode;
  }

  
  public OrderCreateFreeShippingDiscountCodeAttributesInput getFreeShippingDiscountCode() {
    return freeShippingDiscountCode;
  }

  public void setFreeShippingDiscountCode(
      OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode) {
    this.freeShippingDiscountCode = freeShippingDiscountCode;
  }

  @Override
  public String toString() {
    return "OrderCreateDiscountCodeInput{itemPercentageDiscountCode='" + itemPercentageDiscountCode + "', itemFixedDiscountCode='" + itemFixedDiscountCode + "', freeShippingDiscountCode='" + freeShippingDiscountCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateDiscountCodeInput that = (OrderCreateDiscountCodeInput) o;
    return Objects.equals(itemPercentageDiscountCode, that.itemPercentageDiscountCode) &&
        Objects.equals(itemFixedDiscountCode, that.itemFixedDiscountCode) &&
        Objects.equals(freeShippingDiscountCode, that.freeShippingDiscountCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemPercentageDiscountCode, itemFixedDiscountCode, freeShippingDiscountCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode;

    
    private OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode;

    
    private OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode;

    public OrderCreateDiscountCodeInput build() {
      OrderCreateDiscountCodeInput result = new OrderCreateDiscountCodeInput();
      result.itemPercentageDiscountCode = this.itemPercentageDiscountCode;
      result.itemFixedDiscountCode = this.itemFixedDiscountCode;
      result.freeShippingDiscountCode = this.freeShippingDiscountCode;
      return result;
    }

    
    public Builder itemPercentageDiscountCode(
        OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode) {
      this.itemPercentageDiscountCode = itemPercentageDiscountCode;
      return this;
    }

    
    public Builder itemFixedDiscountCode(
        OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode) {
      this.itemFixedDiscountCode = itemFixedDiscountCode;
      return this;
    }

    
    public Builder freeShippingDiscountCode(
        OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode) {
      this.freeShippingDiscountCode = freeShippingDiscountCode;
      return this;
    }
  }
}
