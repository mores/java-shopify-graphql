package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderEditRemoveShippingLinePayload {
  
  private CalculatedOrder calculatedOrder;

  
  private List<OrderEditRemoveShippingLineUserError> userErrors;

  public OrderEditRemoveShippingLinePayload() {
  }

  
  public CalculatedOrder getCalculatedOrder() {
    return calculatedOrder;
  }

  public void setCalculatedOrder(CalculatedOrder calculatedOrder) {
    this.calculatedOrder = calculatedOrder;
  }

  
  public List<OrderEditRemoveShippingLineUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderEditRemoveShippingLineUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderEditRemoveShippingLinePayload{calculatedOrder='" + calculatedOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditRemoveShippingLinePayload that = (OrderEditRemoveShippingLinePayload) o;
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

    
    private List<OrderEditRemoveShippingLineUserError> userErrors;

    public OrderEditRemoveShippingLinePayload build() {
      OrderEditRemoveShippingLinePayload result = new OrderEditRemoveShippingLinePayload();
      result.calculatedOrder = this.calculatedOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder calculatedOrder(CalculatedOrder calculatedOrder) {
      this.calculatedOrder = calculatedOrder;
      return this;
    }

    
    public Builder userErrors(List<OrderEditRemoveShippingLineUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
