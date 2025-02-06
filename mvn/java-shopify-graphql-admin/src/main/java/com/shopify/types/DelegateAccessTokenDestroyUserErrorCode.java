package com.shopify.types;

/**
 * Possible error codes that can be returned by `DelegateAccessTokenDestroyUserError`.
 */
public enum DelegateAccessTokenDestroyUserErrorCode {
  PERSISTENCE_FAILED,

  ACCESS_TOKEN_NOT_FOUND,

  CAN_ONLY_DELETE_DELEGATE_TOKENS,

  ACCESS_DENIED
}
