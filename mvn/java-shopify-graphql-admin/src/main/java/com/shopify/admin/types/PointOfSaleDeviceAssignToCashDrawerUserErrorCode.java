package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PointOfSaleDeviceAssignToCashDrawerUserError`.
 */
public enum PointOfSaleDeviceAssignToCashDrawerUserErrorCode {
  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * The cash drawer and point of sale device must be in the same location.
   */
  LOCATION_MISMATCH,

  /**
   * The cash drawer was not found.
   */
  CASH_DRAWER_NOT_FOUND,

  /**
   * The point of sale device was not found.
   */
  POINT_OF_SALE_DEVICE_NOT_FOUND
}
