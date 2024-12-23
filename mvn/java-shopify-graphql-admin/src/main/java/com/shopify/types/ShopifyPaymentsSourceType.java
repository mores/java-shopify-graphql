package com.shopify.types;

/**
 * The possible source types for a balance transaction.
 */
public enum ShopifyPaymentsSourceType {
  ADJUSTMENT_REVERSAL,

  CHARGE,

  REFUND,

  SYSTEM_ADJUSTMENT,

  DISPUTE,

  ADJUSTMENT,

  TRANSFER
}
