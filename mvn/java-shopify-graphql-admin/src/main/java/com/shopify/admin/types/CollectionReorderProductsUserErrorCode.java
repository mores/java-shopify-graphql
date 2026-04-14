package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CollectionReorderProductsUserError`.
 */
public enum CollectionReorderProductsUserErrorCode {
  TOO_MANY_ATTEMPTS_TO_REORDER_PRODUCTS,

  COLLECTION_NOT_FOUND,

  MANUALLY_SORTED_COLLECTION,

  INVALID_MOVE
}
