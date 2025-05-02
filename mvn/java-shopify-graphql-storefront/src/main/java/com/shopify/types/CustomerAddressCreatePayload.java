package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerAddressCreate` mutation.
 */
public class CustomerAddressCreatePayload {
  /**
   * The new customer address object.
   */
  private MailingAddress customerAddress;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerUserError> customerUserErrors;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerAddressCreatePayload() {
  }

  /**
   * The new customer address object.
   */
  public MailingAddress getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(MailingAddress customerAddress) {
    this.customerAddress = customerAddress;
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
    return "CustomerAddressCreatePayload{customerAddress='" + customerAddress + "', customerUserErrors='" + customerUserErrors + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAddressCreatePayload that = (CustomerAddressCreatePayload) o;
    return Objects.equals(customerAddress, that.customerAddress) &&
        Objects.equals(customerUserErrors, that.customerUserErrors) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAddress, customerUserErrors, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The new customer address object.
     */
    private MailingAddress customerAddress;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerUserError> customerUserErrors;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerAddressCreatePayload build() {
      CustomerAddressCreatePayload result = new CustomerAddressCreatePayload();
      result.customerAddress = this.customerAddress;
      result.customerUserErrors = this.customerUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The new customer address object.
     */
    public Builder customerAddress(MailingAddress customerAddress) {
      this.customerAddress = customerAddress;
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
