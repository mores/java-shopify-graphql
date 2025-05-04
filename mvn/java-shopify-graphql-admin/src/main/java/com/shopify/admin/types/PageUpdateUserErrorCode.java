package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PageUpdateUserError`.
 */
public enum PageUpdateUserErrorCode {
  INVALID_PUBLISH_DATE,

  NOT_FOUND,

  BLANK,

  TOO_LONG,

  TAKEN
}
