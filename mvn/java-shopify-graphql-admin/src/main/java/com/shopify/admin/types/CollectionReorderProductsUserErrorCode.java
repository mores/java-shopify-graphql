package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CollectionReorderProductsUserError`.
 */
public enum CollectionReorderProductsUserErrorCode {
  /**
   * Products are currently being reordered. Please try again later.
   */
  TOO_MANY_ATTEMPTS_TO_REORDER_PRODUCTS,

  /**
   * The collection was not found. Please check the collection ID and try again.
   */
  COLLECTION_NOT_FOUND,

  /**
   * The collection is not manually sorted. Can't reorder products unless collection is manually sorted.
   */
  MANUALLY_SORTED_COLLECTION,

  /**
   * The move is invalid.
   */
  INVALID_MOVE
}
