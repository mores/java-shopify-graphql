package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerReset` mutation.
 */
public class CustomerResetPayload {
  /**
   * The customer object which was reset.
   */
  private Customer customer;

  /**
   * A newly created customer access token object for the customer.
   */
  private CustomerAccessToken customerAccessToken;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerUserError> customerUserErrors;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerResetPayload() {
  }

  /**
   * The customer object which was reset.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * A newly created customer access token object for the customer.
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

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerResetPayload{customer='" + customer + "', customerAccessToken='" + customerAccessToken + "', customerUserErrors='" + customerUserErrors + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerResetPayload that = (CustomerResetPayload) o;
    return Objects.equals(customer, that.customer) &&
        Objects.equals(customerAccessToken, that.customerAccessToken) &&
        Objects.equals(customerUserErrors, that.customerUserErrors) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerAccessToken, customerUserErrors, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer object which was reset.
     */
    private Customer customer;

    /**
     * A newly created customer access token object for the customer.
     */
    private CustomerAccessToken customerAccessToken;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerUserError> customerUserErrors;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerResetPayload build() {
      CustomerResetPayload result = new CustomerResetPayload();
      result.customer = this.customer;
      result.customerAccessToken = this.customerAccessToken;
      result.customerUserErrors = this.customerUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The customer object which was reset.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A newly created customer access token object for the customer.
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

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
