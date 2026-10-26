package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductVariantsBulkUpdateUserError`.
 */
public enum ProductVariantsBulkUpdateUserErrorCode {
  /**
   * Input is invalid.
   */
  INVALID_INPUT,

  /**
   * Mutually exclusive input fields provided.
   */
  CANNOT_SPECIFY_BOTH,

  /**
   * Mandatory field input field missing.
   */
  MUST_SPECIFY_ONE_OF_PAIR,

  /**
   * Option value name is too long.
   */
  OPTION_VALUE_NAME_TOO_LONG,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Product variant is missing ID attribute.
   */
  PRODUCT_VARIANT_ID_MISSING,

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
   * Input must be for this product.
   */
  MUST_BE_FOR_THIS_PRODUCT,

  /**
   * Input is not defined for this shop.
   */
  NOT_DEFINED_FOR_SHOP,

  /**
   * Product is suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * Inventory quantities can only be provided during create. To update inventory
   * for existing variants, use inventoryAdjustQuantities.
   */
  NO_INVENTORY_QUANTITIES_ON_VARIANTS_UPDATE,

  /**
   * The variant already exists.
   */
  VARIANT_ALREADY_EXISTS,

  /**
   * The price of the variant must be greater than or equal to zero.
   */
  GREATER_THAN_OR_EQUAL_TO,

  /**
   * Variant options are not enough.
   */
  NEED_TO_ADD_OPTION_VALUES,

  /**
   * Variant options are more than the product options.
   */
  OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS,

  /**
   * You reached the limit of available SKUs in your current plan.
   */
  SUBSCRIPTION_VIOLATION,

  /**
   * Inventory quantities cannot be provided during update.
   */
  NO_INVENTORY_QUANTITES_DURING_UPDATE,

  /**
   * Price cannot take a negative value.
   */
  NEGATIVE_PRICE_VALUE,

  /**
   * Price must be 0 for variants of products with a gift card issuance currency.
   */
  LOCAL_CURRENCY_GIFT_CARD_PRICE_MUST_BE_ZERO,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * Metafield value is invalid.
   */
  INVALID_VALUE,

  /**
   * Cannot set name for an option value linked to a metafield.
   */
  CANNOT_SET_NAME_FOR_LINKED_OPTION_VALUE,

  /**
   * Operation is not supported for a combined listing parent product.
   */
  UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

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
