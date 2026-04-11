package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PriceListPriceUserError`.
 */
public enum PriceListPriceUserErrorCode {
  BLANK,

  PRICE_LIST_NOT_FOUND,

  PRICE_LIST_CURRENCY_MISMATCH,

  LOCAL_CURRENCY_GIFT_CARD_ISSUANCE_CURRENCY_MISMATCH,

  LOCAL_CURRENCY_GIFT_CARD_LIMIT_EXCEEDED,

  VARIANT_NOT_FOUND,

  PRICE_NOT_FIXED
}
