package com.shopify.admin.types;

/**
 * The possible order action types for a sale.
 */
public enum SaleActionType {
  /**
   * A purchase or charge.
   */
  ORDER,

  /**
   * A removal or return.
   */
  RETURN,

  /**
   * A change to the price, taxes, or discounts for a prior purchase.
   */
  UPDATE,

  /**
   * An unknown order action. Represents new actions that may be added in future versions.
   */
  UNKNOWN
}
