package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentCreatePayload {
  
  private Fulfillment fulfillment;

  
  private List<UserError> userErrors;

  public FulfillmentCreatePayload() {
  }

  
  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentCreatePayload{fulfillment='" + fulfillment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentCreatePayload that = (FulfillmentCreatePayload) o;
    return Objects.equals(fulfillment, that.fulfillment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Fulfillment fulfillment;

    
    private List<UserError> userErrors;

    public FulfillmentCreatePayload build() {
      FulfillmentCreatePayload result = new FulfillmentCreatePayload();
      result.fulfillment = this.fulfillment;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder fulfillment(Fulfillment fulfillment) {
      this.fulfillment = fulfillment;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
