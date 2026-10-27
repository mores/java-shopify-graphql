package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentOrderReleaseHoldUserError`.
 */
public enum FulfillmentOrderReleaseHoldUserErrorCode {
  /**
   * The fulfillment order wasn't found.
   */
  FULFILLMENT_ORDER_NOT_FOUND,

  /**
   * The app doesn't have access to release the fulfillment hold.
   */
  INVALID_ACCESS
}
