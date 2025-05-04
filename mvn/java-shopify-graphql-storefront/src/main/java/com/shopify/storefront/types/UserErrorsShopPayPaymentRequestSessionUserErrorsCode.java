package com.shopify.storefront.types;

/**
 * Possible error codes that can be returned by `ShopPayPaymentRequestSessionUserErrors`.
 */
public enum UserErrorsShopPayPaymentRequestSessionUserErrorsCode {
  PAYMENT_REQUEST_INVALID_INPUT,

  PAYMENT_REQUEST_NOT_FOUND,

  IDEMPOTENCY_KEY_ALREADY_USED
}
