package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The line item changes on a requested order edit, grouped by the type of change.
 */
public class RequestedOrderEditLineItems {
  /**
   * The line items requested for removal from the order.
   */
  private RequestedOrderEditLineItemConnection removals;

  public RequestedOrderEditLineItems() {
  }

  /**
   * The line items requested for removal from the order.
   */
  public RequestedOrderEditLineItemConnection getRemovals() {
    return removals;
  }

  public void setRemovals(RequestedOrderEditLineItemConnection removals) {
    this.removals = removals;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditLineItems{removals='" + removals + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditLineItems that = (RequestedOrderEditLineItems) o;
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
     * The line items requested for removal from the order.
     */
    private RequestedOrderEditLineItemConnection removals;

    public RequestedOrderEditLineItems build() {
      RequestedOrderEditLineItems result = new RequestedOrderEditLineItems();
      result.removals = this.removals;
      return result;
    }

    /**
     * The line items requested for removal from the order.
     */
    public Builder removals(RequestedOrderEditLineItemConnection removals) {
      this.removals = removals;
      return this;
    }
  }
}
