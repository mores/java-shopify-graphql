package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a remote Braintree customer payment profile.
 */
public class RemoteBraintreePaymentMethodInput {
  /**
   * The `customer_id` value from the Braintree API.
   */
  private String customerId;

  /**
   * The `payment_method_token` value from the Braintree API. Starting on 2025,
   * payment_method_token will become mandatory for all API versions.
   */
  private String paymentMethodToken;

  public RemoteBraintreePaymentMethodInput() {
  }

  /**
   * The `customer_id` value from the Braintree API.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The `payment_method_token` value from the Braintree API. Starting on 2025,
   * payment_method_token will become mandatory for all API versions.
   */
  public String getPaymentMethodToken() {
    return paymentMethodToken;
  }

  public void setPaymentMethodToken(String paymentMethodToken) {
    this.paymentMethodToken = paymentMethodToken;
  }

  @Override
  public String toString() {
    return "RemoteBraintreePaymentMethodInput{customerId='" + customerId + "', paymentMethodToken='" + paymentMethodToken + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoteBraintreePaymentMethodInput that = (RemoteBraintreePaymentMethodInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(paymentMethodToken, that.paymentMethodToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, paymentMethodToken);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The `customer_id` value from the Braintree API.
     */
    private String customerId;

    /**
     * The `payment_method_token` value from the Braintree API. Starting on 2025,
     * payment_method_token will become mandatory for all API versions.
     */
    private String paymentMethodToken;

    public RemoteBraintreePaymentMethodInput build() {
      RemoteBraintreePaymentMethodInput result = new RemoteBraintreePaymentMethodInput();
      result.customerId = this.customerId;
      result.paymentMethodToken = this.paymentMethodToken;
      return result;
    }

    /**
     * The `customer_id` value from the Braintree API.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The `payment_method_token` value from the Braintree API. Starting on 2025,
     * payment_method_token will become mandatory for all API versions.
     */
    public Builder paymentMethodToken(String paymentMethodToken) {
      this.paymentMethodToken = paymentMethodToken;
      return this;
    }
  }
}
