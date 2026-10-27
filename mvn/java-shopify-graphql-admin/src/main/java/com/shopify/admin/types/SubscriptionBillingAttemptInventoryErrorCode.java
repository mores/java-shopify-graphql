package com.shopify.admin.types;

/**
 * Error codes for inventory-related billing attempt failures.
 */
public enum SubscriptionBillingAttemptInventoryErrorCode {
  /**
   * Insufficient inventory.
   */
  INSUFFICIENT_INVENTORY,

  /**
   * No inventory location found or enabled.
   */
  INVENTORY_ALLOCATIONS_NOT_FOUND
}
