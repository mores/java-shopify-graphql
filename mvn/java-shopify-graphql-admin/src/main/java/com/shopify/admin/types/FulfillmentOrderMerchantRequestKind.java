package com.shopify.admin.types;

/**
 * The kinds of request merchants can make to a fulfillment service.
 */
public enum FulfillmentOrderMerchantRequestKind {
  /**
   * The merchant requests fulfillment for an `OPEN` fulfillment order.
   */
  FULFILLMENT_REQUEST,

  /**
   * The merchant requests cancellation of an `IN_PROGRESS` fulfillment order.
   */
  CANCELLATION_REQUEST
}
