package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PreparedFulfillmentOrderLineItemsInput {
  
  private String fulfillmentOrderId;

  public PreparedFulfillmentOrderLineItemsInput() {
  }

  
  public String getFulfillmentOrderId() {
    return fulfillmentOrderId;
  }

  public void setFulfillmentOrderId(String fulfillmentOrderId) {
    this.fulfillmentOrderId = fulfillmentOrderId;
  }

  @Override
  public String toString() {
    return "PreparedFulfillmentOrderLineItemsInput{fulfillmentOrderId='" + fulfillmentOrderId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PreparedFulfillmentOrderLineItemsInput that = (PreparedFulfillmentOrderLineItemsInput) o;
    return Objects.equals(fulfillmentOrderId, that.fulfillmentOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fulfillmentOrderId;

    public PreparedFulfillmentOrderLineItemsInput build() {
      PreparedFulfillmentOrderLineItemsInput result = new PreparedFulfillmentOrderLineItemsInput();
      result.fulfillmentOrderId = this.fulfillmentOrderId;
      return result;
    }

    
    public Builder fulfillmentOrderId(String fulfillmentOrderId) {
      this.fulfillmentOrderId = fulfillmentOrderId;
      return this;
    }
  }
}
