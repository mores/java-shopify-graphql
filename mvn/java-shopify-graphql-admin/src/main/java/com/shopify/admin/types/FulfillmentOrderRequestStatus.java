package com.shopify.admin.types;

/**
 * The request status of a fulfillment order.
 */
public enum FulfillmentOrderRequestStatus {
  /**
   * The initial request status for the newly-created fulfillment orders. This is the only valid
   * request status for fulfillment orders that aren't assigned to a fulfillment service.
   */
  UNSUBMITTED,

  /**
   * The merchant requested fulfillment for this fulfillment order.
   */
  SUBMITTED,

  /**
   * The fulfillment service accepted the merchant's fulfillment request.
   */
  ACCEPTED,

  /**
   * The fulfillment service rejected the merchant's fulfillment request.
   */
  REJECTED,

  /**
   * The merchant requested a cancellation of the fulfillment request for this fulfillment order.
   */
  CANCELLATION_REQUESTED,

  /**
   * The fulfillment service accepted the merchant's fulfillment cancellation request.
   */
  CANCELLATION_ACCEPTED,

  /**
   * The fulfillment service rejected the merchant's fulfillment cancellation request.
   */
  CANCELLATION_REJECTED,

  /**
   * The fulfillment service closed the fulfillment order without completing it.
   */
  CLOSED
}
