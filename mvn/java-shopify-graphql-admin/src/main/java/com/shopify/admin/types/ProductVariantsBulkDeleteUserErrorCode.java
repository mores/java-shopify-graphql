package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductVariantsBulkDeleteUserError`.
 */
public enum ProductVariantsBulkDeleteUserErrorCode {
  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Product is suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * Cannot delete default variant.
   */
  CANNOT_DELETE_LAST_VARIANT,

  /**
   * The variant does not exist.
   */
  AT_LEAST_ONE_VARIANT_DOES_NOT_BELONG_TO_THE_PRODUCT,

  /**
   * Operation is not supported for a combined listing parent product.
   */
  UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION
}
