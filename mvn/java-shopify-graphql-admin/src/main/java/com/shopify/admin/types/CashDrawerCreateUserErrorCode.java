package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CashDrawerCreateUserError`.
 */
public enum CashDrawerCreateUserErrorCode {
  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * Failed to create cash drawer.
   */
  NOT_SAVED,

  /**
   * A cash drawer with this name already exists at the specified location.
   */
  CASH_DRAWER_ALREADY_EXISTS,

  /**
   * The location was not found.
   */
  LOCATION_NOT_FOUND,

  /**
   * The name provided is invalid.
   */
  INVALID_NAME
}
