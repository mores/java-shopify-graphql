package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerActivateByUrl` mutation.
 */
public class CustomerActivateByUrlPayload {
  /**
   * The customer that was activated.
   */
  private Customer customer;

  /**
   * A new customer access token for the customer.
   */
  private CustomerAccessToken customerAccessToken;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerUserError> customerUserErrors;

  public CustomerActivateByUrlPayload() {
  }

  /**
   * The customer that was activated.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * A new customer access token for the customer.
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
    return "CustomerActivateByUrlPayload{customer='" + customer + "', customerAccessToken='" + customerAccessToken + "', customerUserErrors='" + customerUserErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerActivateByUrlPayload that = (CustomerActivateByUrlPayload) o;
    return Objects.equals(customer, that.customer) &&
        Objects.equals(customerAccessToken, that.customerAccessToken) &&
        Objects.equals(customerUserErrors, that.customerUserErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerAccessToken, customerUserErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer that was activated.
     */
    private Customer customer;

    /**
     * A new customer access token for the customer.
     */
    private CustomerAccessToken customerAccessToken;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerUserError> customerUserErrors;

    public CustomerActivateByUrlPayload build() {
      CustomerActivateByUrlPayload result = new CustomerActivateByUrlPayload();
      result.customer = this.customer;
      result.customerAccessToken = this.customerAccessToken;
      result.customerUserErrors = this.customerUserErrors;
      return result;
    }

    /**
     * The customer that was activated.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A new customer access token for the customer.
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
