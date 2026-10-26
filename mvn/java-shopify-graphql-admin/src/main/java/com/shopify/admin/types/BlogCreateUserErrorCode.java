package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `BlogCreateUserError`.
 */
public enum BlogCreateUserErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The value is invalid for the metafield type or for the definition options.
   */
  INVALID_VALUE,

  /**
   * The metafield type is invalid.
   */
  INVALID_TYPE
}
