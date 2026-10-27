package com.shopify.admin.types;

/**
 * The origin of quantity rule on a price list.
 */
public enum QuantityRuleOriginType {
  /**
   * Quantity rule is explicitly defined.
   */
  FIXED,

  /**
   * Quantity rule falls back to the relative rule.
   */
  RELATIVE
}
