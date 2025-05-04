package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PageCreateUserError`.
 */
public enum PageCreateUserErrorCode {
  INVALID_PUBLISH_DATE,

  BLANK,

  TOO_LONG,

  TAKEN,

  INVALID_VALUE,

  INVALID_TYPE
}
