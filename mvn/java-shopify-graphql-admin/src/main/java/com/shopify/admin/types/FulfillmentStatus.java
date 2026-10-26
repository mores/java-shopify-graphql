package com.shopify.admin.types;

/**
 * The status of a fulfillment.
 */
public enum FulfillmentStatus {
  /**
   * Shopify has created the fulfillment and is waiting for the third-party
   * fulfillment service to transition it to `open` or `success`.
   */
  PENDING,

  /**
   * The third-party fulfillment service has acknowledged the fulfillment and is processing it.
   */
  OPEN,

  /**
   * The fulfillment was completed successfully.
   */
  SUCCESS,

  /**
   * The fulfillment was canceled.
   */
  CANCELLED,

  /**
   * There was an error with the fulfillment request.
   */
  ERROR,

  /**
   * The fulfillment request failed.
   */
  FAILURE
}
