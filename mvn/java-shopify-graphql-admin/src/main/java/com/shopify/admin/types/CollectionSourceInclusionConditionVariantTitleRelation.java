package com.shopify.admin.types;

/**
 * The relation for comparing variant titles.
 */
public enum CollectionSourceInclusionConditionVariantTitleRelation {
  /**
   * The variant title equals the specified value.
   */
  EQUALS,

  /**
   * The variant title does not equal the specified value.
   */
  NOT_EQUALS,

  /**
   * The variant title starts with the specified value.
   */
  STARTS_WITH,

  /**
   * The variant title ends with the specified value.
   */
  ENDS_WITH,

  /**
   * The variant title contains the specified value.
   */
  CONTAINS,

  /**
   * The variant title does not contain the specified value.
   */
  DOES_NOT_CONTAIN
}
