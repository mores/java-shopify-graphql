package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerUpdateDefaultAddress` mutation.
 */
public class CustomerUpdateDefaultAddressPayload {
  /**
   * The customer whose address was updated.
   */
  private Customer customer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerUpdateDefaultAddressPayload() {
  }

  /**
   * The customer whose address was updated.
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
    return "CustomerUpdateDefaultAddressPayload{customer='" + customer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerUpdateDefaultAddressPayload that = (CustomerUpdateDefaultAddressPayload) o;
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
     * The customer whose address was updated.
     */
    private Customer customer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerUpdateDefaultAddressPayload build() {
      CustomerUpdateDefaultAddressPayload result = new CustomerUpdateDefaultAddressPayload();
      result.customer = this.customer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The customer whose address was updated.
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
