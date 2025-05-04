package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductVariantsBulkReorderUserError`.
 */
public enum ProductVariantsBulkReorderUserErrorCode {
  PRODUCT_DOES_NOT_EXIST,

  MISSING_VARIANT,

  INVALID_POSITION,

  DUPLICATED_VARIANT_ID,

  GENERIC_ERROR
}
