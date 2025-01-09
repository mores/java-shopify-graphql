package com.shopify.types;

/**
 * The status of payments associated with the order. Can only be set when the order is created.
 */
public enum OrderCreateFinancialStatus {
  PENDING,

  AUTHORIZED,

  PARTIALLY_PAID,

  PAID,

  PARTIALLY_REFUNDED,

  REFUNDED,

  VOIDED,

  EXPIRED
}
