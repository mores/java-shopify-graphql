package com.shopify.types;

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
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerUserError> customerUserErrors;

  /**
   * ID of the deleted customer address.
   */
  private String deletedCustomerAddressId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerAddressDeletePayload() {
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
   * ID of the deleted customer address.
   */
  public String getDeletedCustomerAddressId() {
    return deletedCustomerAddressId;
  }

  public void setDeletedCustomerAddressId(String deletedCustomerAddressId) {
    this.deletedCustomerAddressId = deletedCustomerAddressId;
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
    return "CustomerAddressDeletePayload{customerUserErrors='" + customerUserErrors + "', deletedCustomerAddressId='" + deletedCustomerAddressId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAddressDeletePayload that = (CustomerAddressDeletePayload) o;
    return Objects.equals(customerUserErrors, that.customerUserErrors) &&
        Objects.equals(deletedCustomerAddressId, that.deletedCustomerAddressId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerUserErrors, deletedCustomerAddressId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerUserError> customerUserErrors;

    /**
     * ID of the deleted customer address.
     */
    private String deletedCustomerAddressId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerAddressDeletePayload build() {
      CustomerAddressDeletePayload result = new CustomerAddressDeletePayload();
      result.customerUserErrors = this.customerUserErrors;
      result.deletedCustomerAddressId = this.deletedCustomerAddressId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder customerUserErrors(List<CustomerUserError> customerUserErrors) {
      this.customerUserErrors = customerUserErrors;
      return this;
    }

    /**
     * ID of the deleted customer address.
     */
    public Builder deletedCustomerAddressId(String deletedCustomerAddressId) {
      this.deletedCustomerAddressId = deletedCustomerAddressId;
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
