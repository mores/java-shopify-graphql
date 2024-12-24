package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderEditRemoveDiscountPayload {
  
  private CalculatedOrder calculatedOrder;

  
  private List<OrderEditRemoveDiscountUserError> userErrors;

  public OrderEditRemoveDiscountPayload() {
  }

  
  public CalculatedOrder getCalculatedOrder() {
    return calculatedOrder;
  }

  public void setCalculatedOrder(CalculatedOrder calculatedOrder) {
    this.calculatedOrder = calculatedOrder;
  }

  
  public List<OrderEditRemoveDiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderEditRemoveDiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderEditRemoveDiscountPayload{calculatedOrder='" + calculatedOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditRemoveDiscountPayload that = (OrderEditRemoveDiscountPayload) o;
    return Objects.equals(calculatedOrder, that.calculatedOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CalculatedOrder calculatedOrder;

    
    private List<OrderEditRemoveDiscountUserError> userErrors;

    public OrderEditRemoveDiscountPayload build() {
      OrderEditRemoveDiscountPayload result = new OrderEditRemoveDiscountPayload();
      result.calculatedOrder = this.calculatedOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder calculatedOrder(CalculatedOrder calculatedOrder) {
      this.calculatedOrder = calculatedOrder;
      return this;
    }

    
    public Builder userErrors(List<OrderEditRemoveDiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
