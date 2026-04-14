package com.shopify.storefront.types;

/**
 * The aggregated fulfillment status of an
 * [`Order`](https://shopify.dev/docs/api/storefront/current/objects/Order),
 * summarizing the state of all line items. Used for display purposes. 
 *
 * Statuses range from unfulfilled to fully fulfilled, with intermediate states such as in progress and on hold.
 *
 * Learn more about [order statuses](https://help.shopify.com/manual/fulfillment/managing-orders/order-status).
 */
public enum OrderFulfillmentStatus {
  UNFULFILLED,

  PARTIALLY_FULFILLED,

  FULFILLED,

  RESTOCKED,

  PENDING_FULFILLMENT,

  OPEN,

  IN_PROGRESS,

  ON_HOLD,

  SCHEDULED
}
