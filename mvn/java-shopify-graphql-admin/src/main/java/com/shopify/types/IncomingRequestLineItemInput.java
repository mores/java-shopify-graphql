package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class IncomingRequestLineItemInput {
  
  private String fulfillmentOrderLineItemId;

  
  private String message;

  public IncomingRequestLineItemInput() {
  }

  
  public String getFulfillmentOrderLineItemId() {
    return fulfillmentOrderLineItemId;
  }

  public void setFulfillmentOrderLineItemId(String fulfillmentOrderLineItemId) {
    this.fulfillmentOrderLineItemId = fulfillmentOrderLineItemId;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "IncomingRequestLineItemInput{fulfillmentOrderLineItemId='" + fulfillmentOrderLineItemId + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IncomingRequestLineItemInput that = (IncomingRequestLineItemInput) o;
    return Objects.equals(fulfillmentOrderLineItemId, that.fulfillmentOrderLineItemId) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderLineItemId, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fulfillmentOrderLineItemId;

    
    private String message;

    public IncomingRequestLineItemInput build() {
      IncomingRequestLineItemInput result = new IncomingRequestLineItemInput();
      result.fulfillmentOrderLineItemId = this.fulfillmentOrderLineItemId;
      result.message = this.message;
      return result;
    }

    
    public Builder fulfillmentOrderLineItemId(String fulfillmentOrderLineItemId) {
      this.fulfillmentOrderLineItemId = fulfillmentOrderLineItemId;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
