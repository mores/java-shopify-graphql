package com.shopify.admin.types;

/**
 * The relation for comparing variant inventory quantities.
 */
public enum CollectionSourceInclusionConditionVariantInventoryRelation {
  /**
   * The variant inventory equals the specified value.
   */
  EQUALS,

  /**
   * The variant inventory is greater than the specified value.
   */
  GREATER_THAN,

  /**
   * The variant inventory is less than the specified value.
   */
  LESS_THAN
}
