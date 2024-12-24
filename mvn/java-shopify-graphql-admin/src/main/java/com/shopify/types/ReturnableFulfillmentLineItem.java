package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReturnableFulfillmentLineItem {
  
  private FulfillmentLineItem fulfillmentLineItem;

  
  private int quantity;

  public ReturnableFulfillmentLineItem() {
  }

  
  public FulfillmentLineItem getFulfillmentLineItem() {
    return fulfillmentLineItem;
  }

  public void setFulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
    this.fulfillmentLineItem = fulfillmentLineItem;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ReturnableFulfillmentLineItem{fulfillmentLineItem='" + fulfillmentLineItem + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnableFulfillmentLineItem that = (ReturnableFulfillmentLineItem) o;
    return Objects.equals(fulfillmentLineItem, that.fulfillmentLineItem) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItem, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentLineItem fulfillmentLineItem;

    
    private int quantity;

    public ReturnableFulfillmentLineItem build() {
      ReturnableFulfillmentLineItem result = new ReturnableFulfillmentLineItem();
      result.fulfillmentLineItem = this.fulfillmentLineItem;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder fulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
      this.fulfillmentLineItem = fulfillmentLineItem;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
