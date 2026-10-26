package com.shopify.admin.types;

/**
 * The assigment status to be used to filter fulfillment orders.
 */
public enum FulfillmentOrderAssignmentStatus {
  /**
   * Fulfillment orders for which the merchant has requested cancellation of
   * the previously accepted fulfillment request.
   */
  CANCELLATION_REQUESTED,

  /**
   * Fulfillment orders for which the merchant has requested fulfillment.
   */
  FULFILLMENT_REQUESTED,

  /**
   * Fulfillment orders for which the merchant's fulfillment request has been accepted.
   * Any number of fulfillments can be created on these fulfillment orders
   * to completely fulfill the requested items.
   */
  FULFILLMENT_ACCEPTED,

  /**
   * Fulfillment orders for which the merchant hasn't yet requested fulfillment.
   */
  FULFILLMENT_UNSUBMITTED
}
