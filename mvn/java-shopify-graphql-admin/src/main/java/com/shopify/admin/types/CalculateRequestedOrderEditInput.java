package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to calculate the financial outcome of a requested order edit.
 */
public class CalculateRequestedOrderEditInput {
  /**
   * The ID of the order to calculate the requested order edit for.
   */
  private String orderId;

  /**
   * The line item changes from the order to include in the edit calculation, grouped by the type of change.
   */
  private CalculateRequestedOrderEditLineItemsInput lineItems;

  public CalculateRequestedOrderEditInput() {
  }

  /**
   * The ID of the order to calculate the requested order edit for.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The line item changes from the order to include in the edit calculation, grouped by the type of change.
   */
  public CalculateRequestedOrderEditLineItemsInput getLineItems() {
    return lineItems;
  }

  public void setLineItems(CalculateRequestedOrderEditLineItemsInput lineItems) {
    this.lineItems = lineItems;
  }

  @Override
  public String toString() {
    return "CalculateRequestedOrderEditInput{orderId='" + orderId + "', lineItems='" + lineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculateRequestedOrderEditInput that = (CalculateRequestedOrderEditInput) o;
    return Objects.equals(orderId, that.orderId) &&
        Objects.equals(lineItems, that.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, lineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the order to calculate the requested order edit for.
     */
    private String orderId;

    /**
     * The line item changes from the order to include in the edit calculation, grouped by the type of change.
     */
    private CalculateRequestedOrderEditLineItemsInput lineItems;

    public CalculateRequestedOrderEditInput build() {
      CalculateRequestedOrderEditInput result = new CalculateRequestedOrderEditInput();
      result.orderId = this.orderId;
      result.lineItems = this.lineItems;
      return result;
    }

    /**
     * The ID of the order to calculate the requested order edit for.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The line item changes from the order to include in the edit calculation, grouped by the type of change.
     */
    public Builder lineItems(CalculateRequestedOrderEditLineItemsInput lineItems) {
      this.lineItems = lineItems;
      return this;
    }
  }
}
