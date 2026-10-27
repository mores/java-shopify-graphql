package com.shopify.admin.types;

/**
 * The status of a fulfillment order.
 */
public enum FulfillmentOrderStatus {
  /**
   * The fulfillment order is ready for fulfillment.
   */
  OPEN,

  /**
   * The fulfillment order is being processed.
   */
  IN_PROGRESS,

  /**
   * The fulfillment order has been cancelled by the merchant.
   */
  CANCELLED,

  /**
   * The fulfillment order cannot be completed as requested.
   */
  INCOMPLETE,

  /**
   * The fulfillment order has been completed and closed.
   */
  CLOSED,

  /**
   * The fulfillment order is deferred and will be ready for fulfillment after the date and time specified in `fulfill_at`.
   */
  SCHEDULED,

  /**
   * The fulfillment order is on hold. The fulfillment process can't be initiated
   * until the hold on the fulfillment order is released.
   */
  ON_HOLD
}
