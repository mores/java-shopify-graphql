package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionPinUserError`.
 */
public enum MetafieldDefinitionPinUserErrorCode {
  /**
   * The metafield definition was not found.
   */
  NOT_FOUND,

  /**
   * The pinned limit has been reached for owner type.
   */
  PINNED_LIMIT_REACHED,

  /**
   * The metafield definition is already pinned.
   */
  ALREADY_PINNED,

  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR,

  /**
   * The metafield definition does not support pinning.
   */
  UNSUPPORTED_PINNING,

  /**
   * Owner type can't be used in this mutation.
   */
  DISALLOWED_OWNER_TYPE
}
