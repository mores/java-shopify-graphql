package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderSplitPayload {
  
  private List<FulfillmentOrderSplitResult> fulfillmentOrderSplits;

  
  private List<FulfillmentOrderSplitUserError> userErrors;

  public FulfillmentOrderSplitPayload() {
  }

  
  public List<FulfillmentOrderSplitResult> getFulfillmentOrderSplits() {
    return fulfillmentOrderSplits;
  }

  public void setFulfillmentOrderSplits(List<FulfillmentOrderSplitResult> fulfillmentOrderSplits) {
    this.fulfillmentOrderSplits = fulfillmentOrderSplits;
  }

  
  public List<FulfillmentOrderSplitUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderSplitUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderSplitPayload{fulfillmentOrderSplits='" + fulfillmentOrderSplits + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderSplitPayload that = (FulfillmentOrderSplitPayload) o;
    return Objects.equals(fulfillmentOrderSplits, that.fulfillmentOrderSplits) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderSplits, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<FulfillmentOrderSplitResult> fulfillmentOrderSplits;

    
    private List<FulfillmentOrderSplitUserError> userErrors;

    public FulfillmentOrderSplitPayload build() {
      FulfillmentOrderSplitPayload result = new FulfillmentOrderSplitPayload();
      result.fulfillmentOrderSplits = this.fulfillmentOrderSplits;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder fulfillmentOrderSplits(
        List<FulfillmentOrderSplitResult> fulfillmentOrderSplits) {
      this.fulfillmentOrderSplits = fulfillmentOrderSplits;
      return this;
    }

    
    public Builder userErrors(List<FulfillmentOrderSplitUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
