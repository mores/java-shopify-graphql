package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MenuCreateUserError`.
 */
public enum MenuCreateUserErrorCode {
  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The menu cannot be nested more than 3 level deep.
   */
  NESTING_TOO_DEEP
}
