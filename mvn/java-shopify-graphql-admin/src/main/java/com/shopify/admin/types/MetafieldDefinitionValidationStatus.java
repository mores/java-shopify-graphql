package com.shopify.admin.types;

/**
 * Possible metafield definition validation statuses.
 */
public enum MetafieldDefinitionValidationStatus {
  /**
   * All of this definition's metafields are valid.
   */
  ALL_VALID,

  /**
   * Asynchronous validation of this definition's metafields is in progress.
   */
  IN_PROGRESS,

  /**
   * Some of this definition's metafields are invalid.
   */
  SOME_INVALID
}
