package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderHoldUserError`.
 */
public enum FulfillmentOrderHoldUserErrorCode {
  /**
   * The fulfillment order could not be found.
   */
  FULFILLMENT_ORDER_NOT_FOUND,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The fulfillment order line item quantity must be greater than 0.
   */
  GREATER_THAN_ZERO,

  /**
   * The maximum number of fulfillment holds for this fulfillment order has been
   * reached for this app. An app can only have up to 10 holds on a single
   * fulfillment order at any one time.
   */
  FULFILLMENT_ORDER_HOLD_LIMIT_REACHED,

  /**
   * The handle provided for the fulfillment hold is already in use by this app for another hold on this fulfillment order.
   */
  DUPLICATE_FULFILLMENT_HOLD_HANDLE,

  /**
   * The fulfillment order line item quantity is invalid.
   */
  INVALID_LINE_ITEM_QUANTITY,

  /**
   * The fulfillment order is not in a splittable state.
   */
  FULFILLMENT_ORDER_NOT_SPLITTABLE,

  /**
   * The fulfillment order line items are not unique.
   */
  DUPLICATED_FULFILLMENT_ORDER_LINE_ITEMS
}
