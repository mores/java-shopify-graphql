package com.shopify.admin.types;

/**
 * The valid tiers for the predicted spend of a customer with a shop.
 */
public enum CustomerPredictedSpendTier {
  /**
   * The customer's spending is predicted to be in the top spending range for the shop in the following year.
   */
  HIGH,

  /**
   * The customer's spending is predicted to be in the normal spending range for the shop in the following year.
   */
  MEDIUM,

  /**
   * The customer's spending is predicted to be zero, or in the lowest spending range for the shop in the following year.
   */
  LOW
}
