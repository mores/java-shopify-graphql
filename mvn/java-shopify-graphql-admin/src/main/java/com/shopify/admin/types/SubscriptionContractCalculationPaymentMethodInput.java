package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the payment method used during a contract calculation.
 * This is a oneOf input: one, and only one, field can be provided.
 *
 * Provide `customerPaymentMethod` to set a vaulted customer payment method.
 * Provide `none` to explicitly set no payment method.
 */
public class SubscriptionContractCalculationPaymentMethodInput {
  /**
   * A vaulted customer payment method.
   */
  private SubscriptionContractCalculationCustomerPaymentMethodInput customerPaymentMethod;

  /**
   * Explicitly set no payment method. Must be `true`.
   */
  private Boolean none;

  public SubscriptionContractCalculationPaymentMethodInput() {
  }

  /**
   * A vaulted customer payment method.
   */
  public SubscriptionContractCalculationCustomerPaymentMethodInput getCustomerPaymentMethod() {
    return customerPaymentMethod;
  }

  public void setCustomerPaymentMethod(
      SubscriptionContractCalculationCustomerPaymentMethodInput customerPaymentMethod) {
    this.customerPaymentMethod = customerPaymentMethod;
  }

  /**
   * Explicitly set no payment method. Must be `true`.
   */
  public Boolean getNone() {
    return none;
  }

  public void setNone(Boolean none) {
    this.none = none;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationPaymentMethodInput{customerPaymentMethod='" + customerPaymentMethod + "', none='" + none + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationPaymentMethodInput that = (SubscriptionContractCalculationPaymentMethodInput) o;
    return Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(none, that.none);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPaymentMethod, none);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A vaulted customer payment method.
     */
    private SubscriptionContractCalculationCustomerPaymentMethodInput customerPaymentMethod;

    /**
     * Explicitly set no payment method. Must be `true`.
     */
    private Boolean none;

    public SubscriptionContractCalculationPaymentMethodInput build() {
      SubscriptionContractCalculationPaymentMethodInput result = new SubscriptionContractCalculationPaymentMethodInput();
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.none = this.none;
      return result;
    }

    /**
     * A vaulted customer payment method.
     */
    public Builder customerPaymentMethod(
        SubscriptionContractCalculationCustomerPaymentMethodInput customerPaymentMethod) {
      this.customerPaymentMethod = customerPaymentMethod;
      return this;
    }

    /**
     * Explicitly set no payment method. Must be `true`.
     */
    public Builder none(Boolean none) {
      this.none = none;
      return this;
    }
  }
}
