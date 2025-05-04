package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionUnpinUserError`.
 */
public enum MetafieldDefinitionUnpinUserErrorCode {
  NOT_FOUND,

  NOT_PINNED,

  INTERNAL_ERROR,

  APP_CONFIG_MANAGED,

  DISALLOWED_OWNER_TYPE
}
