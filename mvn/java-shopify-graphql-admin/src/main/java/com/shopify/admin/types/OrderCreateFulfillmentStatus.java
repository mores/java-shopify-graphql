package com.shopify.admin.types;

/**
 * The order's status in terms of fulfilled line items.
 */
public enum OrderCreateFulfillmentStatus {
  /**
   * Every line item in the order has been fulfilled.
   */
  FULFILLED,

  /**
   * At least one line item in the order has been fulfilled.
   */
  PARTIAL,

  /**
   * Every line item in the order has been restocked and the order canceled.
   */
  RESTOCKED
}
