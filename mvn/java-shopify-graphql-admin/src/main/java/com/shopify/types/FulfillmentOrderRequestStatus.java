package com.shopify.types;

/**
 * The request status of a fulfillment order.
 */
public enum FulfillmentOrderRequestStatus {
  UNSUBMITTED,

  SUBMITTED,

  ACCEPTED,

  REJECTED,

  CANCELLATION_REQUESTED,

  CANCELLATION_ACCEPTED,

  CANCELLATION_REJECTED,

  CLOSED
}
