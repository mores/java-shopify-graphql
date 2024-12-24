package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentOrderMergeResult {
  
  private FulfillmentOrder fulfillmentOrder;

  public FulfillmentOrderMergeResult() {
  }

  
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderMergeResult{fulfillmentOrder='" + fulfillmentOrder + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderMergeResult that = (FulfillmentOrderMergeResult) o;
    return Objects.equals(fulfillmentOrder, that.fulfillmentOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentOrder fulfillmentOrder;

    public FulfillmentOrderMergeResult build() {
      FulfillmentOrderMergeResult result = new FulfillmentOrderMergeResult();
      result.fulfillmentOrder = this.fulfillmentOrder;
      return result;
    }

    
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }
  }
}
