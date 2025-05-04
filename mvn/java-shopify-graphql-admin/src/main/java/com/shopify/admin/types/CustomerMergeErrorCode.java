package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerMergeUserError`.
 */
public enum CustomerMergeErrorCode {
  INTERNAL_ERROR,

  INVALID_CUSTOMER,

  INVALID_CUSTOMER_ID,

  CUSTOMER_HAS_GIFT_CARDS,

  MISSING_OVERRIDE_ATTRIBUTE,

  OVERRIDE_ATTRIBUTE_INVALID
}
