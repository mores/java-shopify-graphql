package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerPaymentMethodSendUpdateEmailPayload {
  
  private Customer customer;

  
  private List<UserError> userErrors;

  public CustomerPaymentMethodSendUpdateEmailPayload() {
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodSendUpdateEmailPayload{customer='" + customer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodSendUpdateEmailPayload that = (CustomerPaymentMethodSendUpdateEmailPayload) o;
    return Objects.equals(customer, that.customer) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Customer customer;

    
    private List<UserError> userErrors;

    public CustomerPaymentMethodSendUpdateEmailPayload build() {
      CustomerPaymentMethodSendUpdateEmailPayload result = new CustomerPaymentMethodSendUpdateEmailPayload();
      result.customer = this.customer;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
