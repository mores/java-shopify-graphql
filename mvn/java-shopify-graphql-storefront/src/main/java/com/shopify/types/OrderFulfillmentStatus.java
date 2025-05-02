package com.shopify.types;

/**
 * Represents the order's aggregated fulfillment status for display purposes.
 */
public enum OrderFulfillmentStatus {
  FULFILLED,

  IN_PROGRESS,

  ON_HOLD,

  OPEN,

  PARTIALLY_FULFILLED,

  PENDING_FULFILLMENT,

  RESTOCKED,

  SCHEDULED,

  UNFULFILLED
}
