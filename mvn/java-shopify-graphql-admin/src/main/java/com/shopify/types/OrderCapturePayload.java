package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderCapture` mutation.
 */
public class OrderCapturePayload {
  /**
   * The created capture transaction.
   */
  private OrderTransaction transaction;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public OrderCapturePayload() {
  }

  /**
   * The created capture transaction.
   */
  public OrderTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(OrderTransaction transaction) {
    this.transaction = transaction;
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
    return "OrderCapturePayload{transaction='" + transaction + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCapturePayload that = (OrderCapturePayload) o;
    return Objects.equals(transaction, that.transaction) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created capture transaction.
     */
    private OrderTransaction transaction;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public OrderCapturePayload build() {
      OrderCapturePayload result = new OrderCapturePayload();
      result.transaction = this.transaction;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created capture transaction.
     */
    public Builder transaction(OrderTransaction transaction) {
      this.transaction = transaction;
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
