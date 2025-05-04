package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerAddressDelete` mutation.
 */
public class CustomerAddressDeletePayload {
  /**
   * The ID of the address deleted from the customer.
   */
  private String deletedAddressId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerAddressDeletePayload() {
  }

  /**
   * The ID of the address deleted from the customer.
   */
  public String getDeletedAddressId() {
    return deletedAddressId;
  }

  public void setDeletedAddressId(String deletedAddressId) {
    this.deletedAddressId = deletedAddressId;
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
    return "CustomerAddressDeletePayload{deletedAddressId='" + deletedAddressId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAddressDeletePayload that = (CustomerAddressDeletePayload) o;
    return Objects.equals(deletedAddressId, that.deletedAddressId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAddressId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the address deleted from the customer.
     */
    private String deletedAddressId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerAddressDeletePayload build() {
      CustomerAddressDeletePayload result = new CustomerAddressDeletePayload();
      result.deletedAddressId = this.deletedAddressId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the address deleted from the customer.
     */
    public Builder deletedAddressId(String deletedAddressId) {
      this.deletedAddressId = deletedAddressId;
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
