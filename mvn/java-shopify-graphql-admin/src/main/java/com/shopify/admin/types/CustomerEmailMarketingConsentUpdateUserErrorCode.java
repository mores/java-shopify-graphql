package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerEmailMarketingConsentUpdateUserError`.
 */
public enum CustomerEmailMarketingConsentUpdateUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * Missing a required argument.
   */
  MISSING_ARGUMENT
}
