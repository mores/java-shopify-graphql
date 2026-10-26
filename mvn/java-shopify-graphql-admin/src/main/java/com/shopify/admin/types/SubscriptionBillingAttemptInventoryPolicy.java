package com.shopify.admin.types;

/**
 * The inventory policy for a billing attempt.
 */
public enum SubscriptionBillingAttemptInventoryPolicy {
  /**
   * Respect the merchant's product variant
   *         inventory policy for this billing attempt.
   */
  PRODUCT_VARIANT_INVENTORY_POLICY,

  /**
   * Override the merchant's product variant
   *          inventory policy and allow overselling for this billing attempt.
   */
  ALLOW_OVERSELLING
}
