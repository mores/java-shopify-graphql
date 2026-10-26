package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderLineItemsPreparedForPickupUserError`.
 */
public enum FulfillmentOrderLineItemsPreparedForPickupUserErrorCode {
  /**
   * The fulfillment order does not have any line items that can be prepared.
   */
  NO_LINE_ITEMS_TO_PREPARE_FOR_FULFILLMENT_ORDER,

  /**
   * Invalid fulfillment order ID provided.
   */
  FULFILLMENT_ORDER_INVALID,

  /**
   * Unable to prepare quantity.
   */
  UNABLE_TO_PREPARE_QUANTITY
}
