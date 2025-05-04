package com.shopify.admin.types;

/**
 * The status of a reverse fulfillment order third-party confirmation.
 */
public enum ReverseFulfillmentOrderThirdPartyConfirmationStatus {
  ACCEPTED,

  CANCEL_ACCEPTED,

  CANCEL_REJECTED,

  PENDING_ACCEPTANCE,

  PENDING_CANCELATION,

  REJECTED
}
