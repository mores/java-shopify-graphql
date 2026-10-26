package com.shopify.admin.types;

/**
 * The status of a shipping label purchase result.
 */
public enum ShippingLabelPurchaseResultStatus {
  /**
   * Purchase is pending.
   */
  PENDING_PURCHASE,

  /**
   * Purchase failed.
   */
  PURCHASE_FAILED,

  /**
   * Purchase succeeded.
   */
  PURCHASED
}
