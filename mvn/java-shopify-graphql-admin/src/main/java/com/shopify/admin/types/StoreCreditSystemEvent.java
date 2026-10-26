package com.shopify.admin.types;

/**
 * The event that caused the store credit account transaction.
 */
public enum StoreCreditSystemEvent {
  /**
   * An adjustment was made to the store credit account.
   */
  ADJUSTMENT,

  /**
   * Store credit was used as payment for an order.
   */
  ORDER_PAYMENT,

  /**
   * Store credit was refunded from an order.
   */
  ORDER_REFUND,

  /**
   * A store credit payment was reverted due to another payment method failing.
   */
  PAYMENT_FAILURE,

  /**
   * A smaller amount of store credit was captured than was originally authorized.
   */
  PAYMENT_RETURNED,

  /**
   * Store credit was returned when an authorized payment was voided.
   */
  ORDER_CANCELLATION,

  /**
   * Tax finalization affected the store credit payment.
   */
  TAX_FINALIZATION,

  /**
   * Store credit was used as payment for a recurring order.
   */
  RECURRING_PAYMENT
}
