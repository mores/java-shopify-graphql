package com.shopify.admin.types;

/**
 * The status of payments associated with the order. Can only be set when the order is created.
 */
public enum OrderCreateFinancialStatus {
  /**
   * The payments are pending. Payment might fail in this state. Check again to
   * confirm whether the payments have been paid successfully.
   */
  PENDING,

  /**
   * The payments have been authorized.
   */
  AUTHORIZED,

  /**
   * The order has been partially paid.
   */
  PARTIALLY_PAID,

  /**
   * The payments have been paid.
   */
  PAID,

  /**
   * The payments have been partially refunded.
   */
  PARTIALLY_REFUNDED,

  /**
   * The payments have been refunded.
   */
  REFUNDED,

  /**
   * The payments have been voided.
   */
  VOIDED,

  /**
   * The payments have been expired.
   */
  EXPIRED
}
