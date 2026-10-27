package com.shopify.admin.types;

/**
 * The relation for comparing product vendors in exclusion conditions.
 */
public enum CollectionSourceExclusionConditionProductVendorRelation {
  /**
   * The product vendor equals the specified value.
   */
  EQUALS,

  /**
   * The product vendor contains the specified value.
   */
  CONTAINS
}
