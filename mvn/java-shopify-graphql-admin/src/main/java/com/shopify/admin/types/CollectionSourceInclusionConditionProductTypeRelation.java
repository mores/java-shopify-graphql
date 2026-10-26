package com.shopify.admin.types;

/**
 * The relation for comparing product types.
 */
public enum CollectionSourceInclusionConditionProductTypeRelation {
  /**
   * The product type equals the specified value.
   */
  EQUALS,

  /**
   * The product type does not equal the specified value.
   */
  NOT_EQUALS,

  /**
   * The product type starts with the specified value.
   */
  STARTS_WITH,

  /**
   * The product type ends with the specified value.
   */
  ENDS_WITH,

  /**
   * The product type contains the specified value.
   */
  CONTAINS,

  /**
   * The product type does not contain the specified value.
   */
  DOES_NOT_CONTAIN
}
