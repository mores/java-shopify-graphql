package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderEditUpdateShippingLinePayload {
  
  private CalculatedOrder calculatedOrder;

  
  private List<OrderEditUpdateShippingLineUserError> userErrors;

  public OrderEditUpdateShippingLinePayload() {
  }

  
  public CalculatedOrder getCalculatedOrder() {
    return calculatedOrder;
  }

  public void setCalculatedOrder(CalculatedOrder calculatedOrder) {
    this.calculatedOrder = calculatedOrder;
  }

  
  public List<OrderEditUpdateShippingLineUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderEditUpdateShippingLineUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderEditUpdateShippingLinePayload{calculatedOrder='" + calculatedOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditUpdateShippingLinePayload that = (OrderEditUpdateShippingLinePayload) o;
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

    
    private List<OrderEditUpdateShippingLineUserError> userErrors;

    public OrderEditUpdateShippingLinePayload build() {
      OrderEditUpdateShippingLinePayload result = new OrderEditUpdateShippingLinePayload();
      result.calculatedOrder = this.calculatedOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder calculatedOrder(CalculatedOrder calculatedOrder) {
      this.calculatedOrder = calculatedOrder;
      return this;
    }

    
    public Builder userErrors(List<OrderEditUpdateShippingLineUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
