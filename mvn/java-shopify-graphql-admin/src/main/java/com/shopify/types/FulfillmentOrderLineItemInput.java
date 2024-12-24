package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentOrderLineItemInput {
  
  private String id;

  
  private int quantity;

  public FulfillmentOrderLineItemInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItemInput{id='" + id + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItemInput that = (FulfillmentOrderLineItemInput) o;
    return Objects.equals(id, that.id) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private int quantity;

    public FulfillmentOrderLineItemInput build() {
      FulfillmentOrderLineItemInput result = new FulfillmentOrderLineItemInput();
      result.id = this.id;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
