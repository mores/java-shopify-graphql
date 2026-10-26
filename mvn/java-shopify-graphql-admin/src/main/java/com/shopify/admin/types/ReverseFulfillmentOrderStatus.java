package com.shopify.admin.types;

/**
 * The status of a reverse fulfillment order.
 */
public enum ReverseFulfillmentOrderStatus {
  /**
   * The reverse fulfillment order has been canceled.
   */
  CANCELED,

  /**
   * The reverse fulfillment order has been completed.
   */
  CLOSED,

  /**
   * The reverse fulfillment order is in progress.
   */
  OPEN
}
