package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ReverseDeliveryCreateWithShippingPayload {
  
  private ReverseDelivery reverseDelivery;

  
  private List<ReturnUserError> userErrors;

  public ReverseDeliveryCreateWithShippingPayload() {
  }

  
  public ReverseDelivery getReverseDelivery() {
    return reverseDelivery;
  }

  public void setReverseDelivery(ReverseDelivery reverseDelivery) {
    this.reverseDelivery = reverseDelivery;
  }

  
  public List<ReturnUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ReturnUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryCreateWithShippingPayload{reverseDelivery='" + reverseDelivery + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryCreateWithShippingPayload that = (ReverseDeliveryCreateWithShippingPayload) o;
    return Objects.equals(reverseDelivery, that.reverseDelivery) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverseDelivery, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ReverseDelivery reverseDelivery;

    
    private List<ReturnUserError> userErrors;

    public ReverseDeliveryCreateWithShippingPayload build() {
      ReverseDeliveryCreateWithShippingPayload result = new ReverseDeliveryCreateWithShippingPayload();
      result.reverseDelivery = this.reverseDelivery;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder reverseDelivery(ReverseDelivery reverseDelivery) {
      this.reverseDelivery = reverseDelivery;
      return this;
    }

    
    public Builder userErrors(List<ReturnUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
