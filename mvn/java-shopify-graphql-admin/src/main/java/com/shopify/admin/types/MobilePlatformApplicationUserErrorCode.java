package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MobilePlatformApplicationUserError`.
 */
public enum MobilePlatformApplicationUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value is too long.
   */
  TOO_LONG
}
