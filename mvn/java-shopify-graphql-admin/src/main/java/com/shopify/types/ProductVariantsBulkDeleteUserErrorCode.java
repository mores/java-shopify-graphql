package com.shopify.types;

/**
 * Possible error codes that can be returned by `ProductVariantsBulkDeleteUserError`.
 */
public enum ProductVariantsBulkDeleteUserErrorCode {
  PRODUCT_DOES_NOT_EXIST,

  CANNOT_DELETE_LAST_VARIANT,

  AT_LEAST_ONE_VARIANT_DOES_NOT_BELONG_TO_THE_PRODUCT,

  UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION
}
