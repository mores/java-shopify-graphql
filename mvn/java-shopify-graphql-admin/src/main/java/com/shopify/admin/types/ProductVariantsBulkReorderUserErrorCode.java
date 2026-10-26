package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductVariantsBulkReorderUserError`.
 */
public enum ProductVariantsBulkReorderUserErrorCode {
  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Product variant does not exist.
   */
  MISSING_VARIANT,

  /**
   * Product variant position cannot be zero or negative number.
   */
  INVALID_POSITION,

  /**
   * Product variant IDs must be unique.
   */
  DUPLICATED_VARIANT_ID,

  /**
   * Something went wrong, please try again.
   */
  GENERIC_ERROR
}
