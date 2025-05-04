package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a remote stripe payment method.
 */
public class RemoteStripePaymentMethodInput {
  /**
   * The customer_id value from the Stripe API.
   */
  private String customerId;

  /**
   * The payment_method_id value from the Stripe API. Starting on 2025,
   * payment_method_id will become mandatory for all API versions.
   */
  private String paymentMethodId;

  public RemoteStripePaymentMethodInput() {
  }

  /**
   * The customer_id value from the Stripe API.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The payment_method_id value from the Stripe API. Starting on 2025,
   * payment_method_id will become mandatory for all API versions.
   */
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  @Override
  public String toString() {
    return "RemoteStripePaymentMethodInput{customerId='" + customerId + "', paymentMethodId='" + paymentMethodId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoteStripePaymentMethodInput that = (RemoteStripePaymentMethodInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(paymentMethodId, that.paymentMethodId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, paymentMethodId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer_id value from the Stripe API.
     */
    private String customerId;

    /**
     * The payment_method_id value from the Stripe API. Starting on 2025,
     * payment_method_id will become mandatory for all API versions.
     */
    private String paymentMethodId;

    public RemoteStripePaymentMethodInput build() {
      RemoteStripePaymentMethodInput result = new RemoteStripePaymentMethodInput();
      result.customerId = this.customerId;
      result.paymentMethodId = this.paymentMethodId;
      return result;
    }

    /**
     * The customer_id value from the Stripe API.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The payment_method_id value from the Stripe API. Starting on 2025,
     * payment_method_id will become mandatory for all API versions.
     */
    public Builder paymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }
  }
}
