package com.shopify.types;

/**
 * Represents the reason for the order's cancellation.
 */
public enum OrderCancelReason {
  CUSTOMER,

  DECLINED,

  FRAUD,

  INVENTORY,

  STAFF,

  OTHER
}
