package com.shopify.admin.types;

/**
 * The possible source types for a balance transaction.
 */
public enum ShopifyPaymentsSourceType {
  /**
   * The adjustment_reversal source type.
   */
  ADJUSTMENT_REVERSAL,

  /**
   * The charge source type.
   */
  CHARGE,

  /**
   * The refund source type.
   */
  REFUND,

  /**
   * The system_adjustment source type.
   */
  SYSTEM_ADJUSTMENT,

  /**
   * The dispute source type.
   */
  DISPUTE,

  /**
   * The adjustment source type.
   */
  ADJUSTMENT,

  /**
   * The transfer source type.
   */
  TRANSFER
}
