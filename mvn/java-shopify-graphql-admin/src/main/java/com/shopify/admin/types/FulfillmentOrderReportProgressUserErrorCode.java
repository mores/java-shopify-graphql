package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderReportProgressUserError`.
 */
public enum FulfillmentOrderReportProgressUserErrorCode {
  /**
   * The fulfillment order could not be found.
   */
  FULFILLMENT_ORDER_NOT_FOUND,

  /**
   * The fulfillment order status is invalid.
   */
  FULFILLMENT_ORDER_STATUS_INVALID,

  /**
   * The fulfillment order contains picked items.
   */
  FULFILLMENT_ORDER_CONTAINS_PICKED_ITEMS,

  /**
   * Progress cannot be reported for a fulfillment order with this delivery method.
   */
  FULFILLMENT_ORDER_INVALID_DELIVERY_METHOD,

  /**
   * The fulfillment order is not assigned to the requesting fulfillment service.
   */
  FULFILLMENT_ORDER_INVALID_FULFILLMENT_SERVICE_OWNERSHIP,

  /**
   * The action is not supported for the fulfillment order.
   */
  FULFILLMENT_ORDER_UNSUPPORTED_ACTION,

  /**
   * Marketplace apps are not eligible to report progress on fulfillment orders.
   */
  MARKETPLACE_APP_NOT_ELIGIBLE
}
