package com.shopify.storefront.types;

/**
 * Possible error codes that can be returned by `MetafieldsSetUserError`.
 */
public enum MetafieldsSetUserErrorCode {
  BLANK,

  INCLUSION,

  LESS_THAN_OR_EQUAL_TO,

  PRESENT,

  TOO_SHORT,

  TOO_LONG,

  INVALID_OWNER,

  INVALID_VALUE,

  INVALID_TYPE
}
