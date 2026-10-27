package com.shopify.admin.types;

/**
 * Discrepancy reasons for order adjustments.
 */
public enum OrderAdjustmentDiscrepancyReason {
  /**
   * The discrepancy reason is restocking.
   */
  RESTOCK,

  /**
   * The discrepancy reason is damage.
   */
  DAMAGE,

  /**
   * The discrepancy reason is customer.
   */
  CUSTOMER,

  /**
   * The discrepancy reason is not one of the predefined reasons.
   */
  REFUND_DISCREPANCY,

  /**
   * The discrepancy reason is balance adjustment.
   */
  FULL_RETURN_BALANCING_ADJUSTMENT,

  /**
   * The discrepancy reason is pending refund.
   */
  PENDING_REFUND_DISCREPANCY
}
