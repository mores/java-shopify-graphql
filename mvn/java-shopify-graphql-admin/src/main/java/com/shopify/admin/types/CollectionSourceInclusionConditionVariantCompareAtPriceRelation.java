package com.shopify.admin.types;

/**
 * The relation for comparing variant compare at prices.
 */
public enum CollectionSourceInclusionConditionVariantCompareAtPriceRelation {
  /**
   * The variant compare at price equals the specified value.
   */
  EQUALS,

  /**
   * The variant compare at price does not equal the specified value.
   */
  NOT_EQUALS,

  /**
   * The variant compare at price is greater than the specified value.
   */
  GREATER_THAN,

  /**
   * The variant compare at price is less than the specified value.
   */
  LESS_THAN,

  /**
   * The variant has a compare at price set (indicating a price reduction).
   */
  IS_SET,

  /**
   * The variant does not have a compare at price set.
   */
  IS_NOT_SET
}
