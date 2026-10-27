package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CashDrawerFindOrCreateUserError`.
 */
public enum CashDrawerFindOrCreateUserErrorCode {
  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * Failed to find or create cash drawer.
   */
  NOT_SAVED,

  /**
   * The cash drawer assignment already exists.
   */
  CASH_DRAWER_ASSIGNMENT_ALREADY_EXISTS,

  /**
   * The location was not found.
   */
  LOCATION_NOT_FOUND,

  /**
   * The point of sale device was not found.
   */
  POINT_OF_SALE_DEVICE_NOT_FOUND
}
