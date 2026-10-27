package com.shopify.storefront.types;

/**
 * Represents the reason for the order's cancellation.
 */
public enum OrderCancelReason {
  /**
   * The customer wanted to cancel the order.
   */
  CUSTOMER,

  /**
   * Payment was declined.
   */
  DECLINED,

  /**
   * The order was fraudulent.
   */
  FRAUD,

  /**
   * There was insufficient inventory.
   */
  INVENTORY,

  /**
   * Staff made an error.
   */
  STAFF,

  /**
   * The order was canceled for an unlisted reason.
   */
  OTHER
}
