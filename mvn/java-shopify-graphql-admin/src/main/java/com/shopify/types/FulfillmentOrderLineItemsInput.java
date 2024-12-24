package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderLineItemsInput {
  
  private String fulfillmentOrderId;

  
  private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

  public FulfillmentOrderLineItemsInput() {
  }

  
  public String getFulfillmentOrderId() {
    return fulfillmentOrderId;
  }

  public void setFulfillmentOrderId(String fulfillmentOrderId) {
    this.fulfillmentOrderId = fulfillmentOrderId;
  }

  
  public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
    return fulfillmentOrderLineItems;
  }

  public void setFulfillmentOrderLineItems(
      List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
    this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItemsInput{fulfillmentOrderId='" + fulfillmentOrderId + "', fulfillmentOrderLineItems='" + fulfillmentOrderLineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItemsInput that = (FulfillmentOrderLineItemsInput) o;
    return Objects.equals(fulfillmentOrderId, that.fulfillmentOrderId) &&
        Objects.equals(fulfillmentOrderLineItems, that.fulfillmentOrderLineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderId, fulfillmentOrderLineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fulfillmentOrderId;

    
    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

    public FulfillmentOrderLineItemsInput build() {
      FulfillmentOrderLineItemsInput result = new FulfillmentOrderLineItemsInput();
      result.fulfillmentOrderId = this.fulfillmentOrderId;
      result.fulfillmentOrderLineItems = this.fulfillmentOrderLineItems;
      return result;
    }

    
    public Builder fulfillmentOrderId(String fulfillmentOrderId) {
      this.fulfillmentOrderId = fulfillmentOrderId;
      return this;
    }

    
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      return this;
    }
  }
}
