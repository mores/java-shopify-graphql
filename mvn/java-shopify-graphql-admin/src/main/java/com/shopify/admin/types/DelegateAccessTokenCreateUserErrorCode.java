package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DelegateAccessTokenCreateUserError`.
 */
public enum DelegateAccessTokenCreateUserErrorCode {
  /**
   * The access scope can't be empty.
   */
  EMPTY_ACCESS_SCOPE,

  /**
   * The parent access token can't be a delegate token.
   */
  DELEGATE_ACCESS_TOKEN,

  /**
   * The expires_in value must be greater than 0.
   */
  NEGATIVE_EXPIRES_IN,

  /**
   * The delegate token can't expire after the parent token.
   */
  EXPIRES_AFTER_PARENT,

  /**
   * The parent access token can't have a refresh token.
   */
  REFRESH_TOKEN,

  /**
   * Persistence failed.
   */
  PERSISTENCE_FAILED,

  /**
   * Unknown scopes.
   */
  UNKNOWN_SCOPES
}
