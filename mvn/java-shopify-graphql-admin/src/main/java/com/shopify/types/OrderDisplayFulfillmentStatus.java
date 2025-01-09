package com.shopify.types;

/**
 * Represents the order's aggregated fulfillment status for display purposes.
 */
public enum OrderDisplayFulfillmentStatus {
  UNFULFILLED,

  PARTIALLY_FULFILLED,

  FULFILLED,

  RESTOCKED,

  PENDING_FULFILLMENT,

  OPEN,

  IN_PROGRESS,

  ON_HOLD,

  SCHEDULED,

  REQUEST_DECLINED
}
