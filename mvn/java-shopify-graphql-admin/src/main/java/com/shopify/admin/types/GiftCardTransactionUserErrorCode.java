package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `GiftCardTransactionUserError`.
 */
public enum GiftCardTransactionUserErrorCode {
  INVALID,

  INTERNAL_ERROR,

  GIFT_CARD_LIMIT_EXCEEDED,

  GIFT_CARD_NOT_FOUND,

  NEGATIVE_OR_ZERO_AMOUNT,

  INSUFFICIENT_FUNDS,

  MISMATCHING_CURRENCY
}
