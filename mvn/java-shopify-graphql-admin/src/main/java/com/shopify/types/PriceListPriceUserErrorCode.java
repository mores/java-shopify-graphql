package com.shopify.types;

/**
 * Possible error codes that can be returned by `PriceListPriceUserError`.
 */
public enum PriceListPriceUserErrorCode {
  BLANK,

  PRICE_LIST_NOT_FOUND,

  PRICE_LIST_CURRENCY_MISMATCH,

  VARIANT_NOT_FOUND,

  PRICE_NOT_FIXED
}
