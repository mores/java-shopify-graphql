package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CollectionAddProductsV2UserError`.
 */
public enum CollectionAddProductsV2UserErrorCode {
  /**
   * Can't manually add products to a smart collection.
   */
  CANT_ADD_TO_SMART_COLLECTION,

  /**
   * Collection doesn't exist.
   */
  COLLECTION_DOES_NOT_EXIST
}
