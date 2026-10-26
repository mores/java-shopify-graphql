package com.shopify.admin.types;

/**
 * The relation for comparing product types in exclusion conditions.
 */
public enum CollectionSourceExclusionConditionProductTypeRelation {
  /**
   * The product type equals the specified value.
   */
  EQUALS,

  /**
   * The product type contains the specified value.
   */
  CONTAINS
}
