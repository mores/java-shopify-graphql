package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCombinesWith {
  
  private boolean orderDiscounts;

  
  private boolean productDiscounts;

  
  private boolean shippingDiscounts;

  public DiscountCombinesWith() {
  }

  
  public boolean getOrderDiscounts() {
    return orderDiscounts;
  }

  public void setOrderDiscounts(boolean orderDiscounts) {
    this.orderDiscounts = orderDiscounts;
  }

  
  public boolean getProductDiscounts() {
    return productDiscounts;
  }

  public void setProductDiscounts(boolean productDiscounts) {
    this.productDiscounts = productDiscounts;
  }

  
  public boolean getShippingDiscounts() {
    return shippingDiscounts;
  }

  public void setShippingDiscounts(boolean shippingDiscounts) {
    this.shippingDiscounts = shippingDiscounts;
  }

  @Override
  public String toString() {
    return "DiscountCombinesWith{orderDiscounts='" + orderDiscounts + "', productDiscounts='" + productDiscounts + "', shippingDiscounts='" + shippingDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCombinesWith that = (DiscountCombinesWith) o;
    return orderDiscounts == that.orderDiscounts &&
        productDiscounts == that.productDiscounts &&
        shippingDiscounts == that.shippingDiscounts;
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderDiscounts, productDiscounts, shippingDiscounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean orderDiscounts;

    
    private boolean productDiscounts;

    
    private boolean shippingDiscounts;

    public DiscountCombinesWith build() {
      DiscountCombinesWith result = new DiscountCombinesWith();
      result.orderDiscounts = this.orderDiscounts;
      result.productDiscounts = this.productDiscounts;
      result.shippingDiscounts = this.shippingDiscounts;
      return result;
    }

    
    public Builder orderDiscounts(boolean orderDiscounts) {
      this.orderDiscounts = orderDiscounts;
      return this;
    }

    
    public Builder productDiscounts(boolean productDiscounts) {
      this.productDiscounts = productDiscounts;
      return this;
    }

    
    public Builder shippingDiscounts(boolean shippingDiscounts) {
      this.shippingDiscounts = shippingDiscounts;
      return this;
    }
  }
}
