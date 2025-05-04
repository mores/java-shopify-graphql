package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a removing a return line item from a return.
 */
public class ReturnLineItemRemoveFromReturnInput {
  /**
   * The ID of the return line item to remove.
   */
  private String returnLineItemId;

  /**
   * The quantity of the associated return line item to be removed.
   */
  private int quantity;

  public ReturnLineItemRemoveFromReturnInput() {
  }

  /**
   * The ID of the return line item to remove.
   */
  public String getReturnLineItemId() {
    return returnLineItemId;
  }

  public void setReturnLineItemId(String returnLineItemId) {
    this.returnLineItemId = returnLineItemId;
  }

  /**
   * The quantity of the associated return line item to be removed.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ReturnLineItemRemoveFromReturnInput{returnLineItemId='" + returnLineItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnLineItemRemoveFromReturnInput that = (ReturnLineItemRemoveFromReturnInput) o;
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
     * The ID of the return line item to remove.
     */
    private String returnLineItemId;

    /**
     * The quantity of the associated return line item to be removed.
     */
    private int quantity;

    public ReturnLineItemRemoveFromReturnInput build() {
      ReturnLineItemRemoveFromReturnInput result = new ReturnLineItemRemoveFromReturnInput();
      result.returnLineItemId = this.returnLineItemId;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the return line item to remove.
     */
    public Builder returnLineItemId(String returnLineItemId) {
      this.returnLineItemId = returnLineItemId;
      return this;
    }

    /**
     * The quantity of the associated return line item to be removed.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
