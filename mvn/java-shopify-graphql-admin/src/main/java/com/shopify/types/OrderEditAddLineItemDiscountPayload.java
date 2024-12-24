package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderEditAddLineItemDiscountPayload {
  
  private OrderStagedChangeAddLineItemDiscount addedDiscountStagedChange;

  
  private CalculatedLineItem calculatedLineItem;

  
  private CalculatedOrder calculatedOrder;

  
  private List<UserError> userErrors;

  public OrderEditAddLineItemDiscountPayload() {
  }

  
  public OrderStagedChangeAddLineItemDiscount getAddedDiscountStagedChange() {
    return addedDiscountStagedChange;
  }

  public void setAddedDiscountStagedChange(
      OrderStagedChangeAddLineItemDiscount addedDiscountStagedChange) {
    this.addedDiscountStagedChange = addedDiscountStagedChange;
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
    return "OrderEditAddLineItemDiscountPayload{addedDiscountStagedChange='" + addedDiscountStagedChange + "', calculatedLineItem='" + calculatedLineItem + "', calculatedOrder='" + calculatedOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditAddLineItemDiscountPayload that = (OrderEditAddLineItemDiscountPayload) o;
    return Objects.equals(addedDiscountStagedChange, that.addedDiscountStagedChange) &&
        Objects.equals(calculatedLineItem, that.calculatedLineItem) &&
        Objects.equals(calculatedOrder, that.calculatedOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedDiscountStagedChange, calculatedLineItem, calculatedOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OrderStagedChangeAddLineItemDiscount addedDiscountStagedChange;

    
    private CalculatedLineItem calculatedLineItem;

    
    private CalculatedOrder calculatedOrder;

    
    private List<UserError> userErrors;

    public OrderEditAddLineItemDiscountPayload build() {
      OrderEditAddLineItemDiscountPayload result = new OrderEditAddLineItemDiscountPayload();
      result.addedDiscountStagedChange = this.addedDiscountStagedChange;
      result.calculatedLineItem = this.calculatedLineItem;
      result.calculatedOrder = this.calculatedOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder addedDiscountStagedChange(
        OrderStagedChangeAddLineItemDiscount addedDiscountStagedChange) {
      this.addedDiscountStagedChange = addedDiscountStagedChange;
      return this;
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
