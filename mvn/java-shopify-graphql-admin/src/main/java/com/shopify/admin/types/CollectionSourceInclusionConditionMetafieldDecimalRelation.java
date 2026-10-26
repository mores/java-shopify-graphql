package com.shopify.admin.types;

/**
 * The relation for comparing decimal metafield values.
 */
public enum CollectionSourceInclusionConditionMetafieldDecimalRelation {
  /**
   * The metafield value equals the specified value.
   */
  EQUALS,

  /**
   * The metafield value is greater than the specified value.
   */
  GREATER_THAN,

  /**
   * The metafield value is less than the specified value.
   */
  LESS_THAN
}
