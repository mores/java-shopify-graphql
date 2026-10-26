package com.shopify.admin.types;

/**
 * The input fields for handling if filename is already in use.
 */
public enum FileCreateInputDuplicateResolutionMode {
  /**
   * Append a UUID if filename is already in use.
   */
  APPEND_UUID,

  /**
   * Raise an error if filename is already in use.
   */
  RAISE_ERROR,

  /**
   * Replace the existing file if filename is already in use.
   */
  REPLACE
}
