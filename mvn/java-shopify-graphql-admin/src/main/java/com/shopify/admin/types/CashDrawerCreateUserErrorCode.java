package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CashDrawerCreateUserError`.
 */
public enum CashDrawerCreateUserErrorCode {
  INTERNAL_ERROR,

  NOT_SAVED,

  CASH_DRAWER_ALREADY_EXISTS,

  LOCATION_NOT_FOUND,

  INVALID_NAME
}
