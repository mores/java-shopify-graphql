package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `AppRevokeAccessScopesAppRevokeScopeError`.
 */
public enum AppRevokeAccessScopesAppRevokeScopeErrorCode {
  /**
   * No app found on the access token.
   */
  MISSING_SOURCE_APP,

  /**
   * The application cannot be found.
   */
  APPLICATION_CANNOT_BE_FOUND,

  /**
   * The requested list of scopes to revoke includes invalid handles.
   */
  UNKNOWN_SCOPES,

  /**
   * Required scopes cannot be revoked.
   */
  CANNOT_REVOKE_REQUIRED_SCOPES,

  /**
   * Already granted implied scopes cannot be revoked.
   */
  CANNOT_REVOKE_IMPLIED_SCOPES,

  /**
   * Cannot revoke optional scopes that haven't been declared.
   */
  CANNOT_REVOKE_UNDECLARED_SCOPES,

  /**
   * App is not installed on shop.
   */
  APP_NOT_INSTALLED
}
