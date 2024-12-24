package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerPaymentMethodRemoteCreatePayload {
  
  private CustomerPaymentMethod customerPaymentMethod;

  
  private List<CustomerPaymentMethodRemoteUserError> userErrors;

  public CustomerPaymentMethodRemoteCreatePayload() {
  }

  
  public CustomerPaymentMethod getCustomerPaymentMethod() {
    return customerPaymentMethod;
  }

  public void setCustomerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
    this.customerPaymentMethod = customerPaymentMethod;
  }

  
  public List<CustomerPaymentMethodRemoteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerPaymentMethodRemoteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodRemoteCreatePayload{customerPaymentMethod='" + customerPaymentMethod + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodRemoteCreatePayload that = (CustomerPaymentMethodRemoteCreatePayload) o;
    return Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPaymentMethod, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerPaymentMethod customerPaymentMethod;

    
    private List<CustomerPaymentMethodRemoteUserError> userErrors;

    public CustomerPaymentMethodRemoteCreatePayload build() {
      CustomerPaymentMethodRemoteCreatePayload result = new CustomerPaymentMethodRemoteCreatePayload();
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder customerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
      this.customerPaymentMethod = customerPaymentMethod;
      return this;
    }

    
    public Builder userErrors(List<CustomerPaymentMethodRemoteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
