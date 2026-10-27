package com.shopify.storefront.types;

/**
 * The precision of the value returned by a count field.
 */
public enum CountPrecision {
  /**
   * The count is exactly the value.
   */
  EXACT,

  /**
   * The count is at least the value. A limit was reached.
   */
  AT_LEAST
}
