package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `GiftCardUserError`.
 */
public enum GiftCardErrorCode {
  TOO_LONG,

  TOO_SHORT,

  TAKEN,

  INVALID,

  INTERNAL_ERROR,

  MISSING_ARGUMENT,

  GREATER_THAN,

  GIFT_CARD_LIMIT_EXCEEDED,

  CUSTOMER_NOT_FOUND,

  RECIPIENT_NOT_FOUND
}
