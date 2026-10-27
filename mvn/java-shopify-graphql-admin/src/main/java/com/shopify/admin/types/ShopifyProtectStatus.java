package com.shopify.admin.types;

/**
 * The status of an order's protection with Shopify Protect.
 */
public enum ShopifyProtectStatus {
  /**
   * The protection for the order is pending and has not yet been determined.
   */
  PENDING,

  /**
   * The protection for the order is active and eligible for reimbursement against fraudulent chargebacks.
   * If an order is updated, the order's eligibility may change and protection could become inactive.
   */
  ACTIVE,

  /**
   * The protection for an order isn't active because the order didn't meet eligibility requirements.
   */
  INACTIVE,

  /**
   * The order received a fraudulent chargeback and it was protected.
   */
  PROTECTED,

  /**
   * The order received a chargeback but the order wasn't protected because it didn't meet coverage requirements.
   */
  NOT_PROTECTED
}
