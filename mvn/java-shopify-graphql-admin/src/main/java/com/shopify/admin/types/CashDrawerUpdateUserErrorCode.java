package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CashDrawerUpdateUserError`.
 */
public enum CashDrawerUpdateUserErrorCode {
  INTERNAL_ERROR,

  NOT_SAVED,

  CASH_DRAWER_NOT_FOUND,

  CASH_DRAWER_ALREADY_EXISTS,

  INVALID_NAME
}
