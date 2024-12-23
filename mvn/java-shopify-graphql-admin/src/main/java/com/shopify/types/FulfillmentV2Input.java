package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields used to create a fulfillment from fulfillment orders.
 */
public class FulfillmentV2Input {
  /**
   * The fulfillment's tracking information, including a tracking URL, a tracking number,
   * and the company associated with the fulfillment.
   */
  private FulfillmentTrackingInput trackingInfo;

  /**
   * Whether the customer is notified.
   * If `true`, then a notification is sent when the fulfillment is created. The default value is `false`.
   */
  private Boolean notifyCustomer = false;

  /**
   * Pairs of `fulfillment_order_id` and `fulfillment_order_line_items` that represent the fulfillment
   * order line items that have to be fulfilled for each fulfillment order.  For any given pair, if the
   * fulfillment order line items are left blank then all the fulfillment order line items of the
   * associated fulfillment order ID will be fulfilled.
   */
  private List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

  /**
   * Address information about the location from which the order was fulfilled.
   */
  private FulfillmentOriginAddressInput originAddress;

  public FulfillmentV2Input() {
  }

  /**
   * The fulfillment's tracking information, including a tracking URL, a tracking number,
   * and the company associated with the fulfillment.
   */
  public FulfillmentTrackingInput getTrackingInfo() {
    return trackingInfo;
  }

  public void setTrackingInfo(FulfillmentTrackingInput trackingInfo) {
    this.trackingInfo = trackingInfo;
  }

  /**
   * Whether the customer is notified.
   * If `true`, then a notification is sent when the fulfillment is created. The default value is `false`.
   */
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  /**
   * Pairs of `fulfillment_order_id` and `fulfillment_order_line_items` that represent the fulfillment
   * order line items that have to be fulfilled for each fulfillment order.  For any given pair, if the
   * fulfillment order line items are left blank then all the fulfillment order line items of the
   * associated fulfillment order ID will be fulfilled.
   */
  public List<FulfillmentOrderLineItemsInput> getLineItemsByFulfillmentOrder() {
    return lineItemsByFulfillmentOrder;
  }

  public void setLineItemsByFulfillmentOrder(
      List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
    this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
  }

  /**
   * Address information about the location from which the order was fulfilled.
   */
  public FulfillmentOriginAddressInput getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(FulfillmentOriginAddressInput originAddress) {
    this.originAddress = originAddress;
  }

  @Override
  public String toString() {
    return "FulfillmentV2Input{trackingInfo='" + trackingInfo + "', notifyCustomer='" + notifyCustomer + "', lineItemsByFulfillmentOrder='" + lineItemsByFulfillmentOrder + "', originAddress='" + originAddress + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentV2Input that = (FulfillmentV2Input) o;
    return Objects.equals(trackingInfo, that.trackingInfo) &&
        Objects.equals(notifyCustomer, that.notifyCustomer) &&
        Objects.equals(lineItemsByFulfillmentOrder, that.lineItemsByFulfillmentOrder) &&
        Objects.equals(originAddress, that.originAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingInfo, notifyCustomer, lineItemsByFulfillmentOrder, originAddress);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment's tracking information, including a tracking URL, a tracking number,
     * and the company associated with the fulfillment.
     */
    private FulfillmentTrackingInput trackingInfo;

    /**
     * Whether the customer is notified.
     * If `true`, then a notification is sent when the fulfillment is created. The default value is `false`.
     */
    private Boolean notifyCustomer = false;

    /**
     * Pairs of `fulfillment_order_id` and `fulfillment_order_line_items` that represent the fulfillment
     * order line items that have to be fulfilled for each fulfillment order.  For any given pair, if the
     * fulfillment order line items are left blank then all the fulfillment order line items of the
     * associated fulfillment order ID will be fulfilled.
     */
    private List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

    /**
     * Address information about the location from which the order was fulfilled.
     */
    private FulfillmentOriginAddressInput originAddress;

    public FulfillmentV2Input build() {
      FulfillmentV2Input result = new FulfillmentV2Input();
      result.trackingInfo = this.trackingInfo;
      result.notifyCustomer = this.notifyCustomer;
      result.lineItemsByFulfillmentOrder = this.lineItemsByFulfillmentOrder;
      result.originAddress = this.originAddress;
      return result;
    }

    /**
     * The fulfillment's tracking information, including a tracking URL, a tracking number,
     * and the company associated with the fulfillment.
     */
    public Builder trackingInfo(FulfillmentTrackingInput trackingInfo) {
      this.trackingInfo = trackingInfo;
      return this;
    }

    /**
     * Whether the customer is notified.
     * If `true`, then a notification is sent when the fulfillment is created. The default value is `false`.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }

    /**
     * Pairs of `fulfillment_order_id` and `fulfillment_order_line_items` that represent the fulfillment
     * order line items that have to be fulfilled for each fulfillment order.  For any given pair, if the
     * fulfillment order line items are left blank then all the fulfillment order line items of the
     * associated fulfillment order ID will be fulfilled.
     */
    public Builder lineItemsByFulfillmentOrder(
        List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
      this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
      return this;
    }

    /**
     * Address information about the location from which the order was fulfilled.
     */
    public Builder originAddress(FulfillmentOriginAddressInput originAddress) {
      this.originAddress = originAddress;
      return this;
    }
  }
}
