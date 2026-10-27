package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionUnpinUserError`.
 */
public enum MetafieldDefinitionUnpinUserErrorCode {
  /**
   * The metafield definition was not found.
   */
  NOT_FOUND,

  /**
   * The metafield definition isn't pinned.
   */
  NOT_PINNED,

  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR,

  /**
   * Definition is managed by app configuration and cannot be modified through the API.
   */
  APP_CONFIG_MANAGED,

  /**
   * Owner type can't be used in this mutation.
   */
  DISALLOWED_OWNER_TYPE
}
