package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `RequestedOrderEditDeclineUserError`.
 */
public enum RequestedOrderEditDeclineUserErrorCode {
  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value is invalid.
   */
  INVALID
}
