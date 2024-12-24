package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CalculateReturnLineItemInput {
  
  private String fulfillmentLineItemId;

  
  private RestockingFeeInput restockingFee;

  
  private int quantity;

  public CalculateReturnLineItemInput() {
  }

  
  public String getFulfillmentLineItemId() {
    return fulfillmentLineItemId;
  }

  public void setFulfillmentLineItemId(String fulfillmentLineItemId) {
    this.fulfillmentLineItemId = fulfillmentLineItemId;
  }

  
  public RestockingFeeInput getRestockingFee() {
    return restockingFee;
  }

  public void setRestockingFee(RestockingFeeInput restockingFee) {
    this.restockingFee = restockingFee;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "CalculateReturnLineItemInput{fulfillmentLineItemId='" + fulfillmentLineItemId + "', restockingFee='" + restockingFee + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculateReturnLineItemInput that = (CalculateReturnLineItemInput) o;
    return Objects.equals(fulfillmentLineItemId, that.fulfillmentLineItemId) &&
        Objects.equals(restockingFee, that.restockingFee) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItemId, restockingFee, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fulfillmentLineItemId;

    
    private RestockingFeeInput restockingFee;

    
    private int quantity;

    public CalculateReturnLineItemInput build() {
      CalculateReturnLineItemInput result = new CalculateReturnLineItemInput();
      result.fulfillmentLineItemId = this.fulfillmentLineItemId;
      result.restockingFee = this.restockingFee;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder fulfillmentLineItemId(String fulfillmentLineItemId) {
      this.fulfillmentLineItemId = fulfillmentLineItemId;
      return this;
    }

    
    public Builder restockingFee(RestockingFeeInput restockingFee) {
      this.restockingFee = restockingFee;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
