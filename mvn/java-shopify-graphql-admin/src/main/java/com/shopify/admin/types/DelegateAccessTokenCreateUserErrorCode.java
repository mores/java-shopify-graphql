package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DelegateAccessTokenCreateUserError`.
 */
public enum DelegateAccessTokenCreateUserErrorCode {
  EMPTY_ACCESS_SCOPE,

  DELEGATE_ACCESS_TOKEN,

  NEGATIVE_EXPIRES_IN,

  EXPIRES_AFTER_PARENT,

  REFRESH_TOKEN,

  PERSISTENCE_FAILED,

  UNKNOWN_SCOPES
}
