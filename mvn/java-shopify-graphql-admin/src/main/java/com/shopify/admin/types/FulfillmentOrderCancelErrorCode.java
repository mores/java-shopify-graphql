package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderCancelError`.
 */
public enum FulfillmentOrderCancelErrorCode {
  /**
   * Cannot cancel fulfillment order with reported progress. Mark as unfulfilled first.
   */
  FULFILLMENT_ORDER_HAS_MANUALLY_REPORTED_PROGRESS
}
