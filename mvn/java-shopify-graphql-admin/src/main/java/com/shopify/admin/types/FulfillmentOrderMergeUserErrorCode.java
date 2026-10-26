package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderMergeUserError`.
 */
public enum FulfillmentOrderMergeUserErrorCode {
  /**
   * The fulfillment order could not be found.
   */
  FULFILLMENT_ORDER_NOT_FOUND,

  /**
   * The fulfillment order line item quantity must be greater than 0.
   */
  GREATER_THAN,

  /**
   * The fulfillment order line item quantity is invalid.
   */
  INVALID_LINE_ITEM_QUANTITY
}
