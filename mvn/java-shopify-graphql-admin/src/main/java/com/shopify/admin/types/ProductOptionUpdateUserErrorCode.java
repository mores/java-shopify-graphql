package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductOptionUpdateUserError`.
 */
public enum ProductOptionUpdateUserErrorCode {
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
   * Option already exists.
   */
  OPTION_ALREADY_EXISTS,

  /**
   * The option position provided is not valid.
   */
  INVALID_POSITION,

  /**
   * The name provided is not valid.
   */
  INVALID_NAME,

  /**
   * Option values count is over the allowed limit.
   */
  OPTION_VALUES_OVER_LIMIT,

  /**
   * Option value does not exist.
   */
  OPTION_VALUE_DOES_NOT_EXIST,

  /**
   * Option value already exists.
   */
  OPTION_VALUE_ALREADY_EXISTS,

  /**
   * Option value with variants linked cannot be deleted.
   */
  OPTION_VALUE_HAS_VARIANTS,

  /**
   * Deleting all option values of an option is not allowed.
   */
  CANNOT_DELETE_ALL_OPTION_VALUES_IN_OPTION,

  /**
   * An option cannot be left only with option values that are not linked to any variant.
   */
  CANNOT_LEAVE_OPTIONS_WITHOUT_VARIANTS,

  /**
   * On create, this key cannot be used.
   */
  NO_KEY_ON_CREATE,

  /**
   * A key is missing in the input.
   */
  KEY_MISSING_IN_INPUT,

  /**
   * Duplicated option value.
   */
  DUPLICATED_OPTION_VALUE,

  /**
   * Option name is too long.
   */
  OPTION_NAME_TOO_LONG,

  /**
   * Option value name is too long.
   */
  OPTION_VALUE_NAME_TOO_LONG,

  /**
   * Performing conflicting actions on an option value.
   */
  OPTION_VALUE_CONFLICTING_OPERATION,

  /**
   * The number of variants will be above the limit after this operation.
   */
  CANNOT_CREATE_VARIANTS_ABOVE_LIMIT,

  /**
   * An option cannot have both metafield linked and nonlinked option values.
   */
  CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES,

  /**
   * Invalid metafield value for linked option.
   */
  INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION,

  /**
   * Cannot link multiple options to the same metafield.
   */
  DUPLICATE_LINKED_OPTION,

  /**
   * An option linked to the provided metafield already exists.
   */
  OPTION_LINKED_METAFIELD_ALREADY_TAKEN,

  /**
   * Updating the linked_metafield of an option requires a linked_metafield_value for each option value.
   */
  LINKED_OPTION_UPDATE_MISSING_VALUES,

  /**
   * Linked options are currently not supported for this shop.
   */
  LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

  /**
   * No valid metafield definition found for linked option.
   */
  LINKED_METAFIELD_DEFINITION_NOT_FOUND,

  /**
   * At least one of the product variants has invalid SKUs.
   */
  CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU,

  /**
   * Operation is not supported for a combined listing parent product.
   */
  UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

  /**
   * Cannot update the option because it would result in deleting variants, and you don't have the required permissions.
   */
  CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION,

  /**
   * The number of option values created with the MANAGE strategy would exceed the variant limit.
   */
  TOO_MANY_VARIANTS_CREATED
}
