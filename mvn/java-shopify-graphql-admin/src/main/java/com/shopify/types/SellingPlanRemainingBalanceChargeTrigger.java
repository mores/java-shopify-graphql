package com.shopify.types;

/**
 * When to capture the payment for the remaining amount due.
 */
public enum SellingPlanRemainingBalanceChargeTrigger {
  NO_REMAINING_BALANCE,

  EXACT_TIME,

  TIME_AFTER_CHECKOUT
}
