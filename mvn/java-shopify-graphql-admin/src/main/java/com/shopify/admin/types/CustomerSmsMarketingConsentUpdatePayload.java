package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerSmsMarketingConsentUpdate` mutation.
 */
public class CustomerSmsMarketingConsentUpdatePayload {
  /**
   * The updated customer.
   */
  private Customer customer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerSmsMarketingConsentError> userErrors;

  public CustomerSmsMarketingConsentUpdatePayload() {
  }

  /**
   * The updated customer.
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
  public List<CustomerSmsMarketingConsentError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerSmsMarketingConsentError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerSmsMarketingConsentUpdatePayload{customer='" + customer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSmsMarketingConsentUpdatePayload that = (CustomerSmsMarketingConsentUpdatePayload) o;
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
     * The updated customer.
     */
    private Customer customer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerSmsMarketingConsentError> userErrors;

    public CustomerSmsMarketingConsentUpdatePayload build() {
      CustomerSmsMarketingConsentUpdatePayload result = new CustomerSmsMarketingConsentUpdatePayload();
      result.customer = this.customer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated customer.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerSmsMarketingConsentError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
