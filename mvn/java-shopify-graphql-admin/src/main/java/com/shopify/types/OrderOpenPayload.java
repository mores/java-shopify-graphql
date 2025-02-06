package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderOpen` mutation.
 */
public class OrderOpenPayload {
  /**
   * The opened order.
   */
  private Order order;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public OrderOpenPayload() {
  }

  /**
   * The opened order.
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
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderOpenPayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderOpenPayload that = (OrderOpenPayload) o;
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
     * The opened order.
     */
    private Order order;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public OrderOpenPayload build() {
      OrderOpenPayload result = new OrderOpenPayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The opened order.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
