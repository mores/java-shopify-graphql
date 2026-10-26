package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrdersRerouteUserError`.
 */
public enum FulfillmentOrdersRerouteUserErrorCode {
  /**
   * No fulfillment order IDs were provided.
   */
  NO_FULFILLMENT_ORDER_IDS,

  /**
   * Fulfillment order could not be found.
   */
  FULFILLMENT_ORDER_NOT_FOUND,

  /**
   * Fulfillment orders are not from the same order.
   */
  FULFILLMENT_ORDERS_NOT_FROM_THE_SAME_ORDER,

  /**
   * All fulfillment orders must have status and request status compatible with reroutable states.
   */
  FULFILLMENT_ORDERS_STATE_NOT_SUPPORTED,

  /**
   * Cannot reassign location for fulfillment orders.
   */
  CANNOT_REASSIGN_LOCATION_FOR_FULFILLMENT_ORDERS,

  /**
   * The delivery method type is not supported.
   */
  DELIVERY_METHOD_TYPE_NOT_SUPPORTED,

  /**
   * This feature is only supported for multi-location shops.
   */
  SINGLE_LOCATION_SHOP_NOT_SUPPORTED,

  /**
   * Fulfillment orders must belong to the same location.
   */
  FULFILLMENT_ORDERS_MUST_BELONG_TO_SAME_LOCATION,

  /**
   * Cannot move a fulfillment order that has progress reported.
   */
  CANNOT_MOVE_FULFILLMENT_ORDER_WITH_REPORTED_PROGRESS
}
