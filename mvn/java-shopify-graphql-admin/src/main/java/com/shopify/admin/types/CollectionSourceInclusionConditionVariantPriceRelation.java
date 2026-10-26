package com.shopify.admin.types;

/**
 * The relation for comparing variant prices.
 */
public enum CollectionSourceInclusionConditionVariantPriceRelation {
  /**
   * The variant price equals the specified value.
   */
  EQUALS,

  /**
   * The variant price does not equal the specified value.
   */
  NOT_EQUALS,

  /**
   * The variant price is greater than the specified value.
   */
  GREATER_THAN,

  /**
   * The variant price is less than the specified value.
   */
  LESS_THAN
}
