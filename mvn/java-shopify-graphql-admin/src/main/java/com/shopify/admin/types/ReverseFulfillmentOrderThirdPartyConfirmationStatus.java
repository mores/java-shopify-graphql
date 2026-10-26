package com.shopify.admin.types;

/**
 * The status of a reverse fulfillment order third-party confirmation.
 */
public enum ReverseFulfillmentOrderThirdPartyConfirmationStatus {
  /**
   * The reverse fulfillment order was accepted by the fulfillment service.
   */
  ACCEPTED,

  /**
   * The reverse fulfillment order cancelation was accepted by the fulfillment service.
   */
  CANCEL_ACCEPTED,

  /**
   * The reverse fulfillment order cancelation was rejected by the fulfillment service.
   */
  CANCEL_REJECTED,

  /**
   * The reverse fulfillment order is awaiting acceptance by the fulfillment service.
   */
  PENDING_ACCEPTANCE,

  /**
   * The reverse fulfillment order is awaiting cancelation by the fulfillment service.
   */
  PENDING_CANCELATION,

  /**
   * The reverse fulfillment order was rejected by the fulfillment service.
   */
  REJECTED
}
