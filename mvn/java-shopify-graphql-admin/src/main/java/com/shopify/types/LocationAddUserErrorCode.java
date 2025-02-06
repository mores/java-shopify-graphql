package com.shopify.types;

/**
 * Possible error codes that can be returned by `LocationAddUserError`.
 */
public enum LocationAddUserErrorCode {
  INVALID,

  TOO_LONG,

  TAKEN,

  BLANK,

  INVALID_US_ZIPCODE,

  GENERIC_ERROR,

  INVALID_TYPE,

  INVALID_VALUE,

  APP_NOT_AUTHORIZED,

  UNSTRUCTURED_RESERVED_NAMESPACE,

  DISALLOWED_OWNER_TYPE,

  INCLUSION,

  PRESENT,

  TOO_SHORT,

  CAPABILITY_VIOLATION,

  INTERNAL_ERROR
}
