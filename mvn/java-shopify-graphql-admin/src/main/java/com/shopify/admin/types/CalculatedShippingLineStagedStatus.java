package com.shopify.admin.types;

/**
 * Represents the staged status of a CalculatedShippingLine on a CalculatedOrder.
 */
public enum CalculatedShippingLineStagedStatus {
  /**
   * The shipping line has no staged changes associated with it.
   */
  NONE,

  /**
   * The shipping line was added as part of the current order edit.
   */
  ADDED,

  /**
   * The shipping line was removed as part of the current order edit.
   */
  REMOVED
}
