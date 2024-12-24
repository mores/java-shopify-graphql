package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderHoldPayload {
  
  private FulfillmentHold fulfillmentHold;

  
  private FulfillmentOrder fulfillmentOrder;

  
  private FulfillmentOrder remainingFulfillmentOrder;

  
  private List<FulfillmentOrderHoldUserError> userErrors;

  public FulfillmentOrderHoldPayload() {
  }

  
  public FulfillmentHold getFulfillmentHold() {
    return fulfillmentHold;
  }

  public void setFulfillmentHold(FulfillmentHold fulfillmentHold) {
    this.fulfillmentHold = fulfillmentHold;
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

  
  public List<FulfillmentOrderHoldUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderHoldUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderHoldPayload{fulfillmentHold='" + fulfillmentHold + "', fulfillmentOrder='" + fulfillmentOrder + "', remainingFulfillmentOrder='" + remainingFulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderHoldPayload that = (FulfillmentOrderHoldPayload) o;
    return Objects.equals(fulfillmentHold, that.fulfillmentHold) &&
        Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(remainingFulfillmentOrder, that.remainingFulfillmentOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentHold, fulfillmentOrder, remainingFulfillmentOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentHold fulfillmentHold;

    
    private FulfillmentOrder fulfillmentOrder;

    
    private FulfillmentOrder remainingFulfillmentOrder;

    
    private List<FulfillmentOrderHoldUserError> userErrors;

    public FulfillmentOrderHoldPayload build() {
      FulfillmentOrderHoldPayload result = new FulfillmentOrderHoldPayload();
      result.fulfillmentHold = this.fulfillmentHold;
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.remainingFulfillmentOrder = this.remainingFulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder fulfillmentHold(FulfillmentHold fulfillmentHold) {
      this.fulfillmentHold = fulfillmentHold;
      return this;
    }

    
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    
    public Builder remainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
      this.remainingFulfillmentOrder = remainingFulfillmentOrder;
      return this;
    }

    
    public Builder userErrors(List<FulfillmentOrderHoldUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
