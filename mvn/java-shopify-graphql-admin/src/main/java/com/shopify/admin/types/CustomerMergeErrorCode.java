package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerMergeUserError`.
 */
public enum CustomerMergeErrorCode {
  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR,

  /**
   * The customer cannot be merged.
   */
  INVALID_CUSTOMER,

  /**
   * The customer ID is invalid.
   */
  INVALID_CUSTOMER_ID,

  /**
   * The customer cannot be merged because it has associated gift cards.
   */
  CUSTOMER_HAS_GIFT_CARDS,

  /**
   * The customer is missing the attribute requested for override.
   */
  MISSING_OVERRIDE_ATTRIBUTE,

  /**
   * The override attribute is invalid.
   */
  OVERRIDE_ATTRIBUTE_INVALID
}
