package com.shopify.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionPinUserError`.
 */
public enum MetafieldDefinitionPinUserErrorCode {
  NOT_FOUND,

  PINNED_LIMIT_REACHED,

  ALREADY_PINNED,

  INTERNAL_ERROR,

  UNSUPPORTED_PINNING,

  DISALLOWED_OWNER_TYPE
}
