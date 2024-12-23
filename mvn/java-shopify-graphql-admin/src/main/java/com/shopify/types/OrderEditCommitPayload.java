package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderEditCommit` mutation.
 */
public class OrderEditCommitPayload {
  /**
   * The order with changes applied.
   */
  private Order order;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public OrderEditCommitPayload() {
  }

  /**
   * The order with changes applied.
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
    return "OrderEditCommitPayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditCommitPayload that = (OrderEditCommitPayload) o;
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
     * The order with changes applied.
     */
    private Order order;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public OrderEditCommitPayload build() {
      OrderEditCommitPayload result = new OrderEditCommitPayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order with changes applied.
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
