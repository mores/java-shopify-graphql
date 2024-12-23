package com.shopify.types;

/**
 * The actions that can be taken on a fulfillment order.
 */
public enum FulfillmentOrderAction {
  CREATE_FULFILLMENT,

  REQUEST_FULFILLMENT,

  CANCEL_FULFILLMENT_ORDER,

  MOVE,

  REQUEST_CANCELLATION,

  MARK_AS_OPEN,

  RELEASE_HOLD,

  HOLD,

  EXTERNAL,

  SPLIT,

  MERGE
}
