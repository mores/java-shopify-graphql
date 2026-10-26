package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PriceListPriceUserError`.
 */
public enum PriceListPriceUserErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The price list doesn't exist.
   */
  PRICE_LIST_NOT_FOUND,

  /**
   * The specified currency doesn't match the price list's currency.
   */
  PRICE_LIST_CURRENCY_MISMATCH,

  /**
   * The issuance currency of a local currency gift card must match the price list currency.
   */
  LOCAL_CURRENCY_GIFT_CARD_ISSUANCE_CURRENCY_MISMATCH,

  /**
   * The price of a local currency gift card cannot exceed the maximum gift card purchase limit.
   */
  LOCAL_CURRENCY_GIFT_CARD_LIMIT_EXCEEDED,

  /**
   * A fixed price for the specified product variant doesn't exist.
   */
  VARIANT_NOT_FOUND,

  /**
   * Only fixed prices can be deleted.
   */
  PRICE_NOT_FIXED
}
