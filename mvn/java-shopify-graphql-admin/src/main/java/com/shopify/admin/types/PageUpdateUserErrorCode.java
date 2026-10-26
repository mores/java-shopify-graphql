package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PageUpdateUserError`.
 */
public enum PageUpdateUserErrorCode {
  /**
   * Can’t set isPublished to true and also set a future publish date.
   */
  INVALID_PUBLISH_DATE,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too big.
   */
  TOO_BIG,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The value is invalid for the metafield type or for the definition options.
   */
  INVALID_VALUE,

  /**
   * The metafield type is invalid.
   */
  INVALID_TYPE
}
