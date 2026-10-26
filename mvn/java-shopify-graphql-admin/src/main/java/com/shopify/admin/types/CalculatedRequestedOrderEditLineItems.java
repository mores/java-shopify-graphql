package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The line item changes on a calculated requested order edit, grouped by the type of change.
 */
public class CalculatedRequestedOrderEditLineItems {
  /**
   * The line items being removed in the calculated edit.
   */
  private CalculatedRequestedOrderEditLineItemConnection removals;

  public CalculatedRequestedOrderEditLineItems() {
  }

  /**
   * The line items being removed in the calculated edit.
   */
  public CalculatedRequestedOrderEditLineItemConnection getRemovals() {
    return removals;
  }

  public void setRemovals(CalculatedRequestedOrderEditLineItemConnection removals) {
    this.removals = removals;
  }

  @Override
  public String toString() {
    return "CalculatedRequestedOrderEditLineItems{removals='" + removals + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedRequestedOrderEditLineItems that = (CalculatedRequestedOrderEditLineItems) o;
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
     * The line items being removed in the calculated edit.
     */
    private CalculatedRequestedOrderEditLineItemConnection removals;

    public CalculatedRequestedOrderEditLineItems build() {
      CalculatedRequestedOrderEditLineItems result = new CalculatedRequestedOrderEditLineItems();
      result.removals = this.removals;
      return result;
    }

    /**
     * The line items being removed in the calculated edit.
     */
    public Builder removals(CalculatedRequestedOrderEditLineItemConnection removals) {
      this.removals = removals;
      return this;
    }
  }
}
