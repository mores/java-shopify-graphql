package com.shopify.types;

/**
 * Represents the order's current financial status.
 */
public enum OrderFinancialStatus {
  AUTHORIZED,

  PAID,

  PARTIALLY_PAID,

  PARTIALLY_REFUNDED,

  PENDING,

  REFUNDED,

  VOIDED
}
