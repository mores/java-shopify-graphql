package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ReturnUserError`.
 */
public enum ReturnErrorCode {
  INTERNAL_ERROR,

  TOO_MANY_ARGUMENTS,

  BLANK,

  EQUAL_TO,

  GREATER_THAN,

  GREATER_THAN_OR_EQUAL_TO,

  INCLUSION,

  INVALID,

  LESS_THAN,

  LESS_THAN_OR_EQUAL_TO,

  NOT_A_NUMBER,

  PRESENT,

  TAKEN,

  TOO_BIG,

  TOO_LONG,

  TOO_SHORT,

  WRONG_LENGTH,

  ALREADY_EXISTS,

  CREATION_FAILED,

  FEATURE_NOT_ENABLED,

  INVALID_STATE,

  NOTIFICATION_FAILED,

  NOT_EDITABLE,

  NOT_FOUND
}
