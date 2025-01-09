package com.shopify.types;

/**
 * The event that caused the store credit account transaction.
 */
public enum StoreCreditSystemEvent {
  ADJUSTMENT,

  ORDER_PAYMENT,

  ORDER_REFUND,

  PAYMENT_FAILURE,

  PAYMENT_RETURNED,

  ORDER_CANCELLATION,

  TAX_FINALIZATION
}
