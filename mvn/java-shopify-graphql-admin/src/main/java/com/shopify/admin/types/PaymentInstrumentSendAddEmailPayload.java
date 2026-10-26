package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentInstrumentSendAddEmail` mutation.
 */
public class PaymentInstrumentSendAddEmailPayload {
  /**
   * The customer to whom an add payment instrument email was sent.
   */
  private Customer customer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public PaymentInstrumentSendAddEmailPayload() {
  }

  /**
   * The customer to whom an add payment instrument email was sent.
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
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentInstrumentSendAddEmailPayload{customer='" + customer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentInstrumentSendAddEmailPayload that = (PaymentInstrumentSendAddEmailPayload) o;
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
     * The customer to whom an add payment instrument email was sent.
     */
    private Customer customer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public PaymentInstrumentSendAddEmailPayload build() {
      PaymentInstrumentSendAddEmailPayload result = new PaymentInstrumentSendAddEmailPayload();
      result.customer = this.customer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The customer to whom an add payment instrument email was sent.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
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
