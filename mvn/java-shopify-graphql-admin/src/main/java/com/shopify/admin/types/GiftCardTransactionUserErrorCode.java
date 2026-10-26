package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `GiftCardTransactionUserError`.
 */
public enum GiftCardTransactionUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * The gift card's value exceeds the allowed limits.
   */
  GIFT_CARD_LIMIT_EXCEEDED,

  /**
   * The gift card could not be found.
   */
  GIFT_CARD_NOT_FOUND,

  /**
   * A positive amount must be used.
   */
  NEGATIVE_OR_ZERO_AMOUNT,

  /**
   * The gift card does not have sufficient funds to satisfy the request.
   */
  INSUFFICIENT_FUNDS,

  /**
   * The currency provided does not match the currency of the gift card.
   */
  MISMATCHING_CURRENCY
}
