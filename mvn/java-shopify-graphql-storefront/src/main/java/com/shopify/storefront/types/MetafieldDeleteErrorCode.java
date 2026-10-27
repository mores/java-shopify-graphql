package com.shopify.storefront.types;

/**
 * Possible error codes that can be returned by `MetafieldDeleteUserError`.
 */
public enum MetafieldDeleteErrorCode {
  /**
   * The owner ID is invalid.
   */
  INVALID_OWNER,

  /**
   * Metafield not found.
   */
  METAFIELD_DOES_NOT_EXIST,

  /**
   * The current app is not authorized to perform this action.
   */
  APP_NOT_AUTHORIZED
}
