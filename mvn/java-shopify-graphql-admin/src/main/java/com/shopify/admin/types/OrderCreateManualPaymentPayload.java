package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderCreateManualPayment` mutation.
 */
public class OrderCreateManualPaymentPayload {
  /**
   * The order recorded a manual payment.
   */
  private Order order;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderCreateManualPaymentOrderCreateManualPaymentError> userErrors;

  public OrderCreateManualPaymentPayload() {
  }

  /**
   * The order recorded a manual payment.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<OrderCreateManualPaymentOrderCreateManualPaymentError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(
      List<OrderCreateManualPaymentOrderCreateManualPaymentError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderCreateManualPaymentPayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateManualPaymentPayload that = (OrderCreateManualPaymentPayload) o;
    return Objects.equals(order, that.order) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The order recorded a manual payment.
     */
    private Order order;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderCreateManualPaymentOrderCreateManualPaymentError> userErrors;

    public OrderCreateManualPaymentPayload build() {
      OrderCreateManualPaymentPayload result = new OrderCreateManualPaymentPayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order recorded a manual payment.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(
        List<OrderCreateManualPaymentOrderCreateManualPaymentError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
