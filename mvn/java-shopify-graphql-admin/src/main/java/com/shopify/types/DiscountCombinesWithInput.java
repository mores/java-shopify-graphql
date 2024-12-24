package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCombinesWithInput {
  
  private Boolean productDiscounts = false;

  
  private Boolean orderDiscounts = false;

  
  private Boolean shippingDiscounts = false;

  public DiscountCombinesWithInput() {
  }

  
  public Boolean getProductDiscounts() {
    return productDiscounts;
  }

  public void setProductDiscounts(Boolean productDiscounts) {
    this.productDiscounts = productDiscounts;
  }

  
  public Boolean getOrderDiscounts() {
    return orderDiscounts;
  }

  public void setOrderDiscounts(Boolean orderDiscounts) {
    this.orderDiscounts = orderDiscounts;
  }

  
  public Boolean getShippingDiscounts() {
    return shippingDiscounts;
  }

  public void setShippingDiscounts(Boolean shippingDiscounts) {
    this.shippingDiscounts = shippingDiscounts;
  }

  @Override
  public String toString() {
    return "DiscountCombinesWithInput{productDiscounts='" + productDiscounts + "', orderDiscounts='" + orderDiscounts + "', shippingDiscounts='" + shippingDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCombinesWithInput that = (DiscountCombinesWithInput) o;
    return Objects.equals(productDiscounts, that.productDiscounts) &&
        Objects.equals(orderDiscounts, that.orderDiscounts) &&
        Objects.equals(shippingDiscounts, that.shippingDiscounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDiscounts, orderDiscounts, shippingDiscounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean productDiscounts = false;

    
    private Boolean orderDiscounts = false;

    
    private Boolean shippingDiscounts = false;

    public DiscountCombinesWithInput build() {
      DiscountCombinesWithInput result = new DiscountCombinesWithInput();
      result.productDiscounts = this.productDiscounts;
      result.orderDiscounts = this.orderDiscounts;
      result.shippingDiscounts = this.shippingDiscounts;
      return result;
    }

    
    public Builder productDiscounts(Boolean productDiscounts) {
      this.productDiscounts = productDiscounts;
      return this;
    }

    
    public Builder orderDiscounts(Boolean orderDiscounts) {
      this.orderDiscounts = orderDiscounts;
      return this;
    }

    
    public Builder shippingDiscounts(Boolean shippingDiscounts) {
      this.shippingDiscounts = shippingDiscounts;
      return this;
    }
  }
}
