package com.shopify.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodGetUpdateUrlUserError`.
 */
public enum CustomerPaymentMethodGetUpdateUrlUserErrorCode {
  PAYMENT_METHOD_DOES_NOT_EXIST,

  INVALID_INSTRUMENT,

  TOO_MANY_REQUESTS,

  CUSTOMER_DOES_NOT_EXIST
}