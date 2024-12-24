package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentOrderSplitResult {
  
  private FulfillmentOrder fulfillmentOrder;

  
  private FulfillmentOrder remainingFulfillmentOrder;

  
  private FulfillmentOrder replacementFulfillmentOrder;

  public FulfillmentOrderSplitResult() {
  }

  
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  
  public FulfillmentOrder getRemainingFulfillmentOrder() {
    return remainingFulfillmentOrder;
  }

  public void setRemainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
    this.remainingFulfillmentOrder = remainingFulfillmentOrder;
  }

  
  public FulfillmentOrder getReplacementFulfillmentOrder() {
    return replacementFulfillmentOrder;
  }

  public void setReplacementFulfillmentOrder(FulfillmentOrder replacementFulfillmentOrder) {
    this.replacementFulfillmentOrder = replacementFulfillmentOrder;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderSplitResult{fulfillmentOrder='" + fulfillmentOrder + "', remainingFulfillmentOrder='" + remainingFulfillmentOrder + "', replacementFulfillmentOrder='" + replacementFulfillmentOrder + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderSplitResult that = (FulfillmentOrderSplitResult) o;
    return Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(remainingFulfillmentOrder, that.remainingFulfillmentOrder) &&
        Objects.equals(replacementFulfillmentOrder, that.replacementFulfillmentOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, remainingFulfillmentOrder, replacementFulfillmentOrder);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentOrder fulfillmentOrder;

    
    private FulfillmentOrder remainingFulfillmentOrder;

    
    private FulfillmentOrder replacementFulfillmentOrder;

    public FulfillmentOrderSplitResult build() {
      FulfillmentOrderSplitResult result = new FulfillmentOrderSplitResult();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.remainingFulfillmentOrder = this.remainingFulfillmentOrder;
      result.replacementFulfillmentOrder = this.replacementFulfillmentOrder;
      return result;
    }

    
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    
    public Builder remainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
      this.remainingFulfillmentOrder = remainingFulfillmentOrder;
      return this;
    }

    
    public Builder replacementFulfillmentOrder(FulfillmentOrder replacementFulfillmentOrder) {
      this.replacementFulfillmentOrder = replacementFulfillmentOrder;
      return this;
    }
  }
}
