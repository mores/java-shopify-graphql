package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for marking fulfillment order line items as ready for pickup.
 */
public class FulfillmentOrderLineItemsPreparedForPickupInput {
  /**
   * The fulfillment orders associated with the line items which are ready to be picked up by a customer.
   */
  private List<PreparedFulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

  public FulfillmentOrderLineItemsPreparedForPickupInput() {
  }

  /**
   * The fulfillment orders associated with the line items which are ready to be picked up by a customer.
   */
  public List<PreparedFulfillmentOrderLineItemsInput> getLineItemsByFulfillmentOrder() {
    return lineItemsByFulfillmentOrder;
  }

  public void setLineItemsByFulfillmentOrder(
      List<PreparedFulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
    this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItemsPreparedForPickupInput{lineItemsByFulfillmentOrder='" + lineItemsByFulfillmentOrder + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItemsPreparedForPickupInput that = (FulfillmentOrderLineItemsPreparedForPickupInput) o;
    return Objects.equals(lineItemsByFulfillmentOrder, that.lineItemsByFulfillmentOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemsByFulfillmentOrder);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment orders associated with the line items which are ready to be picked up by a customer.
     */
    private List<PreparedFulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

    public FulfillmentOrderLineItemsPreparedForPickupInput build() {
      FulfillmentOrderLineItemsPreparedForPickupInput result = new FulfillmentOrderLineItemsPreparedForPickupInput();
      result.lineItemsByFulfillmentOrder = this.lineItemsByFulfillmentOrder;
      return result;
    }

    /**
     * The fulfillment orders associated with the line items which are ready to be picked up by a customer.
     */
    public Builder lineItemsByFulfillmentOrder(
        List<PreparedFulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
      this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
      return this;
    }
  }
}
