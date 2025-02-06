package com.shopify.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderSplitUserError`.
 */
public enum FulfillmentOrderSplitUserErrorCode {
  FULFILLMENT_ORDER_NOT_FOUND,

  GREATER_THAN,

  INVALID_LINE_ITEM_QUANTITY,

  NO_LINE_ITEMS_PROVIDED_TO_SPLIT
}
