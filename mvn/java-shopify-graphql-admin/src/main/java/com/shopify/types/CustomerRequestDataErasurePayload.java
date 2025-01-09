package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerRequestDataErasure` mutation.
 */
public class CustomerRequestDataErasurePayload {
  /**
   * The ID of the customer that will be erased.
   */
  private String customerId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerRequestDataErasureUserError> userErrors;

  public CustomerRequestDataErasurePayload() {
  }

  /**
   * The ID of the customer that will be erased.
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
  public List<CustomerRequestDataErasureUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerRequestDataErasureUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerRequestDataErasurePayload{customerId='" + customerId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerRequestDataErasurePayload that = (CustomerRequestDataErasurePayload) o;
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
     * The ID of the customer that will be erased.
     */
    private String customerId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerRequestDataErasureUserError> userErrors;

    public CustomerRequestDataErasurePayload build() {
      CustomerRequestDataErasurePayload result = new CustomerRequestDataErasurePayload();
      result.customerId = this.customerId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the customer that will be erased.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerRequestDataErasureUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
