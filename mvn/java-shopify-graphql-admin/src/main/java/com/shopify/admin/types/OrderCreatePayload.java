package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderCreate` mutation.
 */
public class OrderCreatePayload {
  /**
   * The order that was created.
   */
  private Order order;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderCreateUserError> userErrors;

  public OrderCreatePayload() {
  }

  /**
   * The order that was created.
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
  public List<OrderCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderCreatePayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreatePayload that = (OrderCreatePayload) o;
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
     * The order that was created.
     */
    private Order order;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderCreateUserError> userErrors;

    public OrderCreatePayload build() {
      OrderCreatePayload result = new OrderCreatePayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order that was created.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
