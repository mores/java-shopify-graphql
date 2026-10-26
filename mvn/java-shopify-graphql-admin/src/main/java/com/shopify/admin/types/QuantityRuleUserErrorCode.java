package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `QuantityRuleUserError`.
 */
public enum QuantityRuleUserErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * Product variant ID does not exist.
   */
  PRODUCT_VARIANT_DOES_NOT_EXIST,

  /**
   * Price list does not exist.
   */
  PRICE_LIST_DOES_NOT_EXIST,

  /**
   * Quantity rule for variant associated with the price list provided does not exist.
   */
  VARIANT_QUANTITY_RULE_DOES_NOT_EXIST,

  /**
   * Minimum must be lower than or equal to the maximum.
   */
  MINIMUM_IS_GREATER_THAN_MAXIMUM,

  /**
   * Minimum must be less than or equal to all quantity price break minimums
   * associated with this variant in the specified price list.
   */
  MINIMUM_IS_HIGHER_THAN_QUANTITY_PRICE_BREAK_MINIMUM,

  /**
   * Maximum must be greater than or equal to all quantity price break minimums
   * associated with this variant in the specified price list.
   */
  MAXIMUM_IS_LOWER_THAN_QUANTITY_PRICE_BREAK_MINIMUM,

  /**
   * Increment must be a multiple of all quantity price break minimums associated
   * with this variant in the specified price list.
   */
  INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MINIMUM,

  /**
   * Increment must be lower than or equal to the minimum.
   */
  INCREMENT_IS_GREATER_THAN_MINIMUM,

  /**
   * Value must be greater than or equal to 1.
   */
  GREATER_THAN_OR_EQUAL_TO,

  /**
   * The maximum must be a multiple of the increment.
   */
  MAXIMUM_NOT_MULTIPLE_OF_INCREMENT,

  /**
   * The minimum must be a multiple of the increment.
   */
  MINIMUM_NOT_MULTIPLE_OF_INCREMENT,

  /**
   * Quantity rules can be associated only with company location catalogs or catalogs associated with compatible markets.
   */
  CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES,

  /**
   * Quantity rule inputs must be unique by variant id.
   */
  DUPLICATE_INPUT_FOR_VARIANT,

  /**
   * Something went wrong when trying to save the quantity rule. Please try again later.
   */
  GENERIC_ERROR
}
