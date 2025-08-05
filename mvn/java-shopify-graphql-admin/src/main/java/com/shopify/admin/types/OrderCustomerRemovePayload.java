package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderCustomerRemove` mutation.
 */
public class OrderCustomerRemovePayload {
  /**
   * The order that had its customer removed.
   */
  private Order order;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderCustomerRemoveUserError> userErrors;

  public OrderCustomerRemovePayload() {
  }

  /**
   * The order that had its customer removed.
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
  public List<OrderCustomerRemoveUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderCustomerRemoveUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderCustomerRemovePayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCustomerRemovePayload that = (OrderCustomerRemovePayload) o;
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
     * The order that had its customer removed.
     */
    private Order order;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderCustomerRemoveUserError> userErrors;

    public OrderCustomerRemovePayload build() {
      OrderCustomerRemovePayload result = new OrderCustomerRemovePayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order that had its customer removed.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderCustomerRemoveUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
