package com.shopify.storefront.types;

/**
 * Possible error codes that can be returned by `ShopPayPaymentRequestSessionUserErrors`.
 */
public enum UserErrorsShopPayPaymentRequestSessionUserErrorsCode {
  /**
   * Payment request input is invalid.
   */
  PAYMENT_REQUEST_INVALID_INPUT,

  /**
   * Payment request not found.
   */
  PAYMENT_REQUEST_NOT_FOUND,

  /**
   * Idempotency key has already been used.
   */
  IDEMPOTENCY_KEY_ALREADY_USED
}
