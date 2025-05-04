package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderCancel` mutation.
 */
public class OrderCancelPayload {
  /**
   * The job that asynchronously cancels the order.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderCancelUserError> orderCancelUserErrors;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public OrderCancelPayload() {
  }

  /**
   * The job that asynchronously cancels the order.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<OrderCancelUserError> getOrderCancelUserErrors() {
    return orderCancelUserErrors;
  }

  public void setOrderCancelUserErrors(List<OrderCancelUserError> orderCancelUserErrors) {
    this.orderCancelUserErrors = orderCancelUserErrors;
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
    return "OrderCancelPayload{job='" + job + "', orderCancelUserErrors='" + orderCancelUserErrors + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCancelPayload that = (OrderCancelPayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(orderCancelUserErrors, that.orderCancelUserErrors) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, orderCancelUserErrors, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The job that asynchronously cancels the order.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderCancelUserError> orderCancelUserErrors;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public OrderCancelPayload build() {
      OrderCancelPayload result = new OrderCancelPayload();
      result.job = this.job;
      result.orderCancelUserErrors = this.orderCancelUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The job that asynchronously cancels the order.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder orderCancelUserErrors(List<OrderCancelUserError> orderCancelUserErrors) {
      this.orderCancelUserErrors = orderCancelUserErrors;
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
