package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerAddressUpdate` mutation.
 */
public class CustomerAddressUpdatePayload {
  /**
   * The updated address.
   */
  private MailingAddress address;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerAddressUpdatePayload() {
  }

  /**
   * The updated address.
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
    return "CustomerAddressUpdatePayload{address='" + address + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAddressUpdatePayload that = (CustomerAddressUpdatePayload) o;
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
     * The updated address.
     */
    private MailingAddress address;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerAddressUpdatePayload build() {
      CustomerAddressUpdatePayload result = new CustomerAddressUpdatePayload();
      result.address = this.address;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated address.
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
