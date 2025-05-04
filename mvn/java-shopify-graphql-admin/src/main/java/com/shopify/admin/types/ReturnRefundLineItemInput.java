package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a return refund line item.
 */
public class ReturnRefundLineItemInput {
  /**
   * The ID of the return line item to be refunded.
   */
  private String returnLineItemId;

  /**
   * The quantity of the return line item to be refunded.
   */
  private int quantity;

  public ReturnRefundLineItemInput() {
  }

  /**
   * The ID of the return line item to be refunded.
   */
  public String getReturnLineItemId() {
    return returnLineItemId;
  }

  public void setReturnLineItemId(String returnLineItemId) {
    this.returnLineItemId = returnLineItemId;
  }

  /**
   * The quantity of the return line item to be refunded.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ReturnRefundLineItemInput{returnLineItemId='" + returnLineItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRefundLineItemInput that = (ReturnRefundLineItemInput) o;
    return Objects.equals(returnLineItemId, that.returnLineItemId) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnLineItemId, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the return line item to be refunded.
     */
    private String returnLineItemId;

    /**
     * The quantity of the return line item to be refunded.
     */
    private int quantity;

    public ReturnRefundLineItemInput build() {
      ReturnRefundLineItemInput result = new ReturnRefundLineItemInput();
      result.returnLineItemId = this.returnLineItemId;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the return line item to be refunded.
     */
    public Builder returnLineItemId(String returnLineItemId) {
      this.returnLineItemId = returnLineItemId;
      return this;
    }

    /**
     * The quantity of the return line item to be refunded.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
