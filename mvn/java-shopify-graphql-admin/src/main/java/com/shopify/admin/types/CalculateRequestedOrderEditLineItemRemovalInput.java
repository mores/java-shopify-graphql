package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a line item removal on a calculated requested order edit.
 */
public class CalculateRequestedOrderEditLineItemRemovalInput {
  /**
   * The ID of the line item to be removed.
   */
  private String lineItemId;

  /**
   * The quantity of the item to be removed. Quantity can't exceed the line item's unfulfilled quantity.
   */
  private int quantity;

  public CalculateRequestedOrderEditLineItemRemovalInput() {
  }

  /**
   * The ID of the line item to be removed.
   */
  public String getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(String lineItemId) {
    this.lineItemId = lineItemId;
  }

  /**
   * The quantity of the item to be removed. Quantity can't exceed the line item's unfulfilled quantity.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "CalculateRequestedOrderEditLineItemRemovalInput{lineItemId='" + lineItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculateRequestedOrderEditLineItemRemovalInput that = (CalculateRequestedOrderEditLineItemRemovalInput) o;
    return Objects.equals(lineItemId, that.lineItemId) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemId, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the line item to be removed.
     */
    private String lineItemId;

    /**
     * The quantity of the item to be removed. Quantity can't exceed the line item's unfulfilled quantity.
     */
    private int quantity;

    public CalculateRequestedOrderEditLineItemRemovalInput build() {
      CalculateRequestedOrderEditLineItemRemovalInput result = new CalculateRequestedOrderEditLineItemRemovalInput();
      result.lineItemId = this.lineItemId;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the line item to be removed.
     */
    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
    }

    /**
     * The quantity of the item to be removed. Quantity can't exceed the line item's unfulfilled quantity.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
