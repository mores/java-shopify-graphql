package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CombinedListingUpdateUserError`.
 */
public enum CombinedListingUpdateUserErrorCode {
  /**
   * Unable to add duplicated products.
   */
  CANNOT_HAVE_DUPLICATED_PRODUCTS,

  /**
   * Unable to add a product that is a parent.
   */
  CANNOT_HAVE_PARENT_AS_CHILD,

  /**
   * Option values cannot be repeated.
   */
  CANNOT_HAVE_REPEATED_OPTION_VALUES,

  /**
   * Unable to add products with repeated options.
   */
  CANNOT_HAVE_REPEATED_OPTIONS,

  /**
   * Unable to add options values that are already in use.
   */
  CANT_ADD_OPTIONS_VALUES_IF_ALREADY_EXISTS,

  /**
   * Combined listings feature is not enabled.
   */
  COMBINED_LISTINGS_NOT_ENABLED,

  /**
   * Cannot perform edit and remove on same products.
   */
  EDIT_AND_REMOVE_ON_SAME_PRODUCTS,

  /**
   * Unable to add products.
   */
  FAILED_TO_ADD_PRODUCTS,

  /**
   * Unable to remove products.
   */
  FAILED_TO_REMOVE_PRODUCTS,

  /**
   * Unable to update products.
   */
  FAILED_TO_UPDATE_PRODUCTS,

  /**
   * An option linked to a metafield cannot be linked to a different metafield.
   */
  LINKED_METAFIELD_CANNOT_BE_CHANGED,

  /**
   * Linked metafield value missing from `optionsAndValues` field.
   */
  LINKED_METAFIELD_VALUE_MISSING,

  /**
   * The same metafield cannot be linked to multiple options.
   */
  LINKED_METAFIELDS_CANNOT_BE_REPEATED,

  /**
   * Linked options are currently not supported for this shop.
   */
  LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

  /**
   * The optionsAndValues field is required for this operation.
   */
  MISSING_OPTION_VALUES,

  /**
   * Selected option values cannot be empty.
   */
  MUST_HAVE_SELECTED_OPTION_VALUES,

  /**
   * Unable to add products with blank option names.
   */
  OPTION_NAME_CANNOT_BE_BLANK,

  /**
   * Option name contains invalid characters.
   */
  OPTION_NAME_CONTAINS_INVALID_CHARACTERS,

  /**
   * Option does not exist.
   */
  OPTION_NOT_FOUND,

  /**
   * All child products must include the same options.
   */
  OPTIONS_MUST_BE_EQUAL_TO_THE_OTHER_COMPONENTS,

  /**
   * Unable to update options with blank option values.
   */
  OPTION_VALUES_CANNOT_BE_BLANK,

  /**
   * Unable to update options with no option values.
   */
  OPTION_VALUES_CANNOT_BE_EMPTY,

  /**
   * The options_and_values field must contain all option values used in the combined listing.
   */
  OPTION_VALUES_MUST_BE_COMPLETE,

  /**
   * Parent product cannot be a combined listing child.
   */
  PARENT_PRODUCT_CANNOT_BE_COMBINED_LISTING_CHILD,

  /**
   * Unable to update components for a product that isn't a combined listing.
   */
  PARENT_PRODUCT_MUST_BE_A_COMBINED_LISTING,

  /**
   * The combined listing parent product must have a product category to use linked metafield options.
   */
  PARENT_PRODUCT_MUST_HAVE_CATEGORY,

  /**
   * Parent product not found.
   */
  PARENT_PRODUCT_NOT_FOUND,

  /**
   * Unable to add a product that is already a child.
   */
  PRODUCT_IS_ALREADY_A_CHILD,

  /**
   * Failed to remove mebmership due to invalid input.
   */
  PRODUCT_MEMBERSHIP_NOT_FOUND,

  /**
   * Unable to add products that do not exist.
   */
  PRODUCT_NOT_FOUND,

  /**
   * The title cannot be longer than 255 characters.
   */
  TITLE_TOO_LONG,

  /**
   * You have reached the maximum number of variants across all products for an individual combined listing.
   */
  TOO_MANY_VARIANTS,

  /**
   * You have reached the maximum number of products that can be added to an individual combined listing.
   */
  TOO_MANY_PRODUCTS,

  /**
   * An unexpected error occurred.
   */
  UNEXPECTED_ERROR
}
