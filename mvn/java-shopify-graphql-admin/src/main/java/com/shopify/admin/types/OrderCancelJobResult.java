package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A job to determine the result of an order cancellation request.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderCancelJobResult implements com.shopify.admin.types.JobResult, com.shopify.admin.types.Node {
  /**
   * This indicates if the job is still queued or has been run.
   */
  private boolean done;

  /**
   * Returns any error that occurred during order cancellation.
   */
  private List<OrderCancelUserError> errors;

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  private String id;

  /**
   * The order associated with the cancellation request.
   */
  private Order order;

  /**
   * The current status of the order cancellation request.
   */
  private OrderCancelStatus status;

  public OrderCancelJobResult() {
  }

  /**
   * This indicates if the job is still queued or has been run.
   */
  public boolean getDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  /**
   * Returns any error that occurred during order cancellation.
   */
  public List<OrderCancelUserError> getErrors() {
    return errors;
  }

  public void setErrors(List<OrderCancelUserError> errors) {
    this.errors = errors;
  }

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The order associated with the cancellation request.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The current status of the order cancellation request.
   */
  public OrderCancelStatus getStatus() {
    return status;
  }

  public void setStatus(OrderCancelStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "OrderCancelJobResult{done='" + done + "', errors='" + errors + "', id='" + id + "', order='" + order + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCancelJobResult that = (OrderCancelJobResult) o;
    return done == that.done &&
        Objects.equals(errors, that.errors) &&
        Objects.equals(id, that.id) &&
        Objects.equals(order, that.order) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(done, errors, id, order, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * This indicates if the job is still queued or has been run.
     */
    private boolean done;

    /**
     * Returns any error that occurred during order cancellation.
     */
    private List<OrderCancelUserError> errors;

    /**
     * A globally-unique ID that's returned when running an asynchronous mutation.
     */
    private String id;

    /**
     * The order associated with the cancellation request.
     */
    private Order order;

    /**
     * The current status of the order cancellation request.
     */
    private OrderCancelStatus status;

    public OrderCancelJobResult build() {
      OrderCancelJobResult result = new OrderCancelJobResult();
      result.done = this.done;
      result.errors = this.errors;
      result.id = this.id;
      result.order = this.order;
      result.status = this.status;
      return result;
    }

    /**
     * This indicates if the job is still queued or has been run.
     */
    public Builder done(boolean done) {
      this.done = done;
      return this;
    }

    /**
     * Returns any error that occurred during order cancellation.
     */
    public Builder errors(List<OrderCancelUserError> errors) {
      this.errors = errors;
      return this;
    }

    /**
     * A globally-unique ID that's returned when running an asynchronous mutation.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The order associated with the cancellation request.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The current status of the order cancellation request.
     */
    public Builder status(OrderCancelStatus status) {
      this.status = status;
      return this;
    }
  }
}
