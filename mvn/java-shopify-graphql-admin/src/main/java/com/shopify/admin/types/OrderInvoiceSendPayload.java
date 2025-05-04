package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderInvoiceSend` mutation.
 */
public class OrderInvoiceSendPayload {
  /**
   * The order associated with the invoice email.
   */
  private Order order;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderInvoiceSendUserError> userErrors;

  public OrderInvoiceSendPayload() {
  }

  /**
   * The order associated with the invoice email.
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
  public List<OrderInvoiceSendUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderInvoiceSendUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderInvoiceSendPayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderInvoiceSendPayload that = (OrderInvoiceSendPayload) o;
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
     * The order associated with the invoice email.
     */
    private Order order;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderInvoiceSendUserError> userErrors;

    public OrderInvoiceSendPayload build() {
      OrderInvoiceSendPayload result = new OrderInvoiceSendPayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order associated with the invoice email.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderInvoiceSendUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
