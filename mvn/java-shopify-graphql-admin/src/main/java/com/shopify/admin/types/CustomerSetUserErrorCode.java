package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerSetUserError`.
 */
public enum CustomerSetUserErrorCode {
  INVALID,

  INCLUSION,

  TAKEN,

  TOO_LONG,

  TOO_SHORT,

  PRESENT,

  BLANK,

  ID_NOT_ALLOWED,

  MISSING_FIELD_REQUIRED,

  INPUT_MISMATCH,

  NOT_FOUND,

  METAFIELD_MISMATCH
}
