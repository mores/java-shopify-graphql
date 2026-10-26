package com.shopify.admin.types;

/**
 * Type of a theme file operation result.
 */
public enum OnlineStoreThemeFileResultType {
  /**
   * Operation was successful.
   */
  SUCCESS,

  /**
   * Operation encountered an error.
   */
  ERROR,

  /**
   * Operation faced a conflict with the current state of the file.
   */
  CONFLICT,

  /**
   * Operation could not be processed due to issues with input data.
   */
  UNPROCESSABLE_ENTITY,

  /**
   * Operation was malformed or invalid.
   */
  BAD_REQUEST,

  /**
   * Operation timed out.
   */
  TIMEOUT,

  /**
   * Operation file could not be found.
   */
  NOT_FOUND
}
