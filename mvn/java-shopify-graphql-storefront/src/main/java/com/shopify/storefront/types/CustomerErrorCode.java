package com.shopify.storefront.types;

/**
 * Possible error codes that can be returned by `CustomerUserError`.
 */
public enum CustomerErrorCode {
  BLANK,

  INVALID,

  TAKEN,

  TOO_LONG,

  TOO_SHORT,

  UNIDENTIFIED_CUSTOMER,

  CUSTOMER_DISABLED,

  PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE,

  CONTAINS_HTML_TAGS,

  CONTAINS_URL,

  TOKEN_INVALID,

  ALREADY_ENABLED,

  NOT_FOUND,

  BAD_DOMAIN,

  INVALID_MULTIPASS_REQUEST
}
