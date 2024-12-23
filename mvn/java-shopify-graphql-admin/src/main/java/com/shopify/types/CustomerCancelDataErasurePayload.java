package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerCancelDataErasure` mutation.
 */
public class CustomerCancelDataErasurePayload {
  /**
   * The ID of the customer whose pending data erasure has been cancelled.
   */
  private String customerId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerCancelDataErasureUserError> userErrors;

  public CustomerCancelDataErasurePayload() {
  }

  /**
   * The ID of the customer whose pending data erasure has been cancelled.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerCancelDataErasureUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerCancelDataErasureUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerCancelDataErasurePayload{customerId='" + customerId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerCancelDataErasurePayload that = (CustomerCancelDataErasurePayload) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the customer whose pending data erasure has been cancelled.
     */
    private String customerId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerCancelDataErasureUserError> userErrors;

    public CustomerCancelDataErasurePayload build() {
      CustomerCancelDataErasurePayload result = new CustomerCancelDataErasurePayload();
      result.customerId = this.customerId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the customer whose pending data erasure has been cancelled.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerCancelDataErasureUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
