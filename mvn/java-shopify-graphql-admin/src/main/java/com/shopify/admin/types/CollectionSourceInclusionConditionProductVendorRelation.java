package com.shopify.admin.types;

/**
 * The relation for comparing product vendors.
 */
public enum CollectionSourceInclusionConditionProductVendorRelation {
  /**
   * The product vendor equals the specified value.
   */
  EQUALS,

  /**
   * The product vendor does not equal the specified value.
   */
  NOT_EQUALS,

  /**
   * The product vendor starts with the specified value.
   */
  STARTS_WITH,

  /**
   * The product vendor ends with the specified value.
   */
  ENDS_WITH,

  /**
   * The product vendor contains the specified value.
   */
  CONTAINS,

  /**
   * The product vendor does not contain the specified value.
   */
  DOES_NOT_CONTAIN
}
