package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the line item changes in an edit calculation, grouped by the type of change.
 */
public class CalculateRequestedOrderEditLineItemsInput {
  /**
   * The line items to be removed in the edit calculation.
   */
  private List<CalculateRequestedOrderEditLineItemRemovalInput> removals;

  public CalculateRequestedOrderEditLineItemsInput() {
  }

  /**
   * The line items to be removed in the edit calculation.
   */
  public List<CalculateRequestedOrderEditLineItemRemovalInput> getRemovals() {
    return removals;
  }

  public void setRemovals(List<CalculateRequestedOrderEditLineItemRemovalInput> removals) {
    this.removals = removals;
  }

  @Override
  public String toString() {
    return "CalculateRequestedOrderEditLineItemsInput{removals='" + removals + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculateRequestedOrderEditLineItemsInput that = (CalculateRequestedOrderEditLineItemsInput) o;
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
     * The line items to be removed in the edit calculation.
     */
    private List<CalculateRequestedOrderEditLineItemRemovalInput> removals;

    public CalculateRequestedOrderEditLineItemsInput build() {
      CalculateRequestedOrderEditLineItemsInput result = new CalculateRequestedOrderEditLineItemsInput();
      result.removals = this.removals;
      return result;
    }

    /**
     * The line items to be removed in the edit calculation.
     */
    public Builder removals(List<CalculateRequestedOrderEditLineItemRemovalInput> removals) {
      this.removals = removals;
      return this;
    }
  }
}
