package com.shopify.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderLineItemsPreparedForPickupUserError`.
 */
public enum FulfillmentOrderLineItemsPreparedForPickupUserErrorCode {
  NO_LINE_ITEMS_TO_PREPARE_FOR_FULFILLMENT_ORDER,

  FULFILLMENT_ORDER_INVALID,

  UNABLE_TO_PREPARE_QUANTITY
}
