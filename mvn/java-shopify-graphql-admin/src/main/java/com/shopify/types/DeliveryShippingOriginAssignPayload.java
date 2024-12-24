package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryShippingOriginAssignPayload {
  
  private List<UserError> userErrors;

  public DeliveryShippingOriginAssignPayload() {
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliveryShippingOriginAssignPayload{userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryShippingOriginAssignPayload that = (DeliveryShippingOriginAssignPayload) o;
    return Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<UserError> userErrors;

    public DeliveryShippingOriginAssignPayload build() {
      DeliveryShippingOriginAssignPayload result = new DeliveryShippingOriginAssignPayload();
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
