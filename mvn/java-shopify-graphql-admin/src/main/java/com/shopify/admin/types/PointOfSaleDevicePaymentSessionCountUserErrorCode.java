package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PointOfSaleDevicePaymentSessionCountUserError`.
 */
public enum PointOfSaleDevicePaymentSessionCountUserErrorCode {
  /**
   * Staff member not found.
   */
  STAFF_MEMBER_NOT_FOUND,

  /**
   * Point of sale device payment session not found.
   */
  PAYMENT_SESSION_NOT_FOUND,

  /**
   * Session is already closed.
   */
  SESSION_ALREADY_CLOSED,

  /**
   * Time cannot be before session opening time.
   */
  TIME_BEFORE_SESSION_OPEN,

  /**
   * Reason code not found.
   */
  REASON_CODE_NOT_FOUND,

  /**
   * The currency code does not match the cash drawer currency.
   */
  CURRENCY_MISMATCH,

  /**
   * Point of sale device has no cash drawer associated with it.
   */
  NO_CASH_DRAWER_ASSOCIATED,

  /**
   * Point of sale device payment session count not recorded.
   */
  FAILED_TO_RECORD_COUNT
}
