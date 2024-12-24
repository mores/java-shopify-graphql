package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerPaymentMethodRevokePayload {
  
  private String revokedCustomerPaymentMethodId;

  
  private List<UserError> userErrors;

  public CustomerPaymentMethodRevokePayload() {
  }

  
  public String getRevokedCustomerPaymentMethodId() {
    return revokedCustomerPaymentMethodId;
  }

  public void setRevokedCustomerPaymentMethodId(String revokedCustomerPaymentMethodId) {
    this.revokedCustomerPaymentMethodId = revokedCustomerPaymentMethodId;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodRevokePayload{revokedCustomerPaymentMethodId='" + revokedCustomerPaymentMethodId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodRevokePayload that = (CustomerPaymentMethodRevokePayload) o;
    return Objects.equals(revokedCustomerPaymentMethodId, that.revokedCustomerPaymentMethodId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revokedCustomerPaymentMethodId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String revokedCustomerPaymentMethodId;

    
    private List<UserError> userErrors;

    public CustomerPaymentMethodRevokePayload build() {
      CustomerPaymentMethodRevokePayload result = new CustomerPaymentMethodRevokePayload();
      result.revokedCustomerPaymentMethodId = this.revokedCustomerPaymentMethodId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder revokedCustomerPaymentMethodId(String revokedCustomerPaymentMethodId) {
      this.revokedCustomerPaymentMethodId = revokedCustomerPaymentMethodId;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
