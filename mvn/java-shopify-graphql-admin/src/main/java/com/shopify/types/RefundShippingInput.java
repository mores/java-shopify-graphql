package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RefundShippingInput {
  
  private MoneyInput shippingRefundAmount;

  
  private Boolean fullRefund = false;

  public RefundShippingInput() {
  }

  
  public MoneyInput getShippingRefundAmount() {
    return shippingRefundAmount;
  }

  public void setShippingRefundAmount(MoneyInput shippingRefundAmount) {
    this.shippingRefundAmount = shippingRefundAmount;
  }

  
  public Boolean getFullRefund() {
    return fullRefund;
  }

  public void setFullRefund(Boolean fullRefund) {
    this.fullRefund = fullRefund;
  }

  @Override
  public String toString() {
    return "RefundShippingInput{shippingRefundAmount='" + shippingRefundAmount + "', fullRefund='" + fullRefund + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundShippingInput that = (RefundShippingInput) o;
    return Objects.equals(shippingRefundAmount, that.shippingRefundAmount) &&
        Objects.equals(fullRefund, that.fullRefund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingRefundAmount, fullRefund);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyInput shippingRefundAmount;

    
    private Boolean fullRefund = false;

    public RefundShippingInput build() {
      RefundShippingInput result = new RefundShippingInput();
      result.shippingRefundAmount = this.shippingRefundAmount;
      result.fullRefund = this.fullRefund;
      return result;
    }

    
    public Builder shippingRefundAmount(MoneyInput shippingRefundAmount) {
      this.shippingRefundAmount = shippingRefundAmount;
      return this;
    }

    
    public Builder fullRefund(Boolean fullRefund) {
      this.fullRefund = fullRefund;
      return this;
    }
  }
}
