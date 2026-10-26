package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CashDrawerUpdateUserError`.
 */
public enum CashDrawerUpdateUserErrorCode {
  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * Failed to update cash drawer.
   */
  NOT_SAVED,

  /**
   * The cash drawer was not found.
   */
  CASH_DRAWER_NOT_FOUND,

  /**
   * A cash drawer with this name already exists at the specified location.
   */
  CASH_DRAWER_ALREADY_EXISTS,

  /**
   * The name provided is invalid.
   */
  INVALID_NAME
}
