package com.shopify.storefront.types;

/**
 * Represents the order's current financial status.
 */
public enum OrderFinancialStatus {
  /**
   * Displayed as **Pending**.
   */
  PENDING,

  /**
   * Displayed as **Authorized**.
   */
  AUTHORIZED,

  /**
   * Displayed as **Partially paid**.
   */
  PARTIALLY_PAID,

  /**
   * Displayed as **Partially refunded**.
   */
  PARTIALLY_REFUNDED,

  /**
   * Displayed as **Voided**.
   */
  VOIDED,

  /**
   * Displayed as **Paid**.
   */
  PAID,

  /**
   * Displayed as **Refunded**.
   */
  REFUNDED
}
