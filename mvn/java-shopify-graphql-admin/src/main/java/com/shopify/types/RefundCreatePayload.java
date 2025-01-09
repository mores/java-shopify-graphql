package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `refundCreate` mutation.
 */
public class RefundCreatePayload {
  /**
   * The order associated with the created refund.
   */
  private Order order;

  /**
   * The created refund.
   */
  private Refund refund;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public RefundCreatePayload() {
  }

  /**
   * The order associated with the created refund.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The created refund.
   */
  public Refund getRefund() {
    return refund;
  }

  public void setRefund(Refund refund) {
    this.refund = refund;
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
    return "RefundCreatePayload{order='" + order + "', refund='" + refund + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundCreatePayload that = (RefundCreatePayload) o;
    return Objects.equals(order, that.order) &&
        Objects.equals(refund, that.refund) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, refund, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The order associated with the created refund.
     */
    private Order order;

    /**
     * The created refund.
     */
    private Refund refund;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public RefundCreatePayload build() {
      RefundCreatePayload result = new RefundCreatePayload();
      result.order = this.order;
      result.refund = this.refund;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order associated with the created refund.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The created refund.
     */
    public Builder refund(Refund refund) {
      this.refund = refund;
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
