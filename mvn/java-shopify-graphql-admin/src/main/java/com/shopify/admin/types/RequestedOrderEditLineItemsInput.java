package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the line item changes in a requested order edit, grouped by the type of change.
 */
public class RequestedOrderEditLineItemsInput {
  /**
   * The line items to request removal for.
   */
  private List<RequestedOrderEditLineItemRemovalInput> removals;

  public RequestedOrderEditLineItemsInput() {
  }

  /**
   * The line items to request removal for.
   */
  public List<RequestedOrderEditLineItemRemovalInput> getRemovals() {
    return removals;
  }

  public void setRemovals(List<RequestedOrderEditLineItemRemovalInput> removals) {
    this.removals = removals;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditLineItemsInput{removals='" + removals + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditLineItemsInput that = (RequestedOrderEditLineItemsInput) o;
    return Objects.equals(removals, that.removals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removals);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The line items to request removal for.
     */
    private List<RequestedOrderEditLineItemRemovalInput> removals;

    public RequestedOrderEditLineItemsInput build() {
      RequestedOrderEditLineItemsInput result = new RequestedOrderEditLineItemsInput();
      result.removals = this.removals;
      return result;
    }

    /**
     * The line items to request removal for.
     */
    public Builder removals(List<RequestedOrderEditLineItemRemovalInput> removals) {
      this.removals = removals;
      return this;
    }
  }
}
