package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderEditRemoveLineItemDiscountPayload {
  
  private CalculatedLineItem calculatedLineItem;

  
  private CalculatedOrder calculatedOrder;

  
  private List<UserError> userErrors;

  public OrderEditRemoveLineItemDiscountPayload() {
  }

  
  public CalculatedLineItem getCalculatedLineItem() {
    return calculatedLineItem;
  }

  public void setCalculatedLineItem(CalculatedLineItem calculatedLineItem) {
    this.calculatedLineItem = calculatedLineItem;
  }

  
  public CalculatedOrder getCalculatedOrder() {
    return calculatedOrder;
  }

  public void setCalculatedOrder(CalculatedOrder calculatedOrder) {
    this.calculatedOrder = calculatedOrder;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderEditRemoveLineItemDiscountPayload{calculatedLineItem='" + calculatedLineItem + "', calculatedOrder='" + calculatedOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditRemoveLineItemDiscountPayload that = (OrderEditRemoveLineItemDiscountPayload) o;
    return Objects.equals(calculatedLineItem, that.calculatedLineItem) &&
        Objects.equals(calculatedOrder, that.calculatedOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedLineItem, calculatedOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CalculatedLineItem calculatedLineItem;

    
    private CalculatedOrder calculatedOrder;

    
    private List<UserError> userErrors;

    public OrderEditRemoveLineItemDiscountPayload build() {
      OrderEditRemoveLineItemDiscountPayload result = new OrderEditRemoveLineItemDiscountPayload();
      result.calculatedLineItem = this.calculatedLineItem;
      result.calculatedOrder = this.calculatedOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder calculatedLineItem(CalculatedLineItem calculatedLineItem) {
      this.calculatedLineItem = calculatedLineItem;
      return this;
    }

    
    public Builder calculatedOrder(CalculatedOrder calculatedOrder) {
      this.calculatedOrder = calculatedOrder;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
