package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PriceListFixedPricesByProductBulkUpdateUserError`.
 */
public enum PriceListFixedPricesByProductBulkUpdateUserErrorCode {
  /**
   * No update operations specified.
   */
  NO_UPDATE_OPERATIONS_SPECIFIED,

  /**
   * The currency specified does not match the price list's currency.
   */
  PRICES_TO_ADD_CURRENCY_MISMATCH,

  /**
   * Price list does not exist.
   */
  PRICE_LIST_DOES_NOT_EXIST,

  /**
   * Duplicate ID in input.
   */
  DUPLICATE_ID_IN_INPUT,

  /**
   * IDs must be mutually exclusive across add or delete operations.
   */
  ID_MUST_BE_MUTUALLY_EXCLUSIVE,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Exceeded the 10000 prices to add limit.
   */
  PRICE_LIMIT_EXCEEDED,

  /**
   * The issuance currency of a local currency gift card must match the price list currency.
   */
  LOCAL_CURRENCY_GIFT_CARD_ISSUANCE_CURRENCY_MISMATCH,

  /**
   * The price of a local currency gift card cannot exceed the maximum gift card purchase limit.
   */
  LOCAL_CURRENCY_GIFT_CARD_LIMIT_EXCEEDED
}
