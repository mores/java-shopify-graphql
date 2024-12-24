package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderEditAddShippingLinePayload {
  
  private CalculatedOrder calculatedOrder;

  
  private CalculatedShippingLine calculatedShippingLine;

  
  private List<OrderEditAddShippingLineUserError> userErrors;

  public OrderEditAddShippingLinePayload() {
  }

  
  public CalculatedOrder getCalculatedOrder() {
    return calculatedOrder;
  }

  public void setCalculatedOrder(CalculatedOrder calculatedOrder) {
    this.calculatedOrder = calculatedOrder;
  }

  
  public CalculatedShippingLine getCalculatedShippingLine() {
    return calculatedShippingLine;
  }

  public void setCalculatedShippingLine(CalculatedShippingLine calculatedShippingLine) {
    this.calculatedShippingLine = calculatedShippingLine;
  }

  
  public List<OrderEditAddShippingLineUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderEditAddShippingLineUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderEditAddShippingLinePayload{calculatedOrder='" + calculatedOrder + "', calculatedShippingLine='" + calculatedShippingLine + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditAddShippingLinePayload that = (OrderEditAddShippingLinePayload) o;
    return Objects.equals(calculatedOrder, that.calculatedOrder) &&
        Objects.equals(calculatedShippingLine, that.calculatedShippingLine) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedOrder, calculatedShippingLine, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CalculatedOrder calculatedOrder;

    
    private CalculatedShippingLine calculatedShippingLine;

    
    private List<OrderEditAddShippingLineUserError> userErrors;

    public OrderEditAddShippingLinePayload build() {
      OrderEditAddShippingLinePayload result = new OrderEditAddShippingLinePayload();
      result.calculatedOrder = this.calculatedOrder;
      result.calculatedShippingLine = this.calculatedShippingLine;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder calculatedOrder(CalculatedOrder calculatedOrder) {
      this.calculatedOrder = calculatedOrder;
      return this;
    }

    
    public Builder calculatedShippingLine(CalculatedShippingLine calculatedShippingLine) {
      this.calculatedShippingLine = calculatedShippingLine;
      return this;
    }

    
    public Builder userErrors(List<OrderEditAddShippingLineUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
