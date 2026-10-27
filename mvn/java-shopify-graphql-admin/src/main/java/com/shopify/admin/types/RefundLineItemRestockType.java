package com.shopify.admin.types;

/**
 * The type of restock performed for a particular refund line item.
 */
public enum RefundLineItemRestockType {
  /**
   * The refund line item was returned. Use this when restocking line items that were fulfilled.
   */
  RETURN,

  /**
   * The refund line item was canceled. Use this when restocking unfulfilled line items.
   */
  CANCEL,

  /**
   * Deprecated. The refund line item was restocked, without specifically
   * beingidentified as a return or cancelation. This value is not accepted when
   * creating new refunds.
   */
  LEGACY_RESTOCK,

  /**
   * Refund line item was not restocked.
   */
  NO_RESTOCK
}
