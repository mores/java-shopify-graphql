package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductOptionsCreateUserError`.
 */
public enum ProductOptionsCreateUserErrorCode {
  /**
   * Option already exists.
   */
  OPTION_ALREADY_EXISTS,

  /**
   * Options count is over the allowed limit.
   */
  OPTIONS_OVER_LIMIT,

  /**
   * Option values count is over the allowed limit.
   */
  OPTION_VALUES_OVER_LIMIT,

  /**
   * The name provided is not valid.
   */
  INVALID_NAME,

  /**
   * Product is suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * Cannot create new options without values for all existing variants.
   */
  NEW_OPTION_WITHOUT_VALUE_FOR_EXISTING_VARIANTS,

  /**
   * Duplicated option name.
   */
  DUPLICATED_OPTION_NAME,

  /**
   * Duplicated option value.
   */
  DUPLICATED_OPTION_VALUE,

  /**
   * Each option must have a name specified.
   */
  OPTION_NAME_MISSING,

  /**
   * Each option must have at least one option value specified.
   */
  OPTION_VALUES_MISSING,

  /**
   * Option value name is too long.
   */
  OPTION_VALUE_NAME_TOO_LONG,

  /**
   * Option name is too long.
   */
  OPTION_NAME_TOO_LONG,

  /**
   * Position must be between 1 and the maximum number of options per product.
   */
  POSITION_OUT_OF_BOUNDS,

  /**
   * If specified, position field must be present in all option inputs.
   */
  OPTION_POSITION_MISSING,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * No valid metafield definition found for linked option.
   */
  LINKED_METAFIELD_DEFINITION_NOT_FOUND,

  /**
   * Invalid metafield value for linked option.
   */
  INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION,

  /**
   * Missing metafield values for linked option.
   */
  MISSING_METAFIELD_VALUES_FOR_LINKED_OPTION,

  /**
   * Cannot combine linked metafield and option values.
   */
  CANNOT_COMBINE_LINKED_METAFIELD_AND_OPTION_VALUES,

  /**
   * Cannot link multiple options to the same metafield.
   */
  DUPLICATE_LINKED_OPTION,

  /**
   * An option linked to the provided metafield already exists.
   */
  OPTION_LINKED_METAFIELD_ALREADY_TAKEN,

  /**
   * Linked options are currently not supported for this shop.
   */
  LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

  /**
   * At least one of the product variants has invalid SKUs.
   */
  CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU,

  /**
   * Operation is not supported for a combined listing parent product.
   */
  UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

  /**
   * Cannot specify 'linkedMetafieldValue' for an option that is not linked to a metafield.
   */
  LINKED_METAFIELD_VALUE_WITHOUT_LINKED_OPTION,

  /**
   * The number of option values created with the CREATE strategy would exceed the variant limit.
   */
  TOO_MANY_VARIANTS_CREATED
}
