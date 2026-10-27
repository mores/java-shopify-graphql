package com.shopify.admin.types;

/**
 * The relationship between the product title and the condition values.
 */
public enum CollectionSourceInclusionConditionProductTitleRelation {
  /**
   * The product title equals the specified value.
   */
  EQUALS,

  /**
   * The product title does not equal the specified value.
   */
  NOT_EQUALS,

  /**
   * The product title contains the specified value.
   */
  CONTAINS,

  /**
   * The product title does not contain the specified value.
   */
  DOES_NOT_CONTAIN,

  /**
   * The product title starts with the specified value.
   */
  STARTS_WITH,

  /**
   * The product title ends with the specified value.
   */
  ENDS_WITH
}
