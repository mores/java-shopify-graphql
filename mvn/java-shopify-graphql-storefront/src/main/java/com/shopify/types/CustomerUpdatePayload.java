package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerUpdate` mutation.
 */
public class CustomerUpdatePayload {
  /**
   * The updated customer object.
   */
  private Customer customer;

  /**
   * The newly created customer access token. If the customer's password is updated, all previous access tokens
   * (including the one used to perform this mutation) become invalid, and a new token is generated.
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

  public CustomerUpdatePayload() {
  }

  /**
   * The updated customer object.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * The newly created customer access token. If the customer's password is updated, all previous access tokens
   * (including the one used to perform this mutation) become invalid, and a new token is generated.
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
    return "CustomerUpdatePayload{customer='" + customer + "', customerAccessToken='" + customerAccessToken + "', customerUserErrors='" + customerUserErrors + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerUpdatePayload that = (CustomerUpdatePayload) o;
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
     * The updated customer object.
     */
    private Customer customer;

    /**
     * The newly created customer access token. If the customer's password is updated, all previous access tokens
     * (including the one used to perform this mutation) become invalid, and a new token is generated.
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

    public CustomerUpdatePayload build() {
      CustomerUpdatePayload result = new CustomerUpdatePayload();
      result.customer = this.customer;
      result.customerAccessToken = this.customerAccessToken;
      result.customerUserErrors = this.customerUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated customer object.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The newly created customer access token. If the customer's password is updated, all previous access tokens
     * (including the one used to perform this mutation) become invalid, and a new token is generated.
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
