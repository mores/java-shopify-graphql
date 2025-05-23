package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductOptionUpdateUserError`.
 */
public enum ProductOptionUpdateUserErrorCode {
  PRODUCT_DOES_NOT_EXIST,

  PRODUCT_SUSPENDED,

  OPTION_DOES_NOT_EXIST,

  OPTION_ALREADY_EXISTS,

  INVALID_POSITION,

  INVALID_NAME,

  OPTION_VALUES_OVER_LIMIT,

  OPTION_VALUE_DOES_NOT_EXIST,

  OPTION_VALUE_ALREADY_EXISTS,

  OPTION_VALUE_HAS_VARIANTS,

  CANNOT_DELETE_ALL_OPTION_VALUES_IN_OPTION,

  CANNOT_LEAVE_OPTIONS_WITHOUT_VARIANTS,

  NO_KEY_ON_CREATE,

  KEY_MISSING_IN_INPUT,

  DUPLICATED_OPTION_VALUE,

  OPTION_NAME_TOO_LONG,

  OPTION_VALUE_NAME_TOO_LONG,

  OPTION_VALUE_CONFLICTING_OPERATION,

  CANNOT_CREATE_VARIANTS_ABOVE_LIMIT,

  CANNOT_COMBINE_LINKED_AND_NONLINKED_OPTION_VALUES,

  INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION,

  DUPLICATE_LINKED_OPTION,

  OPTION_LINKED_METAFIELD_ALREADY_TAKEN,

  LINKED_OPTION_UPDATE_MISSING_VALUES,

  LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

  LINKED_METAFIELD_DEFINITION_NOT_FOUND,

  CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU,

  UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

  CANNOT_DELETE_VARIANT_WITHOUT_PERMISSION,

  TOO_MANY_VARIANTS_CREATED
}
