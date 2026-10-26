package com.shopify.admin.types;

/**
 * Represents a selling plan pricing policy adjustment type.
 */
public enum SellingPlanPricingPolicyAdjustmentType {
  /**
   * Percentage off adjustment.
   */
  PERCENTAGE,

  /**
   * Fixed amount off adjustment.
   */
  FIXED_AMOUNT,

  /**
   * Price of the policy.
   */
  PRICE
}
