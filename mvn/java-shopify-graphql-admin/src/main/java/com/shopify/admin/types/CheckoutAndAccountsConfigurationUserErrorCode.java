package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CheckoutAndAccountsConfigurationUserError`.
 */
public enum CheckoutAndAccountsConfigurationUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * Internal error. Looks like something went wrong on our end.
   */
  INTERNAL_SERVER_ERROR,

  /**
   * One or more required fields are missing in the input.
   */
  MISSING,

  /**
   * One or more requested items couldn't be found.
   */
  NOT_FOUND,

  /**
   * The request could not be completed — please try again later.
   */
  TRANSIENT
}
