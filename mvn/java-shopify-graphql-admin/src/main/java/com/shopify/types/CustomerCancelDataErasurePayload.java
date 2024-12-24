package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerCancelDataErasurePayload {
  
  private String customerId;

  
  private List<CustomerCancelDataErasureUserError> userErrors;

  public CustomerCancelDataErasurePayload() {
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public List<CustomerCancelDataErasureUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerCancelDataErasureUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerCancelDataErasurePayload{customerId='" + customerId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerCancelDataErasurePayload that = (CustomerCancelDataErasurePayload) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerId;

    
    private List<CustomerCancelDataErasureUserError> userErrors;

    public CustomerCancelDataErasurePayload build() {
      CustomerCancelDataErasurePayload result = new CustomerCancelDataErasurePayload();
      result.customerId = this.customerId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    
    public Builder userErrors(List<CustomerCancelDataErasureUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
