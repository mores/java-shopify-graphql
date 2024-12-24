package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderMergeInputMergeIntent {
  
  private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

  
  private String fulfillmentOrderId;

  public FulfillmentOrderMergeInputMergeIntent() {
  }

  
  public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
    return fulfillmentOrderLineItems;
  }

  public void setFulfillmentOrderLineItems(
      List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
    this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
  }

  
  public String getFulfillmentOrderId() {
    return fulfillmentOrderId;
  }

  public void setFulfillmentOrderId(String fulfillmentOrderId) {
    this.fulfillmentOrderId = fulfillmentOrderId;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderMergeInputMergeIntent{fulfillmentOrderLineItems='" + fulfillmentOrderLineItems + "', fulfillmentOrderId='" + fulfillmentOrderId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderMergeInputMergeIntent that = (FulfillmentOrderMergeInputMergeIntent) o;
    return Objects.equals(fulfillmentOrderLineItems, that.fulfillmentOrderLineItems) &&
        Objects.equals(fulfillmentOrderId, that.fulfillmentOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderLineItems, fulfillmentOrderId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

    
    private String fulfillmentOrderId;

    public FulfillmentOrderMergeInputMergeIntent build() {
      FulfillmentOrderMergeInputMergeIntent result = new FulfillmentOrderMergeInputMergeIntent();
      result.fulfillmentOrderLineItems = this.fulfillmentOrderLineItems;
      result.fulfillmentOrderId = this.fulfillmentOrderId;
      return result;
    }

    
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      return this;
    }

    
    public Builder fulfillmentOrderId(String fulfillmentOrderId) {
      this.fulfillmentOrderId = fulfillmentOrderId;
      return this;
    }
  }
}
