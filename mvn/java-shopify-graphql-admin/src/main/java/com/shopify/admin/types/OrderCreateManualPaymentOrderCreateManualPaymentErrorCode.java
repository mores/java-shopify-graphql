package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `OrderCreateManualPaymentOrderCreateManualPaymentError`.
 */
public enum OrderCreateManualPaymentOrderCreateManualPaymentErrorCode {
  ORDER_NOT_FOUND,

  AMOUNT_NOT_POSITIVE,

  GATEWAY_NOT_FOUND,

  AMOUNT_EXCEEDS_BALANCE,

  ORDER_IS_TEMPORARILY_UNAVAILABLE,

  PROCESSED_AT_INVALID
}
