package com.shopify.admin.types;

/**
 * How to caluclate the parent product variant's price while bulk updating variant relationships.
 */
public enum PriceCalculationType {
  COMPONENTS_SUM,

  FIXED,

  NONE
}
