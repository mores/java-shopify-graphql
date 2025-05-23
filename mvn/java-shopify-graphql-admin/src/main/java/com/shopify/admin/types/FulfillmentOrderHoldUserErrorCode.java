package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderHoldUserError`.
 */
public enum FulfillmentOrderHoldUserErrorCode {
  FULFILLMENT_ORDER_NOT_FOUND,

  TAKEN,

  GREATER_THAN_ZERO,

  FULFILLMENT_ORDER_HOLD_LIMIT_REACHED,

  DUPLICATE_FULFILLMENT_HOLD_HANDLE,

  INVALID_LINE_ITEM_QUANTITY,

  FULFILLMENT_ORDER_NOT_SPLITTABLE,

  DUPLICATED_FULFILLMENT_ORDER_LINE_ITEMS
}
