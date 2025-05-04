package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerPaymentMethodRevoke` mutation.
 */
public class CustomerPaymentMethodRevokePayload {
  /**
   * The ID of the revoked customer payment method.
   */
  private String revokedCustomerPaymentMethodId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerPaymentMethodRevokePayload() {
  }

  /**
   * The ID of the revoked customer payment method.
   */
  public String getRevokedCustomerPaymentMethodId() {
    return revokedCustomerPaymentMethodId;
  }

  public void setRevokedCustomerPaymentMethodId(String revokedCustomerPaymentMethodId) {
    this.revokedCustomerPaymentMethodId = revokedCustomerPaymentMethodId;
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
    return "CustomerPaymentMethodRevokePayload{revokedCustomerPaymentMethodId='" + revokedCustomerPaymentMethodId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodRevokePayload that = (CustomerPaymentMethodRevokePayload) o;
    return Objects.equals(revokedCustomerPaymentMethodId, that.revokedCustomerPaymentMethodId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revokedCustomerPaymentMethodId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the revoked customer payment method.
     */
    private String revokedCustomerPaymentMethodId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerPaymentMethodRevokePayload build() {
      CustomerPaymentMethodRevokePayload result = new CustomerPaymentMethodRevokePayload();
      result.revokedCustomerPaymentMethodId = this.revokedCustomerPaymentMethodId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the revoked customer payment method.
     */
    public Builder revokedCustomerPaymentMethodId(String revokedCustomerPaymentMethodId) {
      this.revokedCustomerPaymentMethodId = revokedCustomerPaymentMethodId;
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
