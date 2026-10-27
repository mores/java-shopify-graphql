package com.shopify.admin.types;

/**
 * The status of an order's eligibility for protection against fraudulent chargebacks by Shopify Protect.
 */
public enum ShopifyProtectEligibilityStatus {
  /**
   * The eligibility of the order is pending and has not yet been determined.
   */
  PENDING,

  /**
   * The order is eligible for protection against fraudulent chargebacks.
   * If an order is updated, the order's eligibility may change and protection could be removed.
   */
  ELIGIBLE,

  /**
   * The order isn't eligible for protection against fraudulent chargebacks.
   */
  NOT_ELIGIBLE
}
