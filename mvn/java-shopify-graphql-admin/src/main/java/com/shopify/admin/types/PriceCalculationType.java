package com.shopify.admin.types;

/**
 * How to calculate the parent product variant's price while bulk updating variant relationships.
 */
public enum PriceCalculationType {
  /**
   * The price of the parent will be the sum of the components price times their quantity.
   */
  COMPONENTS_SUM,

  /**
   * The price of the parent will be set to the price provided.
   */
  FIXED,

  /**
   * The price of the parent will not be adjusted.
   */
  NONE
}
