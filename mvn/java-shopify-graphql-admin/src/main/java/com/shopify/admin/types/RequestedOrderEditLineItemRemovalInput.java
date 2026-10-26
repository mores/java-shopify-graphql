package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a line item requested for removal in a requested order edit.
 */
public class RequestedOrderEditLineItemRemovalInput {
  /**
   * The ID of the line item to request removal for.
   */
  private String lineItemId;

  /**
   * The quantity of the line item to request removal for.
   */
  private int quantity;

  public RequestedOrderEditLineItemRemovalInput() {
  }

  /**
   * The ID of the line item to request removal for.
   */
  public String getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(String lineItemId) {
    this.lineItemId = lineItemId;
  }

  /**
   * The quantity of the line item to request removal for.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditLineItemRemovalInput{lineItemId='" + lineItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditLineItemRemovalInput that = (RequestedOrderEditLineItemRemovalInput) o;
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
     * The ID of the line item to request removal for.
     */
    private String lineItemId;

    /**
     * The quantity of the line item to request removal for.
     */
    private int quantity;

    public RequestedOrderEditLineItemRemovalInput build() {
      RequestedOrderEditLineItemRemovalInput result = new RequestedOrderEditLineItemRemovalInput();
      result.lineItemId = this.lineItemId;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the line item to request removal for.
     */
    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
    }

    /**
     * The quantity of the line item to request removal for.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
