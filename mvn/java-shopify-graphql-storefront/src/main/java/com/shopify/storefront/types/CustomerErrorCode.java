package com.shopify.storefront.types;

/**
 * Error codes returned by the [`CustomerUserError`](https://shopify.dev/docs/api/storefront/current/objects/CustomerUserError)
 * object. These codes identify specific validation and processing failures for
 * customer-related mutations, including account creation, updates, password
 * resets, and address management.
 */
public enum CustomerErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * Unidentified customer.
   */
  UNIDENTIFIED_CUSTOMER,

  /**
   * Customer is disabled.
   */
  CUSTOMER_DISABLED,

  /**
   * Input password starts or ends with whitespace.
   */
  PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE,

  /**
   * Input contains HTML tags.
   */
  CONTAINS_HTML_TAGS,

  /**
   * Input contains URL.
   */
  CONTAINS_URL,

  /**
   * Invalid activation token.
   */
  TOKEN_INVALID,

  /**
   * Customer already enabled.
   */
  ALREADY_ENABLED,

  /**
   * Address does not exist.
   */
  NOT_FOUND,

  /**
   * Input email contains an invalid domain name.
   */
  BAD_DOMAIN,

  /**
   * Multipass token is not valid.
   */
  INVALID_MULTIPASS_REQUEST
}
