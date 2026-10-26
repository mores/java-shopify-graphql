package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductOptionsReorderUserError`.
 */
public enum ProductOptionsReorderUserErrorCode {
  /**
   * Option name does not exist.
   */
  OPTION_NAME_DOES_NOT_EXIST,

  /**
   * Option value does not exist.
   */
  OPTION_VALUE_DOES_NOT_EXIST,

  /**
   * Option id does not exist.
   */
  OPTION_ID_DOES_NOT_EXIST,

  /**
   * Option value id does not exist.
   */
  OPTION_VALUE_ID_DOES_NOT_EXIST,

  /**
   * Duplicated option name.
   */
  DUPLICATED_OPTION_NAME,

  /**
   * Duplicated option value.
   */
  DUPLICATED_OPTION_VALUE,

  /**
   * Missing option name.
   */
  MISSING_OPTION_NAME,

  /**
   * Missing option value.
   */
  MISSING_OPTION_VALUE,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Product is suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * On reorder, this key cannot be used.
   */
  NO_KEY_ON_REORDER,

  /**
   * Cannot specify different options or option values using mixed id and name reference key.
   */
  MIXING_ID_AND_NAME_KEYS_IS_NOT_ALLOWED,

  /**
   * At least one of the product variants has invalid SKUs.
   */
  CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU
}
