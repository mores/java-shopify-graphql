package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderCustomerSet` mutation.
 */
public class OrderCustomerSetPayload {
  /**
   * The order that had a customer set.
   */
  private Order order;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderCustomerSetUserError> userErrors;

  public OrderCustomerSetPayload() {
  }

  /**
   * The order that had a customer set.
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
  public List<OrderCustomerSetUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderCustomerSetUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderCustomerSetPayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCustomerSetPayload that = (OrderCustomerSetPayload) o;
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
     * The order that had a customer set.
     */
    private Order order;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderCustomerSetUserError> userErrors;

    public OrderCustomerSetPayload build() {
      OrderCustomerSetPayload result = new OrderCustomerSetPayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order that had a customer set.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderCustomerSetUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
