package com.shopify.admin.types;

/**
 * Conditions that target variants cause either the entire product to be included when satisfied or only the matching variants.
 */
public enum CollectionSourceTargetType {
  /**
   * The entire product is included if any variant satisfies the conditions.
   */
  PRODUCTS,

  /**
   * Individual variants are included if they satisfy the conditions.
   */
  VARIANTS
}
