package com.shopify.admin.types;

/**
 * Specifies the relationship between the `column` and the `condition`.
 */
public enum CollectionRuleRelation {
  /**
   * The attribute contains the condition.
   */
  CONTAINS,

  /**
   * The attribute ends with the condition.
   */
  ENDS_WITH,

  /**
   * The attribute is equal to the condition.
   */
  EQUALS,

  /**
   * The attribute is greater than the condition.
   */
  GREATER_THAN,

  /**
   * The attribute is not set (equal to `null`).
   */
  IS_NOT_SET,

  /**
   * The attribute is set (not equal to `null`).
   */
  IS_SET,

  /**
   * The attribute is less than the condition.
   */
  LESS_THAN,

  /**
   * The attribute does not contain the condition.
   */
  NOT_CONTAINS,

  /**
   * The attribute does not equal the condition.
   */
  NOT_EQUALS,

  /**
   * The attribute starts with the condition.
   */
  STARTS_WITH
}
