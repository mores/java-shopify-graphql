package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldsSetUserError`.
 */
public enum MetafieldsSetUserErrorCode {
  CAPABILITY_VIOLATION,

  STALE_OBJECT,

  INVALID_COMPARE_DIGEST,

  INVALID_TYPE,

  INVALID_VALUE,

  APP_NOT_AUTHORIZED,

  INCLUSION,

  TAKEN,

  PRESENT,

  BLANK,

  TOO_LONG,

  TOO_SHORT,

  LESS_THAN_OR_EQUAL_TO,

  INTERNAL_ERROR
}
