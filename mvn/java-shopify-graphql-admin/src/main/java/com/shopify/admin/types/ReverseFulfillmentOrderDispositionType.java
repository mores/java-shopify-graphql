package com.shopify.admin.types;

/**
 * The final arrangement of an item from a reverse fulfillment order.
 */
public enum ReverseFulfillmentOrderDispositionType {
  /**
   * An item that was restocked.
   */
  RESTOCKED,

  /**
   * An item that requires further processing before being restocked or discarded.
   */
  PROCESSING_REQUIRED,

  /**
   * An item that wasn't restocked.
   */
  NOT_RESTOCKED,

  /**
   * An item that was expected but absent.
   */
  MISSING
}
