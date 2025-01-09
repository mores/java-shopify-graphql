package com.shopify.types;

/**
 * The status of an order's eligibility for protection against fraudulent chargebacks by Shopify Protect.
 */
public enum ShopifyProtectEligibilityStatus {
  PENDING,

  ELIGIBLE,

  NOT_ELIGIBLE
}
