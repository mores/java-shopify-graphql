package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductChangeStatusUserError`.
 */
public enum ProductChangeStatusUserErrorCode {
  /**
   * Product could not be found.
   */
  PRODUCT_NOT_FOUND,

  /**
   * Cannot be unarchived because combined listings are not compatible with this store.
   */
  COMBINED_LISTINGS_NOT_COMPATIBLE_WITH_SHOP
}
