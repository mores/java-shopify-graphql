package com.shopify.types;

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

  CUSTOMER_NOT_FOUND,

  RECIPIENT_NOT_FOUND
}
