package com.shopify.storefront.types;

/**
 * Error codes returned by [`CartUserError`](https://shopify.dev/docs/api/storefront/current/objects/CartUserError)
 * during cart mutations. Covers validation failures for addresses, quantities,
 * delivery options, merchandise lines, discount codes, and metafields.
 */
public enum CartErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value should be less than the maximum value allowed.
   */
  LESS_THAN,

  /**
   * Merchandise line was not found in cart.
   */
  INVALID_MERCHANDISE_LINE,

  /**
   * Item cannot be purchased as configured.
   */
  MERCHANDISE_NOT_APPLICABLE,

  /**
   * An error occurred while processing cart transformations.
   */
  MERCHANDISE_LINE_TRANSFORMERS_RUN_ERROR,

  /**
   * Missing discount code.
   */
  MISSING_DISCOUNT_CODE,

  /**
   * Missing note.
   */
  MISSING_NOTE,

  /**
   * The note length must be below the specified maximum.
   */
  NOTE_TOO_LONG,

  /**
   * Delivery group was not found in cart.
   */
  INVALID_DELIVERY_GROUP,

  /**
   * Delivery option was not valid.
   */
  INVALID_DELIVERY_OPTION,

  /**
   * The delivery group is in a pending state.
   */
  PENDING_DELIVERY_GROUPS,

  /**
   * The payment wasn't valid.
   */
  INVALID_PAYMENT,

  /**
   * The payment method is not supported.
   */
  PAYMENT_METHOD_NOT_SUPPORTED,

  /**
   * The payment method is not applicable.
   */
  PAYMENT_METHOD_NOT_APPLICABLE,

  /**
   * The payment is invalid. Deferred payment is required.
   */
  INVALID_PAYMENT_DEFERRED_PAYMENT_REQUIRED,

  /**
   * Cannot update payment on an empty cart
   */
  INVALID_PAYMENT_EMPTY_CART,

  /**
   * Validation failed.
   */
  VALIDATION_CUSTOM,

  /**
   * The metafields were not valid.
   */
  INVALID_METAFIELDS,

  /**
   * The customer access token is required when setting a company location.
   */
  MISSING_CUSTOMER_ACCESS_TOKEN,

  /**
   * Company location not found or not allowed.
   */
  INVALID_COMPANY_LOCATION,

  /**
   * The quantity must be a multiple of the specified increment.
   */
  INVALID_INCREMENT,

  /**
   * The quantity must be above the specified minimum for the item.
   */
  MINIMUM_NOT_MET,

  /**
   * The quantity must be below the specified maximum for the item.
   */
  MAXIMUM_EXCEEDED,

  /**
   * Too many delivery addresses on Cart.
   */
  TOO_MANY_DELIVERY_ADDRESSES,

  /**
   * Only one delivery address can be selected.
   */
  ONLY_ONE_DELIVERY_ADDRESS_CAN_BE_SELECTED,

  /**
   * The delivery address was not found.
   */
  INVALID_DELIVERY_ADDRESS_ID,

  /**
   * Buyer cannot purchase for company location.
   */
  BUYER_CANNOT_PURCHASE_FOR_COMPANY_LOCATION,

  /**
   * Bundles and addons cannot be mixed.
   */
  BUNDLES_AND_ADDONS_CANNOT_BE_MIXED,

  /**
   * Cannot reference existing parent lines by variant_id.
   */
  PARENT_LINE_INVALID_REFERENCE,

  /**
   * Parent line not found.
   */
  PARENT_LINE_NOT_FOUND,

  /**
   * Parent line nesting is too deep or circular.
   */
  PARENT_LINE_NESTING_TOO_DEEP,

  /**
   * Nested cartlines are blocked due to an incompatibility.
   */
  PARENT_LINE_OPERATION_BLOCKED,

  /**
   * The specified gift card recipient is invalid.
   */
  GIFT_CARD_RECIPIENT_INVALID,

  /**
   * The specified address field is required.
   */
  ADDRESS_FIELD_IS_REQUIRED,

  /**
   * The specified address field is too long.
   */
  ADDRESS_FIELD_IS_TOO_LONG,

  /**
   * The specified address field contains emojis.
   */
  ADDRESS_FIELD_CONTAINS_EMOJIS,

  /**
   * The specified address field contains HTML tags.
   */
  ADDRESS_FIELD_CONTAINS_HTML_TAGS,

  /**
   * The specified address field contains a URL.
   */
  ADDRESS_FIELD_CONTAINS_URL,

  /**
   * The specified address field does not match the expected pattern.
   */
  ADDRESS_FIELD_DOES_NOT_MATCH_EXPECTED_PATTERN,

  /**
   * The given zip code is invalid for the provided province.
   */
  INVALID_ZIP_CODE_FOR_PROVINCE,

  /**
   * The given zip code is invalid for the provided country.
   */
  INVALID_ZIP_CODE_FOR_COUNTRY,

  /**
   * The given zip code is unsupported.
   */
  ZIP_CODE_NOT_SUPPORTED,

  /**
   * The given province cannot be found.
   */
  PROVINCE_NOT_FOUND,

  /**
   * A general error occurred during address validation.
   */
  UNSPECIFIED_ADDRESS_ERROR,

  /**
   * Credit card has expired.
   */
  PAYMENTS_CREDIT_CARD_BASE_EXPIRED,

  /**
   * Credit card gateway is not supported.
   */
  PAYMENTS_CREDIT_CARD_BASE_GATEWAY_NOT_SUPPORTED,

  /**
   * Credit card error.
   */
  PAYMENTS_CREDIT_CARD_GENERIC,

  /**
   * Credit card month is invalid.
   */
  PAYMENTS_CREDIT_CARD_MONTH_INCLUSION,

  /**
   * Credit card number is invalid.
   */
  PAYMENTS_CREDIT_CARD_NUMBER_INVALID,

  /**
   * Credit card number format is invalid.
   */
  PAYMENTS_CREDIT_CARD_NUMBER_INVALID_FORMAT,

  /**
   * Credit card verification value is blank.
   */
  PAYMENTS_CREDIT_CARD_VERIFICATION_VALUE_BLANK,

  /**
   * Credit card verification value is invalid for card type.
   */
  PAYMENTS_CREDIT_CARD_VERIFICATION_VALUE_INVALID_FOR_CARD_TYPE,

  /**
   * Credit card has expired.
   */
  PAYMENTS_CREDIT_CARD_YEAR_EXPIRED,

  /**
   * Credit card expiry year is invalid.
   */
  PAYMENTS_CREDIT_CARD_YEAR_INVALID_EXPIRY_YEAR,

  /**
   * Variant can only be purchased with a selling plan.
   */
  VARIANT_REQUIRES_SELLING_PLAN,

  /**
   * Selling plan is not applicable.
   */
  SELLING_PLAN_NOT_APPLICABLE,

  /**
   * An error occurred while saving the cart.
   */
  SERVICE_UNAVAILABLE,

  /**
   * The cart is too large to save.
   */
  CART_TOO_LARGE
}
