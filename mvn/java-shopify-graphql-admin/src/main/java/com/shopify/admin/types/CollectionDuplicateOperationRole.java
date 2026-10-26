package com.shopify.admin.types;

/**
 * The role a collection plays in a duplication operation.
 */
public enum CollectionDuplicateOperationRole {
  /**
   * Products are being duplicated from this collection.
   */
  SOURCE,

  /**
   * Products are being duplicated onto this collection.
   */
  TARGET
}
