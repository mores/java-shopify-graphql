package com.shopify.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionPinUserError`.
 */
public enum MetafieldDefinitionPinUserErrorCode {
  NOT_FOUND,

  PINNED_LIMIT_REACHED,

  ALREADY_PINNED,

  INTERNAL_ERROR,

  DISALLOWED_OWNER_TYPE
}
