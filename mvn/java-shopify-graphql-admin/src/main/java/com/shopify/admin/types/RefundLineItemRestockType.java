package com.shopify.admin.types;

/**
 * The type of restock performed for a particular refund line item.
 */
public enum RefundLineItemRestockType {
  RETURN,

  CANCEL,

  LEGACY_RESTOCK,

  NO_RESTOCK
}
