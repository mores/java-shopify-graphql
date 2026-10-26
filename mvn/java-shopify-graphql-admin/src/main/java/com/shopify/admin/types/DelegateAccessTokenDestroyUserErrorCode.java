package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DelegateAccessTokenDestroyUserError`.
 */
public enum DelegateAccessTokenDestroyUserErrorCode {
  /**
   * Persistence failed.
   */
  PERSISTENCE_FAILED,

  /**
   * Access token not found.
   */
  ACCESS_TOKEN_NOT_FOUND,

  /**
   * Cannot delete parent access token.
   */
  CAN_ONLY_DELETE_DELEGATE_TOKENS,

  /**
   * Access denied.
   */
  ACCESS_DENIED
}
