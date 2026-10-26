package com.shopify.admin.types;

/**
 * Legacy type information for the stored value.
 * Replaced by `type`.
 */
public enum MetafieldValueType {
  /**
   * A text field.
   */
  STRING,

  /**
   * A whole number.
   */
  INTEGER,

  /**
   * A JSON string.
   */
  JSON_STRING,

  /**
   * A `true` or `false` value.
   */
  BOOLEAN
}
