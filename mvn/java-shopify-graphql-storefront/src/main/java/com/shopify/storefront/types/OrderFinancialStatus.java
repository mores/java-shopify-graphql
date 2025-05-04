package com.shopify.storefront.types;

/**
 * Represents the order's current financial status.
 */
public enum OrderFinancialStatus {
  PENDING,

  AUTHORIZED,

  PARTIALLY_PAID,

  PARTIALLY_REFUNDED,

  VOIDED,

  PAID,

  REFUNDED
}
