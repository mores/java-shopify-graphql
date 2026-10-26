package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodGetUpdateUrlUserError`.
 */
public enum CustomerPaymentMethodGetUpdateUrlUserErrorCode {
  /**
   * Payment method doesn't exist.
   */
  PAYMENT_METHOD_DOES_NOT_EXIST,

  /**
   * Invalid payment instrument.
   */
  INVALID_INSTRUMENT,

  /**
   * Too many requests.
   */
  TOO_MANY_REQUESTS,

  /**
   * Customer doesn't exist.
   */
  CUSTOMER_DOES_NOT_EXIST
}
