package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PointOfSaleDevicePaymentSessionCountUserError`.
 */
public enum PointOfSaleDevicePaymentSessionCountUserErrorCode {
  STAFF_MEMBER_NOT_FOUND,

  PAYMENT_SESSION_NOT_FOUND,

  SESSION_ALREADY_CLOSED,

  TIME_BEFORE_SESSION_OPEN,

  REASON_CODE_NOT_FOUND,

  CURRENCY_MISMATCH,

  NO_CASH_DRAWER_ASSOCIATED,

  FAILED_TO_RECORD_COUNT
}
