package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PointOfSaleDeviceAssignToCashDrawerUserError`.
 */
public enum PointOfSaleDeviceAssignToCashDrawerUserErrorCode {
  INTERNAL_ERROR,

  LOCATION_MISMATCH,

  CASH_DRAWER_NOT_FOUND,

  POINT_OF_SALE_DEVICE_NOT_FOUND
}
