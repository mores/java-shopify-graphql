package com.shopify.types;

/**
 * The input fields for handling if filename is already in use.
 */
public enum FileCreateInputDuplicateResolutionMode {
  APPEND_UUID,

  RAISE_ERROR,

  REPLACE
}
