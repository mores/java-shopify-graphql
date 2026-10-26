package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a customer payment method used during a contract calculation.
 */
public class SubscriptionContractCalculationCustomerPaymentMethodInput {
  /**
   * The ID of the customer payment method.
   */
  private String id;

  public SubscriptionContractCalculationCustomerPaymentMethodInput() {
  }

  /**
   * The ID of the customer payment method.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationCustomerPaymentMethodInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationCustomerPaymentMethodInput that = (SubscriptionContractCalculationCustomerPaymentMethodInput) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the customer payment method.
     */
    private String id;

    public SubscriptionContractCalculationCustomerPaymentMethodInput build() {
      SubscriptionContractCalculationCustomerPaymentMethodInput result = new SubscriptionContractCalculationCustomerPaymentMethodInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the customer payment method.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
