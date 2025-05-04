package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerPaymentMethodRemoteCreate` mutation.
 */
public class CustomerPaymentMethodRemoteCreatePayload {
  /**
   * The customer payment method. Note that the returned payment method may
   * initially be in an incomplete state. Developers should poll this payment
   * method using the customerPaymentMethod query until all required payment
   * details have been processed.
   */
  private CustomerPaymentMethod customerPaymentMethod;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerPaymentMethodRemoteUserError> userErrors;

  public CustomerPaymentMethodRemoteCreatePayload() {
  }

  /**
   * The customer payment method. Note that the returned payment method may
   * initially be in an incomplete state. Developers should poll this payment
   * method using the customerPaymentMethod query until all required payment
   * details have been processed.
   */
  public CustomerPaymentMethod getCustomerPaymentMethod() {
    return customerPaymentMethod;
  }

  public void setCustomerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
    this.customerPaymentMethod = customerPaymentMethod;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The customer payment method. Note that the returned payment method may
     * initially be in an incomplete state. Developers should poll this payment
     * method using the customerPaymentMethod query until all required payment
     * details have been processed.
     */
    private CustomerPaymentMethod customerPaymentMethod;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerPaymentMethodRemoteUserError> userErrors;

    public CustomerPaymentMethodRemoteCreatePayload build() {
      CustomerPaymentMethodRemoteCreatePayload result = new CustomerPaymentMethodRemoteCreatePayload();
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The customer payment method. Note that the returned payment method may
     * initially be in an incomplete state. Developers should poll this payment
     * method using the customerPaymentMethod query until all required payment
     * details have been processed.
     */
    public Builder customerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
      this.customerPaymentMethod = customerPaymentMethod;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerPaymentMethodRemoteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
