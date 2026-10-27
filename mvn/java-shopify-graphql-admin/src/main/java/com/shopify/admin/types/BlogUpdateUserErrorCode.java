package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `BlogUpdateUserError`.
 */
public enum BlogUpdateUserErrorCode {
  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION
}
