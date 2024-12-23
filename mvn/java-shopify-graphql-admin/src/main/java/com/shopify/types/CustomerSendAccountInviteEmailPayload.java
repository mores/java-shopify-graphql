package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerSendAccountInviteEmail` mutation.
 */
public class CustomerSendAccountInviteEmailPayload {
  /**
   * The customer to whom an account invite email was sent.
   */
  private Customer customer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerSendAccountInviteEmailUserError> userErrors;

  public CustomerSendAccountInviteEmailPayload() {
  }

  /**
   * The customer to whom an account invite email was sent.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerSendAccountInviteEmailUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerSendAccountInviteEmailUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerSendAccountInviteEmailPayload{customer='" + customer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSendAccountInviteEmailPayload that = (CustomerSendAccountInviteEmailPayload) o;
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
    /**
     * The customer to whom an account invite email was sent.
     */
    private Customer customer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerSendAccountInviteEmailUserError> userErrors;

    public CustomerSendAccountInviteEmailPayload build() {
      CustomerSendAccountInviteEmailPayload result = new CustomerSendAccountInviteEmailPayload();
      result.customer = this.customer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The customer to whom an account invite email was sent.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerSendAccountInviteEmailUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
