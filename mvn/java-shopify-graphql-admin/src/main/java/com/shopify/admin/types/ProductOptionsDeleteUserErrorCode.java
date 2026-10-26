package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductOptionsDeleteUserError`.
 */
public enum ProductOptionsDeleteUserErrorCode {
  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Product is suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * Option does not exist.
   */
  OPTION_DOES_NOT_EXIST,

  /**
   * Options do not belong to the same product.
   */
  OPTIONS_DO_NOT_BELONG_TO_THE_SAME_PRODUCT,

  /**
   * Can't delete option with multiple values.
   */
  CANNOT_DELETE_OPTION_WITH_MULTIPLE_VALUES,

  /**
   * Cannot delete options without deleting variants.
   */
  CANNOT_USE_NON_DESTRUCTIVE_STRATEGY,

  /**
   * At least one of the product variants has invalid SKUs.
   */
  CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU,

  /**
   * Operation is not supported for a combined listing parent product.
   */
  UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

  /**
   * Cannot perform option deletion because it would result in deleting variants, and you don't have the required permissions.
   */
  CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION
}
