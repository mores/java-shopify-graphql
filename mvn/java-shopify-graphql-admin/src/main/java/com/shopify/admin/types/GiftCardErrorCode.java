package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `GiftCardUserError`.
 */
public enum GiftCardErrorCode {
  /**
   * The input value is too big.
   */
  TOO_BIG,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * Missing a required argument.
   */
  MISSING_ARGUMENT,

  /**
   * The input value should be greater than the minimum allowed value.
   */
  GREATER_THAN,

  /**
   * The gift card's value exceeds the allowed limits.
   */
  GIFT_CARD_LIMIT_EXCEEDED,

  /**
   * The customer could not be found.
   */
  CUSTOMER_NOT_FOUND,

  /**
   * The recipient could not be found.
   */
  RECIPIENT_NOT_FOUND
}
