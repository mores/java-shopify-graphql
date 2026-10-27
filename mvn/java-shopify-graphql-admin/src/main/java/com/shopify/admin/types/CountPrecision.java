package com.shopify.admin.types;

/**
 * The precision of the value returned by a count field.
 */
public enum CountPrecision {
  /**
   * The count is exactly the value. A write may not be reflected instantaneously.
   */
  EXACT,

  /**
   * The count is at least the value. A limit was imposed and reached.
   */
  AT_LEAST
}
