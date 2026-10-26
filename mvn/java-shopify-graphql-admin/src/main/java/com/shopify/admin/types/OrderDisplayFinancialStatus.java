package com.shopify.admin.types;

/**
 * Represents the order's current financial status.
 */
public enum OrderDisplayFinancialStatus {
  /**
   * Displayed as **Pending**. Orders have this status when the payment provider
   * needs time to complete the payment, or when manual payment methods are being used.
   */
  PENDING,

  /**
   * Displayed as **Authorized**. The payment provider has validated the customer's
   * payment information. This status appears only for manual payment capture and
   * indicates payments should be captured before the authorization period expires.
   */
  AUTHORIZED,

  /**
   * Displayed as **Partially paid**. A payment was manually captured for the order
   * with an amount less than the full order value.
   */
  PARTIALLY_PAID,

  /**
   * Displayed as **Partially refunded**. The amount refunded to a customer is less than the full amount paid for an order.
   */
  PARTIALLY_REFUNDED,

  /**
   * Displayed as **Voided**. An authorized but uncaptured payment was voided,
   * releasing the hold on the funds. This is the payment's financial status and is
   * distinct from the order's status: an order can remain open even when its
   * payment is voided.
   */
  VOIDED,

  /**
   * Displayed as **Paid**. Payment was automatically or manually captured, or the order was marked as paid.
   */
  PAID,

  /**
   * Displayed as **Refunded**. The full amount paid for an order was refunded to the customer.
   */
  REFUNDED,

  /**
   * Displayed as **Expired**. Payment wasn't captured before the payment
   * provider's deadline on an authorized order. Some payment providers use this
   * status to indicate failed payment processing.
   */
  EXPIRED
}
