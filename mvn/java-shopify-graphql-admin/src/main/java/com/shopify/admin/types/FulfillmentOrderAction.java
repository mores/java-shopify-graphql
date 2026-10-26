package com.shopify.admin.types;

/**
 * The actions that can be taken on a fulfillment order.
 */
public enum FulfillmentOrderAction {
  /**
   * Creates a fulfillment for selected line items in the fulfillment order. The
   * corresponding mutation for this action is `fulfillmentCreateV2`.
   */
  CREATE_FULFILLMENT,

  /**
   * Sends a request for fulfilling selected line items in a fulfillment order to a
   * fulfillment service. The corresponding mutation for this action is
   * `fulfillmentOrderSubmitFulfillmentRequest`.
   */
  REQUEST_FULFILLMENT,

  /**
   * Cancels a fulfillment order. The corresponding mutation for this action is `fulfillmentOrderCancel`.
   */
  CANCEL_FULFILLMENT_ORDER,

  /**
   * Moves a fulfillment order. The corresponding mutation for this action is `fulfillmentOrderMove`.
   */
  MOVE,

  /**
   * Sends a cancellation request to the fulfillment service of a fulfillment
   * order. The corresponding mutation for this action is
   * `fulfillmentOrderSubmitCancellationRequest`.
   */
  REQUEST_CANCELLATION,

  /**
   * Marks the fulfillment order as open. The corresponding mutation for this action is `fulfillmentOrderOpen`.
   */
  MARK_AS_OPEN,

  /**
   * Releases the fulfillment hold on the fulfillment order. The corresponding
   * mutation for this action is `fulfillmentOrderReleaseHold`.
   */
  RELEASE_HOLD,

  /**
   * Applies a fulfillment hold on the fulfillment order. The corresponding mutation for this action is `fulfillmentOrderHold`.
   */
  HOLD,

  /**
   * Opens an external URL to initiate the fulfillment process outside Shopify.
   * This action should be paired with
   * `FulfillmentOrderSupportedAction.externalUrl`.
   */
  EXTERNAL,

  /**
   * Splits a fulfillment order. The corresponding mutation for this action is `fulfillmentOrderSplit`.
   */
  SPLIT,

  /**
   * Merges a fulfillment order. The corresponding mutation for this action is `fulfillmentOrderMerge`.
   */
  MERGE,

  /**
   * Report the progress of the fulfillment order, marking as in progress if it's not already in progress.
   */
  REPORT_PROGRESS
}
