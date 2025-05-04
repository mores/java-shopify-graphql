package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the split applied to the fulfillment order.
 */
public class FulfillmentOrderSplitInput {
  /**
   * The fulfillment order line items to be split out.
   */
  private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

  /**
   * The ID of the fulfillment order to be split.
   */
  private String fulfillmentOrderId;

  public FulfillmentOrderSplitInput() {
  }

  /**
   * The fulfillment order line items to be split out.
   */
  public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
    return fulfillmentOrderLineItems;
  }

  public void setFulfillmentOrderLineItems(
      List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
    this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
  }

  /**
   * The ID of the fulfillment order to be split.
   */
  public String getFulfillmentOrderId() {
    return fulfillmentOrderId;
  }

  public void setFulfillmentOrderId(String fulfillmentOrderId) {
    this.fulfillmentOrderId = fulfillmentOrderId;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderSplitInput{fulfillmentOrderLineItems='" + fulfillmentOrderLineItems + "', fulfillmentOrderId='" + fulfillmentOrderId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderSplitInput that = (FulfillmentOrderSplitInput) o;
    return Objects.equals(fulfillmentOrderLineItems, that.fulfillmentOrderLineItems) &&
        Objects.equals(fulfillmentOrderId, that.fulfillmentOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrderLineItems, fulfillmentOrderId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment order line items to be split out.
     */
    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

    /**
     * The ID of the fulfillment order to be split.
     */
    private String fulfillmentOrderId;

    public FulfillmentOrderSplitInput build() {
      FulfillmentOrderSplitInput result = new FulfillmentOrderSplitInput();
      result.fulfillmentOrderLineItems = this.fulfillmentOrderLineItems;
      result.fulfillmentOrderId = this.fulfillmentOrderId;
      return result;
    }

    /**
     * The fulfillment order line items to be split out.
     */
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      return this;
    }

    /**
     * The ID of the fulfillment order to be split.
     */
    public Builder fulfillmentOrderId(String fulfillmentOrderId) {
      this.fulfillmentOrderId = fulfillmentOrderId;
      return this;
    }
  }
}
