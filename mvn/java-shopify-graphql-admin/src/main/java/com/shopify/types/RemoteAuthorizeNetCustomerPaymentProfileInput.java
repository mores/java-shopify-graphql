package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a remote Authorize.net customer payment profile.
 */
public class RemoteAuthorizeNetCustomerPaymentProfileInput {
  /**
   * The customerProfileId value from the Authorize.net API.
   */
  private String customerProfileId;

  /**
   * The customerPaymentProfileId value from the Authorize.net API. Starting on 2025,
   * customer_payment_profile_id will become mandatory for all API versions.
   */
  private String customerPaymentProfileId;

  public RemoteAuthorizeNetCustomerPaymentProfileInput() {
  }

  /**
   * The customerProfileId value from the Authorize.net API.
   */
  public String getCustomerProfileId() {
    return customerProfileId;
  }

  public void setCustomerProfileId(String customerProfileId) {
    this.customerProfileId = customerProfileId;
  }

  /**
   * The customerPaymentProfileId value from the Authorize.net API. Starting on 2025,
   * customer_payment_profile_id will become mandatory for all API versions.
   */
  public String getCustomerPaymentProfileId() {
    return customerPaymentProfileId;
  }

  public void setCustomerPaymentProfileId(String customerPaymentProfileId) {
    this.customerPaymentProfileId = customerPaymentProfileId;
  }

  @Override
  public String toString() {
    return "RemoteAuthorizeNetCustomerPaymentProfileInput{customerProfileId='" + customerProfileId + "', customerPaymentProfileId='" + customerPaymentProfileId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoteAuthorizeNetCustomerPaymentProfileInput that = (RemoteAuthorizeNetCustomerPaymentProfileInput) o;
    return Objects.equals(customerProfileId, that.customerProfileId) &&
        Objects.equals(customerPaymentProfileId, that.customerPaymentProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProfileId, customerPaymentProfileId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customerProfileId value from the Authorize.net API.
     */
    private String customerProfileId;

    /**
     * The customerPaymentProfileId value from the Authorize.net API. Starting on 2025,
     * customer_payment_profile_id will become mandatory for all API versions.
     */
    private String customerPaymentProfileId;

    public RemoteAuthorizeNetCustomerPaymentProfileInput build() {
      RemoteAuthorizeNetCustomerPaymentProfileInput result = new RemoteAuthorizeNetCustomerPaymentProfileInput();
      result.customerProfileId = this.customerProfileId;
      result.customerPaymentProfileId = this.customerPaymentProfileId;
      return result;
    }

    /**
     * The customerProfileId value from the Authorize.net API.
     */
    public Builder customerProfileId(String customerProfileId) {
      this.customerProfileId = customerProfileId;
      return this;
    }

    /**
     * The customerPaymentProfileId value from the Authorize.net API. Starting on 2025,
     * customer_payment_profile_id will become mandatory for all API versions.
     */
    public Builder customerPaymentProfileId(String customerPaymentProfileId) {
      this.customerPaymentProfileId = customerPaymentProfileId;
      return this;
    }
  }
}
