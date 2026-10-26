package com.shopify.admin.types;

/**
 * Discrepancy reasons for order adjustments.
 */
public enum OrderAdjustmentInputDiscrepancyReason {
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
  OTHER
}
