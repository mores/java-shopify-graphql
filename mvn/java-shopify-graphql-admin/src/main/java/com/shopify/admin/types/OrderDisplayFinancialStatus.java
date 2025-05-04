package com.shopify.admin.types;

/**
 * Represents the order's current financial status.
 */
public enum OrderDisplayFinancialStatus {
  PENDING,

  AUTHORIZED,

  PARTIALLY_PAID,

  PARTIALLY_REFUNDED,

  VOIDED,

  PAID,

  REFUNDED,

  EXPIRED
}
