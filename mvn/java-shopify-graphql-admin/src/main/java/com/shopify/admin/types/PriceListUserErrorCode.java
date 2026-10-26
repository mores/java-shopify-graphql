package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PriceListUserError`.
 */
public enum PriceListUserErrorCode {
  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The specified price list doesn't exist.
   */
  PRICE_LIST_NOT_FOUND,

  /**
   * The price list is currently being modified. Please try again later.
   */
  PRICE_LIST_LOCKED,

  /**
   * A price list’s currency must be the market currency.
   */
  CURRENCY_MARKET_MISMATCH,

  /**
   * The adjustment value must be a positive value and not be greater than 100% for
   * `type` `PERCENTAGE_DECREASE` and not be greater than 1000% for `type`
   * `PERCENTAGE_INCREASE`.
   */
  INVALID_ADJUSTMENT_VALUE,

  /**
   * The adjustment value must not be greater than 100% for `type` `PERCENTAGE_DECREASE`.
   */
  INVALID_ADJUSTMENT_MIN_VALUE,

  /**
   * The adjustment value must not be greater than 1000% for `type` `PERCENTAGE_INCREASE`.
   */
  INVALID_ADJUSTMENT_MAX_VALUE,

  /**
   * Quantity rules can be associated only with company location catalogs or catalogs associated with compatible markets.
   */
  CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES,

  /**
   * Quantity price breaks can be associated only with company location catalogs or
   * catalogs associated with compatible markets.
   */
  CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS,

  /**
   * Only one context rule option may be specified.
   */
  CONTEXT_RULE_LIMIT_ONE_OPTION,

  /**
   * The price list currency is not supported by the shop's payment gateway.
   */
  CURRENCY_NOT_SUPPORTED,

  /**
   * Cannot create price list for a primary market.
   */
  PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET,

  /**
   * The specified catalog does not exist.
   */
  CATALOG_DOES_NOT_EXIST,

  /**
   * The price list currency must match the market catalog currency.
   */
  CATALOG_MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH,

  /**
   * Catalog has a price list already assigned.
   */
  CATALOG_TAKEN,

  /**
   * A country catalog cannot be assigned to a price list.
   */
  COUNTRY_PRICE_LIST_ASSIGNMENT,

  /**
   * Something went wrong when trying to save the price list. Please try again.
   */
  GENERIC_ERROR
}
