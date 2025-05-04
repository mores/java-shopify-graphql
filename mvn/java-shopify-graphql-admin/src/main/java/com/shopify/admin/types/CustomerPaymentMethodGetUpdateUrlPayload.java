package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerPaymentMethodGetUpdateUrl` mutation.
 */
public class CustomerPaymentMethodGetUpdateUrlPayload {
  /**
   * The URL to redirect the customer to update the payment method.
   */
  private String updatePaymentMethodUrl;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerPaymentMethodGetUpdateUrlUserError> userErrors;

  public CustomerPaymentMethodGetUpdateUrlPayload() {
  }

  /**
   * The URL to redirect the customer to update the payment method.
   */
  public String getUpdatePaymentMethodUrl() {
    return updatePaymentMethodUrl;
  }

  public void setUpdatePaymentMethodUrl(String updatePaymentMethodUrl) {
    this.updatePaymentMethodUrl = updatePaymentMethodUrl;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerPaymentMethodGetUpdateUrlUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerPaymentMethodGetUpdateUrlUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodGetUpdateUrlPayload{updatePaymentMethodUrl='" + updatePaymentMethodUrl + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodGetUpdateUrlPayload that = (CustomerPaymentMethodGetUpdateUrlPayload) o;
    return Objects.equals(updatePaymentMethodUrl, that.updatePaymentMethodUrl) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatePaymentMethodUrl, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL to redirect the customer to update the payment method.
     */
    private String updatePaymentMethodUrl;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerPaymentMethodGetUpdateUrlUserError> userErrors;

    public CustomerPaymentMethodGetUpdateUrlPayload build() {
      CustomerPaymentMethodGetUpdateUrlPayload result = new CustomerPaymentMethodGetUpdateUrlPayload();
      result.updatePaymentMethodUrl = this.updatePaymentMethodUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The URL to redirect the customer to update the payment method.
     */
    public Builder updatePaymentMethodUrl(String updatePaymentMethodUrl) {
      this.updatePaymentMethodUrl = updatePaymentMethodUrl;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerPaymentMethodGetUpdateUrlUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
