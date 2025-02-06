package com.shopify.types;

/**
 * Discrepancy reasons for order adjustments.
 */
public enum OrderAdjustmentDiscrepancyReason {
  RESTOCK,

  DAMAGE,

  CUSTOMER,

  REFUND_DISCREPANCY,

  FULL_RETURN_BALANCING_ADJUSTMENT,

  PENDING_REFUND_DISCREPANCY
}
