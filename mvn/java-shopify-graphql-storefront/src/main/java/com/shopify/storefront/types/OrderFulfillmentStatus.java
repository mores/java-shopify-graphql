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
  /**
   * Displayed as **Unfulfilled**. None of the items in the order have been fulfilled.
   */
  UNFULFILLED,

  /**
   * Displayed as **Partially fulfilled**. Some of the items in the order have been fulfilled.
   */
  PARTIALLY_FULFILLED,

  /**
   * Displayed as **Fulfilled**. All of the items in the order have been fulfilled.
   */
  FULFILLED,

  /**
   * Displayed as **Restocked**. All of the items in the order have been restocked. Replaced by "UNFULFILLED" status.
   */
  RESTOCKED,

  /**
   * Displayed as **Pending fulfillment**. A request for fulfillment of some items
   * awaits a response from the fulfillment service. Replaced by "IN_PROGRESS" status.
   */
  PENDING_FULFILLMENT,

  /**
   * Displayed as **Open**. None of the items in the order have been fulfilled. Replaced by "UNFULFILLED" status.
   */
  OPEN,

  /**
   * Displayed as **In progress**. Some of the items in the order have been
   * fulfilled, or a request for fulfillment has been sent to the fulfillment service.
   */
  IN_PROGRESS,

  /**
   * Displayed as **On hold**. All of the unfulfilled items in this order are on hold.
   */
  ON_HOLD,

  /**
   * Displayed as **Scheduled**. All of the unfulfilled items in this order are scheduled for fulfillment at later time.
   */
  SCHEDULED
}
