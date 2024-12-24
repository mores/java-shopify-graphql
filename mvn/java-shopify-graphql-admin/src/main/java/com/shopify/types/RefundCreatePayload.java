package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class RefundCreatePayload {
  
  private Order order;

  
  private Refund refund;

  
  private List<UserError> userErrors;

  public RefundCreatePayload() {
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public Refund getRefund() {
    return refund;
  }

  public void setRefund(Refund refund) {
    this.refund = refund;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "RefundCreatePayload{order='" + order + "', refund='" + refund + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundCreatePayload that = (RefundCreatePayload) o;
    return Objects.equals(order, that.order) &&
        Objects.equals(refund, that.refund) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, refund, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Order order;

    
    private Refund refund;

    
    private List<UserError> userErrors;

    public RefundCreatePayload build() {
      RefundCreatePayload result = new RefundCreatePayload();
      result.order = this.order;
      result.refund = this.refund;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder refund(Refund refund) {
      this.refund = refund;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
