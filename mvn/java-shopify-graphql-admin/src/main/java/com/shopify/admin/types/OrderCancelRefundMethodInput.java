package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to specify the refund method for an order cancellation.
 */
public class OrderCancelRefundMethodInput {
  /**
   * Whether to refund to the original payment method.
   */
  private Boolean originalPaymentMethodsRefund;

  /**
   * Whether to refund to store credit.
   */
  private OrderCancelStoreCreditRefundInput storeCreditRefund;

  public OrderCancelRefundMethodInput() {
  }

  /**
   * Whether to refund to the original payment method.
   */
  public Boolean getOriginalPaymentMethodsRefund() {
    return originalPaymentMethodsRefund;
  }

  public void setOriginalPaymentMethodsRefund(Boolean originalPaymentMethodsRefund) {
    this.originalPaymentMethodsRefund = originalPaymentMethodsRefund;
  }

  /**
   * Whether to refund to store credit.
   */
  public OrderCancelStoreCreditRefundInput getStoreCreditRefund() {
    return storeCreditRefund;
  }

  public void setStoreCreditRefund(OrderCancelStoreCreditRefundInput storeCreditRefund) {
    this.storeCreditRefund = storeCreditRefund;
  }

  @Override
  public String toString() {
    return "OrderCancelRefundMethodInput{originalPaymentMethodsRefund='" + originalPaymentMethodsRefund + "', storeCreditRefund='" + storeCreditRefund + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCancelRefundMethodInput that = (OrderCancelRefundMethodInput) o;
    return Objects.equals(originalPaymentMethodsRefund, that.originalPaymentMethodsRefund) &&
        Objects.equals(storeCreditRefund, that.storeCreditRefund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalPaymentMethodsRefund, storeCreditRefund);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether to refund to the original payment method.
     */
    private Boolean originalPaymentMethodsRefund;

    /**
     * Whether to refund to store credit.
     */
    private OrderCancelStoreCreditRefundInput storeCreditRefund;

    public OrderCancelRefundMethodInput build() {
      OrderCancelRefundMethodInput result = new OrderCancelRefundMethodInput();
      result.originalPaymentMethodsRefund = this.originalPaymentMethodsRefund;
      result.storeCreditRefund = this.storeCreditRefund;
      return result;
    }

    /**
     * Whether to refund to the original payment method.
     */
    public Builder originalPaymentMethodsRefund(Boolean originalPaymentMethodsRefund) {
      this.originalPaymentMethodsRefund = originalPaymentMethodsRefund;
      return this;
    }

    /**
     * Whether to refund to store credit.
     */
    public Builder storeCreditRefund(OrderCancelStoreCreditRefundInput storeCreditRefund) {
      this.storeCreditRefund = storeCreditRefund;
      return this;
    }
  }
}
