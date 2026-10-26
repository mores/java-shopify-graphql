package com.shopify.admin.types;

/**
 * Represents the order's aggregated fulfillment status for display purposes.
 */
public enum OrderDisplayFulfillmentStatus {
  /**
   * Displayed as **Unfulfilled**. None of the items in the order have been fulfilled.
   */
  UNFULFILLED,

  /**
   * Displayed as **Partially fulfilled**. Some of the items in the order have been fulfilled.
   */
  PARTIALLY_FULFILLED,

  /**
   * Displayed as **Fulfilled**. All the items in the order have been fulfilled.
   */
  FULFILLED,

  /**
   * Displayed as **Restocked**. All the items in the order have been restocked. Replaced by the "UNFULFILLED" status.
   */
  RESTOCKED,

  /**
   * Displayed as **Pending fulfillment**. A request for fulfillment of some items
   * awaits a response from the fulfillment service. Replaced by the "IN_PROGRESS" status.
   */
  PENDING_FULFILLMENT,

  /**
   * Displayed as **Open**. None of the items in the order have been fulfilled. Replaced by "UNFULFILLED" status.
   */
  OPEN,

  /**
   * Displayed as **In progress**. All of the items in the order have had a request
   * for fulfillment sent to the fulfillment service or all of the items have been
   * marked as in progress.
   */
  IN_PROGRESS,

  /**
   * Displayed as **On hold**. All of the unfulfilled items in this order are on hold.
   */
  ON_HOLD,

  /**
   * Displayed as **Scheduled**. All of the unfulfilled items in this order are scheduled for fulfillment at later time.
   */
  SCHEDULED,

  /**
   * Displayed as **Request declined**. Some of the items in the order have been
   * rejected for fulfillment by the fulfillment service.
   */
  REQUEST_DECLINED,

  /**
   * Displayed as **Not required** on the orders list and **Fulfillment not
   * required** in the order details header. The order has no items to be fulfilled.
   */
  FULFILLMENT_NOT_REQUIRED
}
