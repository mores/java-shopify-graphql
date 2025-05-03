package com.shopify.storefront.types;

/**
 * Possible error codes that can be returned by `CustomerUserError`.
 */
public enum CustomerErrorCode {
  ALREADY_ENABLED,

  BAD_DOMAIN,

  BLANK,

  CONTAINS_HTML_TAGS,

  CONTAINS_URL,

  CUSTOMER_DISABLED,

  INVALID,

  INVALID_MULTIPASS_REQUEST,

  NOT_FOUND,

  PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE,

  TAKEN,

  TOKEN_INVALID,

  TOO_LONG,

  TOO_SHORT,

  UNIDENTIFIED_CUSTOMER
}
