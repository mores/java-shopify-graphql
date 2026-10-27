package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductFeedCreateUserError`.
 */
public enum ProductFeedCreateUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is already taken.
   */
  TAKEN
}
