package com.shopify.admin.types;

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
   * The created address.
   */
  private MailingAddress address;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerAddressCreatePayload() {
  }

  /**
   * The created address.
   */
  public MailingAddress getAddress() {
    return address;
  }

  public void setAddress(MailingAddress address) {
    this.address = address;
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
    return "CustomerAddressCreatePayload{address='" + address + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAddressCreatePayload that = (CustomerAddressCreatePayload) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created address.
     */
    private MailingAddress address;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerAddressCreatePayload build() {
      CustomerAddressCreatePayload result = new CustomerAddressCreatePayload();
      result.address = this.address;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created address.
     */
    public Builder address(MailingAddress address) {
      this.address = address;
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
