package com.shopify.admin.types;

/**
 * The valid statuses for a draft order.
 */
public enum DraftOrderStatus {
  /**
   * The draft order has been paid.
   */
  COMPLETED,

  /**
   * An invoice for the draft order has been sent to the customer.
   */
  INVOICE_SENT,

  /**
   * The draft order is open. It has not been paid, and an invoice hasn't been sent.
   */
  OPEN
}
