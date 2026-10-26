package com.shopify.admin.types;

/**
 * The type of adjustment activity.
 */
public enum CashAdjustmentActivityType {
  /**
   * A manual cash adjustment.
   */
  ADJUSTMENT,

  /**
   * A cash payout, such as a gift card cash out.
   */
  CASH_PAYOUT,

  /**
   * A closing adjustment.
   */
  CLOSING_ADJUSTMENT
}
