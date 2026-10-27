package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductVariantsBulkCreateUserError`.
 */
public enum ProductVariantsBulkCreateUserErrorCode {
  /**
   * Input is invalid.
   */
  INVALID_INPUT,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * On create, this key cannot be used.
   */
  NO_KEY_ON_CREATE,

  /**
   * Variant already exists.
   */
  VARIANT_ALREADY_EXISTS,

  /**
   * Product is suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * Variant price must be greater than or equal to zero.
   */
  GREATER_THAN_OR_EQUAL_TO,

  /**
   * Price must be 0 for variants of products with a gift card issuance currency.
   */
  LOCAL_CURRENCY_GIFT_CARD_PRICE_MUST_BE_ZERO,

  /**
   * Variant options are not enough.
   */
  NEED_TO_ADD_OPTION_VALUES,

  /**
   * Variant options are more than the product options.
   */
  OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS,

  /**
   * Inventory locations cannot exceed the allowed resource limit or 10.
   */
  TOO_MANY_INVENTORY_LOCATIONS,

  /**
   * You reached the limit of available SKUs in your current plan.
   */
  SUBSCRIPTION_VIOLATION,

  /**
   * Variant options already exist. Please change the variant option(s).
   */
  VARIANT_ALREADY_EXISTS_CHANGE_OPTION_VALUE,

  /**
   * Quantity could not be set. The location was not found.
   */
  TRACKED_VARIANT_LOCATION_NOT_FOUND,

  /**
   * Input must be for this product.
   */
  MUST_BE_FOR_THIS_PRODUCT,

  /**
   * Input is not defined for this shop.
   */
  NOT_DEFINED_FOR_SHOP,

  /**
   * Invalid input detected.
   */
  INVALID,

  /**
   * Price cannot take a negative value.
   */
  NEGATIVE_PRICE_VALUE,

  /**
   * Operation is not supported for a combined listing parent product.
   */
  UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

  /**
   * Cannot set name for an option value linked to a metafield.
   */
  CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE,

  /**
   * Inventory quantity input exceeds the limit of 50000. Consider using separate `inventorySetQuantities` mutations.
   */
  INVENTORY_QUANTITIES_LIMIT_EXCEEDED,

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
  BARCODE_CHECKSUM_VALIDATION_FAILED
}
