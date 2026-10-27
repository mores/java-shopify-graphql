package com.shopify.admin.types;

/**
 * The relation for comparing variant weights.
 */
public enum CollectionSourceInclusionConditionVariantWeightRelation {
  /**
   * The variant weight equals the specified value.
   */
  EQUALS,

  /**
   * The variant weight does not equal the specified value.
   */
  NOT_EQUALS,

  /**
   * The variant weight is greater than the specified value.
   */
  GREATER_THAN,

  /**
   * The variant weight is less than the specified value.
   */
  LESS_THAN
}
