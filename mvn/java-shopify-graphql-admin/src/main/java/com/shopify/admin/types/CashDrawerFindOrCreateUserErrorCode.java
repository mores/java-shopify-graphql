package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CashDrawerFindOrCreateUserError`.
 */
public enum CashDrawerFindOrCreateUserErrorCode {
  INTERNAL_ERROR,

  NOT_SAVED,

  CASH_DRAWER_ASSIGNMENT_ALREADY_EXISTS,

  LOCATION_NOT_FOUND,

  POINT_OF_SALE_DEVICE_NOT_FOUND
}
