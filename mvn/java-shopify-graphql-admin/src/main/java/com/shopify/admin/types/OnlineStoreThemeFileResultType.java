package com.shopify.admin.types;

/**
 * Type of a theme file operation result.
 */
public enum OnlineStoreThemeFileResultType {
  SUCCESS,

  ERROR,

  CONFLICT,

  UNPROCESSABLE_ENTITY,

  BAD_REQUEST,

  TIMEOUT,

  NOT_FOUND
}
