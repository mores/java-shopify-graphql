package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerAccessTokenCreateWithMultipass` mutation.
 */
public class CustomerAccessTokenCreateWithMultipassPayload {
  /**
   * An access token object associated with the customer.
   */
  private CustomerAccessToken customerAccessToken;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerUserError> customerUserErrors;

  public CustomerAccessTokenCreateWithMultipassPayload() {
  }

  /**
   * An access token object associated with the customer.
   */
  public CustomerAccessToken getCustomerAccessToken() {
    return customerAccessToken;
  }

  public void setCustomerAccessToken(CustomerAccessToken customerAccessToken) {
    this.customerAccessToken = customerAccessToken;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerUserError> getCustomerUserErrors() {
    return customerUserErrors;
  }

  public void setCustomerUserErrors(List<CustomerUserError> customerUserErrors) {
    this.customerUserErrors = customerUserErrors;
  }

  @Override
  public String toString() {
    return "CustomerAccessTokenCreateWithMultipassPayload{customerAccessToken='" + customerAccessToken + "', customerUserErrors='" + customerUserErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAccessTokenCreateWithMultipassPayload that = (CustomerAccessTokenCreateWithMultipassPayload) o;
    return Objects.equals(customerAccessToken, that.customerAccessToken) &&
        Objects.equals(customerUserErrors, that.customerUserErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAccessToken, customerUserErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An access token object associated with the customer.
     */
    private CustomerAccessToken customerAccessToken;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerUserError> customerUserErrors;

    public CustomerAccessTokenCreateWithMultipassPayload build() {
      CustomerAccessTokenCreateWithMultipassPayload result = new CustomerAccessTokenCreateWithMultipassPayload();
      result.customerAccessToken = this.customerAccessToken;
      result.customerUserErrors = this.customerUserErrors;
      return result;
    }

    /**
     * An access token object associated with the customer.
     */
    public Builder customerAccessToken(CustomerAccessToken customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder customerUserErrors(List<CustomerUserError> customerUserErrors) {
      this.customerUserErrors = customerUserErrors;
      return this;
    }
  }
}
