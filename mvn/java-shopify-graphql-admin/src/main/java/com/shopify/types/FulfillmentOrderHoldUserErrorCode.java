package com.shopify.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderHoldUserError`.
 */
public enum FulfillmentOrderHoldUserErrorCode {
  FULFILLMENT_ORDER_NOT_FOUND,

  TAKEN,

  GREATER_THAN_ZERO,

  INVALID_LINE_ITEM_QUANTITY
}
