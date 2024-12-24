package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReverseDeliveryLineItemInput {
  
  private String reverseFulfillmentOrderLineItemId;

  
  private int quantity;

  public ReverseDeliveryLineItemInput() {
  }

  
  public String getReverseFulfillmentOrderLineItemId() {
    return reverseFulfillmentOrderLineItemId;
  }

  public void setReverseFulfillmentOrderLineItemId(String reverseFulfillmentOrderLineItemId) {
    this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryLineItemInput{reverseFulfillmentOrderLineItemId='" + reverseFulfillmentOrderLineItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryLineItemInput that = (ReverseDeliveryLineItemInput) o;
    return Objects.equals(reverseFulfillmentOrderLineItemId, that.reverseFulfillmentOrderLineItemId) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverseFulfillmentOrderLineItemId, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String reverseFulfillmentOrderLineItemId;

    
    private int quantity;

    public ReverseDeliveryLineItemInput build() {
      ReverseDeliveryLineItemInput result = new ReverseDeliveryLineItemInput();
      result.reverseFulfillmentOrderLineItemId = this.reverseFulfillmentOrderLineItemId;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder reverseFulfillmentOrderLineItemId(String reverseFulfillmentOrderLineItemId) {
      this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
