package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderReschedulePayload {
  
  private FulfillmentOrder fulfillmentOrder;

  
  private List<FulfillmentOrderRescheduleUserError> userErrors;

  public FulfillmentOrderReschedulePayload() {
  }

  
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  
  public List<FulfillmentOrderRescheduleUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderRescheduleUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderReschedulePayload{fulfillmentOrder='" + fulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderReschedulePayload that = (FulfillmentOrderReschedulePayload) o;
    return Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentOrder fulfillmentOrder;

    
    private List<FulfillmentOrderRescheduleUserError> userErrors;

    public FulfillmentOrderReschedulePayload build() {
      FulfillmentOrderReschedulePayload result = new FulfillmentOrderReschedulePayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    
    public Builder userErrors(List<FulfillmentOrderRescheduleUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
