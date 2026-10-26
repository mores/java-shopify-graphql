package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CollectionDuplicateUserError`.
 */
public enum CollectionDuplicateUserErrorCode {
  /**
   * The collection was not found. Please check the collection ID and try again.
   */
  COLLECTION_NOT_FOUND,

  /**
   * The collection title must not be blank.
   */
  BLANK,

  /**
   * The collection title or URL handle is too long.
   */
  TOO_LONG,

  /**
   * The URL handle generated from the new title is already in use. Please choose a different title.
   */
  TAKEN,

  /**
   * The duplicated collection isn't valid.
   */
  INVALID,

  /**
   * The shop has reached its limit of collections with sub-collection inclusions.
   */
  TOO_MANY_SUB_COLLECTION_INCLUSION_COLLECTIONS,

  /**
   * The shop has reached its limit of collections with sub-collection exclusions.
   */
  TOO_MANY_SUB_COLLECTION_EXCLUSION_COLLECTIONS,

  /**
   * The shop has reached its limit of collection sources with conditions.
   */
  TOO_MANY_CONDITION_BACKED_SOURCES
}
