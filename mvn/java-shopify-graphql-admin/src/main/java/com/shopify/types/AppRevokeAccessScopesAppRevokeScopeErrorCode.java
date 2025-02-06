package com.shopify.types;

/**
 * Possible error codes that can be returned by `AppRevokeAccessScopesAppRevokeScopeError`.
 */
public enum AppRevokeAccessScopesAppRevokeScopeErrorCode {
  MISSING_SOURCE_APP,

  APPLICATION_CANNOT_BE_FOUND,

  UNKNOWN_SCOPES,

  CANNOT_REVOKE_REQUIRED_SCOPES,

  CANNOT_REVOKE_IMPLIED_SCOPES,

  CANNOT_REVOKE_UNDECLARED_SCOPES,

  APP_NOT_INSTALLED
}
