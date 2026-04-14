package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PointOfSaleDevicePaymentSessionOpenUserError`.
 */
public enum PointOfSaleDevicePaymentSessionOpenUserErrorCode {
  POINT_OF_SALE_DEVICE_NOT_FOUND,

  NO_CASH_DRAWER_ASSOCIATED,

  NOT_SAVED,

  ALREADY_OPEN,

  STAFF_MEMBER_NOT_FOUND,

  CURRENCY_MISMATCH,

  REASON_CODE_NOT_FOUND
}
