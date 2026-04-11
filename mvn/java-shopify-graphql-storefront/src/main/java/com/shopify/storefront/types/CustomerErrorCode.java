package com.shopify.storefront.types;

/**
 * Error codes returned by the [`CustomerUserError`](https://shopify.dev/docs/api/storefront/current/objects/CustomerUserError)
 * object. These codes identify specific validation and processing failures for
 * customer-related mutations, including account creation, updates, password
 * resets, and address management.
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
