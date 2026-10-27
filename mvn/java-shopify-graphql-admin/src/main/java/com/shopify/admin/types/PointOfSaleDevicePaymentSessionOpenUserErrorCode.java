package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PointOfSaleDevicePaymentSessionOpenUserError`.
 */
public enum PointOfSaleDevicePaymentSessionOpenUserErrorCode {
  /**
   * The point of sale device was not found.
   */
  POINT_OF_SALE_DEVICE_NOT_FOUND,

  /**
   * The point_of_sale_device has no cash drawer associated with it.
   */
  NO_CASH_DRAWER_ASSOCIATED,

  /**
   * The point of sale device payment session was not created.
   */
  NOT_SAVED,

  /**
   * A point of sale device payment session is already open for this point of sale device.
   */
  ALREADY_OPEN,

  /**
   * The staff member was not found.
   */
  STAFF_MEMBER_NOT_FOUND,

  /**
   * The currency does not match the currency of the cash drawer.
   */
  CURRENCY_MISMATCH,

  /**
   * The reason code was not found.
   */
  REASON_CODE_NOT_FOUND
}
