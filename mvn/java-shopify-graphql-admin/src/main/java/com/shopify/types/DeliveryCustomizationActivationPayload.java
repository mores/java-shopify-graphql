package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryCustomizationActivationPayload {
  
  private List<String> ids;

  
  private List<DeliveryCustomizationError> userErrors;

  public DeliveryCustomizationActivationPayload() {
  }

  
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  
  public List<DeliveryCustomizationError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DeliveryCustomizationError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliveryCustomizationActivationPayload{ids='" + ids + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCustomizationActivationPayload that = (DeliveryCustomizationActivationPayload) o;
    return Objects.equals(ids, that.ids) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> ids;

    
    private List<DeliveryCustomizationError> userErrors;

    public DeliveryCustomizationActivationPayload build() {
      DeliveryCustomizationActivationPayload result = new DeliveryCustomizationActivationPayload();
      result.ids = this.ids;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder ids(List<String> ids) {
      this.ids = ids;
      return this;
    }

    
    public Builder userErrors(List<DeliveryCustomizationError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
