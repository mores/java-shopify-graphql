package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `RequestedOrderEditCreateUserError`.
 */
public enum RequestedOrderEditCreateUserErrorCode {
  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * The input value is blank.
   */
  BLANK
}
