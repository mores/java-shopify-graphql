package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for merging fulfillment orders into a single merged fulfillment order.
 */
public class FulfillmentOrderMergeInputMergeIntent {
  /**
   * The fulfillment order line items to be merged.
   */
  private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

  /**
   * The ID of the fulfillment order to be merged.
   */
  private String fulfillmentOrderId;

  public FulfillmentOrderMergeInputMergeIntent() {
  }

  /**
   * The fulfillment order line items to be merged.
   */
  public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
    return fulfillmentOrderLineItems;
  }

  public void setFulfillmentOrderLineItems(
      List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
    this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
  }

  /**
   * The ID of the fulfillment order to be merged.
   */
  public String getFulfillmentOrderId() {
    return fulfillmentOrderId;
  }

  public void setFulfillmentOrderId(String fulfillmentOrderId) {
    this.fulfillmentOrderId = fulfillmentOrderId;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderMergeInputMergeIntent{fulfillmentOrderLineItems='" + fulfillmentOrderLineItems + "', fulfillmentOrderId='" + fulfillmentOrderId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderMergeInputMergeIntent that = (FulfillmentOrderMergeInputMergeIntent) o;
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
     * The fulfillment order line items to be merged.
     */
    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

    /**
     * The ID of the fulfillment order to be merged.
     */
    private String fulfillmentOrderId;

    public FulfillmentOrderMergeInputMergeIntent build() {
      FulfillmentOrderMergeInputMergeIntent result = new FulfillmentOrderMergeInputMergeIntent();
      result.fulfillmentOrderLineItems = this.fulfillmentOrderLineItems;
      result.fulfillmentOrderId = this.fulfillmentOrderId;
      return result;
    }

    /**
     * The fulfillment order line items to be merged.
     */
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      return this;
    }

    /**
     * The ID of the fulfillment order to be merged.
     */
    public Builder fulfillmentOrderId(String fulfillmentOrderId) {
      this.fulfillmentOrderId = fulfillmentOrderId;
      return this;
    }
  }
}
