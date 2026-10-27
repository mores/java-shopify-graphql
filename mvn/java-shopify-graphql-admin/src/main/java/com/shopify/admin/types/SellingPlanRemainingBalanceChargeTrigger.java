package com.shopify.admin.types;

/**
 * When to capture the payment for the remaining amount due.
 */
public enum SellingPlanRemainingBalanceChargeTrigger {
  /**
   * When there's no remaining balance to be charged after checkout.
   */
  NO_REMAINING_BALANCE,

  /**
   * At an exact time defined by the remaining_balance_charge_exact_time field.
   */
  EXACT_TIME,

  /**
   * After the duration defined by the remaining_balance_charge_time_after_checkout field.
   */
  TIME_AFTER_CHECKOUT,

  /**
   * When the order is fulfilled.
   */
  ON_FULFILLMENT
}
