package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `GiftCardProductSetUserError`.
 */
public enum GiftCardProductSetUserErrorCode {
  /**
   * The id field is not allowed if identifier is provided.
   */
  ID_NOT_ALLOWED,

  /**
   * The input field corresponding to the identifier is required.
   */
  MISSING_FIELD_REQUIRED,

  /**
   * The identifier value does not match the value of the corresponding field in the input.
   */
  INPUT_MISMATCH,

  /**
   * Resource matching the identifier was not found.
   */
  NOT_FOUND,

  /**
   * The input argument `metafields` (if present) must contain the `customId` value.
   */
  METAFIELD_MISMATCH,

  /**
   * Something went wrong, please try again.
   */
  GENERIC_ERROR,

  /**
   * Metafield is not valid.
   */
  INVALID_METAFIELD,

  /**
   * Product variant is not valid.
   */
  INVALID_VARIANT,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Product is suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * Product variant does not exist.
   */
  PRODUCT_VARIANT_DOES_NOT_EXIST,

  /**
   * Option does not exist.
   */
  OPTION_DOES_NOT_EXIST,

  /**
   * Option value does not exist.
   */
  OPTION_VALUE_DOES_NOT_EXIST,

  /**
   * Options over limit.
   */
  OPTIONS_OVER_LIMIT,

  /**
   * Option values over limit.
   */
  OPTION_VALUES_OVER_LIMIT,

  /**
   * Each option must have at least one option value specified.
   */
  OPTION_VALUES_MISSING,

  /**
   * Duplicated option name.
   */
  DUPLICATED_OPTION_NAME,

  /**
   * Duplicated option value.
   */
  DUPLICATED_OPTION_VALUE,

  /**
   * Number of product variants exceeds shop limit.
   */
  VARIANTS_OVER_LIMIT,

  /**
   * Must specify product options when updating variants.
   */
  PRODUCT_OPTIONS_INPUT_MISSING,

  /**
   * Must specify variants when updating options.
   */
  VARIANTS_INPUT_MISSING,

  /**
   * Gift card products can only be created after they have been activated.
   */
  GIFT_CARDS_NOT_ACTIVATED,

  /**
   * The product gift_card attribute cannot be changed after creation.
   */
  GIFT_CARD_ATTRIBUTE_CANNOT_BE_CHANGED,

  /**
   * Product is not valid.
   */
  INVALID_PRODUCT,

  /**
   * Input is not valid.
   */
  INVALID_INPUT,

  /**
   * Error processing request in the background job.
   */
  JOB_ERROR,

  /**
   * The metafield violates a capability restriction.
   */
  CAPABILITY_VIOLATION,

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
   * Duplicated metafield value for linked option.
   */
  DUPLICATED_METAFIELD_VALUE,

  /**
   * Linked options are currently not supported for this shop.
   */
  LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

  /**
   * No valid metafield definition found for linked option.
   */
  LINKED_METAFIELD_DEFINITION_NOT_FOUND,

  /**
   * Duplicated value.
   */
  DUPLICATED_VALUE,

  /**
   * Handle already in use. Please provide a new handle.
   */
  HANDLE_NOT_UNIQUE,

  /**
   * Cannot provide both 'barcode' and 'barcodes' for the same variant.
   */
  INCOMPATIBLE_BARCODE_FIELDS,

  /**
   * Barcode value cannot be blank.
   */
  BLANK_BARCODE_VALUE,

  /**
   * Can only specify a maximum of 20 barcodes per variant.
   */
  TOO_MANY_BARCODES,

  /**
   * Barcode value is too long.
   */
  BARCODE_VALUE_TOO_LONG,

  /**
   * Duplicate barcode value within the same variant.
   */
  DUPLICATE_BARCODE_VALUE,

  /**
   * Barcode type is not supported. Allowed barcode types are: upc, ean, isbn, gtin, asin, ns-pid.
   */
  INVALID_BARCODE_TYPE,

  /**
   * Barcode value contains invalid spaces or hyphens for its type.
   */
  INVALID_BARCODE_SEPARATORS,

  /**
   * Barcode value has an invalid length for its type.
   */
  INVALID_BARCODE_LENGTH,

  /**
   * Barcode value has an invalid prefix for its type.
   */
  INVALID_BARCODE_PREFIX,

  /**
   * Barcode value contains invalid characters for its type.
   */
  INVALID_BARCODE_CHARACTERS,

  /**
   * Barcode checksum validation failed.
   */
  BARCODE_CHECKSUM_VALIDATION_FAILED,

  /**
   * The specified product is not a gift card. The giftCardProductSet mutation can only be used with gift card products.
   */
  PRODUCT_MUST_BE_GIFT_CARD
}
