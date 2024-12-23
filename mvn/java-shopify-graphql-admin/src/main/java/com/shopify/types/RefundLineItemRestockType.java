package com.shopify.types;

/**
 * The type of restock performed for a particular refund line item.
 */
public enum RefundLineItemRestockType {
  RETURN,

  CANCEL,

  LEGACY_RESTOCK,

  NO_RESTOCK
}
