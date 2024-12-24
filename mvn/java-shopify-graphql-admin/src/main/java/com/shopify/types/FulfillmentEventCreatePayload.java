package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentEventCreatePayload {
  
  private FulfillmentEvent fulfillmentEvent;

  
  private List<UserError> userErrors;

  public FulfillmentEventCreatePayload() {
  }

  
  public FulfillmentEvent getFulfillmentEvent() {
    return fulfillmentEvent;
  }

  public void setFulfillmentEvent(FulfillmentEvent fulfillmentEvent) {
    this.fulfillmentEvent = fulfillmentEvent;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentEventCreatePayload{fulfillmentEvent='" + fulfillmentEvent + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentEventCreatePayload that = (FulfillmentEventCreatePayload) o;
    return Objects.equals(fulfillmentEvent, that.fulfillmentEvent) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentEvent, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentEvent fulfillmentEvent;

    
    private List<UserError> userErrors;

    public FulfillmentEventCreatePayload build() {
      FulfillmentEventCreatePayload result = new FulfillmentEventCreatePayload();
      result.fulfillmentEvent = this.fulfillmentEvent;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder fulfillmentEvent(FulfillmentEvent fulfillmentEvent) {
      this.fulfillmentEvent = fulfillmentEvent;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
