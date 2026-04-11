package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `taxSummaryCreate` mutation.
 */
public class TaxSummaryCreatePayload {
  /**
   * A list of orders that were successfully enqueued to create a tax summary.
   */
  private List<Order> enqueuedOrders;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<TaxSummaryCreateUserError> userErrors;

  public TaxSummaryCreatePayload() {
  }

  /**
   * A list of orders that were successfully enqueued to create a tax summary.
   */
  public List<Order> getEnqueuedOrders() {
    return enqueuedOrders;
  }

  public void setEnqueuedOrders(List<Order> enqueuedOrders) {
    this.enqueuedOrders = enqueuedOrders;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<TaxSummaryCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<TaxSummaryCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "TaxSummaryCreatePayload{enqueuedOrders='" + enqueuedOrders + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxSummaryCreatePayload that = (TaxSummaryCreatePayload) o;
    return Objects.equals(enqueuedOrders, that.enqueuedOrders) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enqueuedOrders, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of orders that were successfully enqueued to create a tax summary.
     */
    private List<Order> enqueuedOrders;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<TaxSummaryCreateUserError> userErrors;

    public TaxSummaryCreatePayload build() {
      TaxSummaryCreatePayload result = new TaxSummaryCreatePayload();
      result.enqueuedOrders = this.enqueuedOrders;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * A list of orders that were successfully enqueued to create a tax summary.
     */
    public Builder enqueuedOrders(List<Order> enqueuedOrders) {
      this.enqueuedOrders = enqueuedOrders;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<TaxSummaryCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
