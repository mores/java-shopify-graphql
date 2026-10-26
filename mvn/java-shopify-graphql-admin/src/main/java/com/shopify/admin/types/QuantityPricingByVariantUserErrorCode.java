package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `QuantityPricingByVariantUserError`.
 */
public enum QuantityPricingByVariantUserErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * Price List does not exist.
   */
  PRICE_LIST_NOT_FOUND,

  /**
   * Something went wrong when trying to update quantity pricing. Please try again later.
   */
  GENERIC_ERROR,

  /**
   * Invalid quantity price break.
   */
  QUANTITY_PRICE_BREAK_ADD_INVALID,

  /**
   * Quantity price break's fixed price not found.
   */
  QUANTITY_PRICE_BREAK_ADD_PRICE_LIST_PRICE_NOT_FOUND,

  /**
   * Exceeded the allowed number of quantity price breaks per variant.
   */
  QUANTITY_PRICE_BREAK_ADD_LIMIT_EXCEEDED,

  /**
   * Price list and quantity price break currency mismatch.
   */
  QUANTITY_PRICE_BREAK_ADD_CURRENCY_MISMATCH,

  /**
   * Failed to save quantity price break.
   */
  QUANTITY_PRICE_BREAK_ADD_FAILED_TO_SAVE,

  /**
   * Quantity price break miniumum is less than the quantity rule minimum.
   */
  QUANTITY_PRICE_BREAK_ADD_MIN_LOWER_THAN_QUANTITY_RULES_MIN,

  /**
   * Quantity price break miniumum is higher than the quantity rule maximum.
   */
  QUANTITY_PRICE_BREAK_ADD_MIN_HIGHER_THAN_QUANTITY_RULES_MAX,

  /**
   * Quantity price break miniumum is not multiple of the quantity rule increment.
   */
  QUANTITY_PRICE_BREAK_ADD_MIN_NOT_A_MULTIPLE_OF_QUANTITY_RULES_INCREMENT,

  /**
   * Quantity price break variant not found.
   */
  QUANTITY_PRICE_BREAK_ADD_VARIANT_NOT_FOUND,

  /**
   * Quantity price breaks to add inputs must be unique by variant id and minimum quantity.
   */
  QUANTITY_PRICE_BREAK_ADD_DUPLICATE_INPUT_FOR_VARIANT_AND_MIN,

  /**
   * Quantity price break not found.
   */
  QUANTITY_PRICE_BREAK_DELETE_NOT_FOUND,

  /**
   * Failed to delete quantity price break.
   */
  QUANTITY_PRICE_BREAK_DELETE_FAILED,

  /**
   * Quantity rule variant not found.
   */
  QUANTITY_RULE_ADD_VARIANT_NOT_FOUND,

  /**
   * Quantity rule minimum is higher than the quantity price break minimum.
   */
  QUANTITY_RULE_ADD_MIN_HIGHER_THAN_QUANTITY_PRICE_BREAK_MIN,

  /**
   * Quantity rule maximum is less than the quantity price break minimum.
   */
  QUANTITY_RULE_ADD_MAX_LOWER_THAN_QUANTITY_PRICE_BREAK_MIN,

  /**
   * Quantity rule increment must be a multiple of the quantity price break minimum.
   */
  QUANTITY_RULE_ADD_INCREMENT_NOT_A_MULTIPLE_OF_QUANTITY_PRICE_BREAK_MIN,

  /**
   * Quantity rule catalog context not supported.
   */
  QUANTITY_RULE_ADD_CATALOG_CONTEXT_NOT_SUPPORTED,

  /**
   * Quantity rule increment is greater than minimum.
   */
  QUANTITY_RULE_ADD_INCREMENT_IS_GREATER_THAN_MINIMUM,

  /**
   * Quantity rule minimum is not a multiple of increment.
   */
  QUANTITY_RULE_ADD_MINIMUM_NOT_A_MULTIPLE_OF_INCREMENT,

  /**
   * Quantity rule maximum is not a multiple of increment.
   */
  QUANTITY_RULE_ADD_MAXIMUM_NOT_A_MULTIPLE_OF_INCREMENT,

  /**
   * Quantity rule minimum is greater than maximum.
   */
  QUANTITY_RULE_ADD_MINIMUM_GREATER_THAN_MAXIMUM,

  /**
   * Quantity rule increment is less than one.
   */
  QUANTITY_RULE_ADD_INCREMENT_IS_LESS_THAN_ONE,

  /**
   * Quantity rule minimum is less than one.
   */
  QUANTITY_RULE_ADD_MINIMUM_IS_LESS_THAN_ONE,

  /**
   * Quantity rule maximum is less than one.
   */
  QUANTITY_RULE_ADD_MAXIMUM_IS_LESS_THAN_ONE,

  /**
   * Quantity rules to add inputs must be unique by variant id.
   */
  QUANTITY_RULE_ADD_DUPLICATE_INPUT_FOR_VARIANT,

  /**
   * Quantity rule not found.
   */
  QUANTITY_RULE_DELETE_RULE_NOT_FOUND,

  /**
   * Quantity rule variant not found.
   */
  QUANTITY_RULE_DELETE_VARIANT_NOT_FOUND,

  /**
   * Price list and fixed price currency mismatch.
   */
  PRICE_ADD_CURRENCY_MISMATCH,

  /**
   * Fixed price's variant not found.
   */
  PRICE_ADD_VARIANT_NOT_FOUND,

  /**
   * Prices to add inputs must be unique by variant id.
   */
  PRICE_ADD_DUPLICATE_INPUT_FOR_VARIANT,

  /**
   * The issuance currency of a local currency gift card must match the price list currency.
   */
  PRICE_ADD_LOCAL_CURRENCY_GIFT_CARD_ISSUANCE_CURRENCY_MISMATCH,

  /**
   * The price of a local currency gift card cannot exceed the maximum gift card purchase limit.
   */
  PRICE_ADD_LOCAL_CURRENCY_GIFT_CARD_LIMIT_EXCEEDED,

  /**
   * Price is not fixed.
   */
  PRICE_DELETE_PRICE_NOT_FIXED,

  /**
   * Fixed price's variant not found.
   */
  PRICE_DELETE_VARIANT_NOT_FOUND,

  /**
   * Variant to delete by is not found.
   */
  QUANTITY_PRICE_BREAK_DELETE_BY_VARIANT_ID_VARIANT_NOT_FOUND
}
