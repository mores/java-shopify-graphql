package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CatalogUserError`.
 */
public enum CatalogUserErrorCode {
  /**
   * An app catalog cannot be assigned to a price list.
   */
  APP_CATALOG_PRICE_LIST_ASSIGNMENT,

  /**
   * You've reached the maximum number of B2B catalogs allowed for your plan.
   */
  B2B_CATALOG_LIMIT_REACHED,

  /**
   * Catalog failed to save.
   */
  CATALOG_FAILED_TO_SAVE,

  /**
   * The catalog wasn't found.
   */
  CATALOG_NOT_FOUND,

  /**
   * A price list cannot be assigned to the primary market.
   */
  PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET,

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
   * The catalog can't be associated with more than one market.
   */
  CANNOT_ADD_MORE_THAN_ONE_MARKET,

  /**
   * A company location catalog outside of a supported plan can only have an archived status.
   */
  COMPANY_LOCATION_CATALOG_STATUS_PLAN,

  /**
   * Context driver already assigned to this catalog.
   */
  CONTEXT_ALREADY_ASSIGNED_TO_CATALOG,

  /**
   * Cannot save the catalog because the catalog limit for the context was reached.
   */
  CONTEXT_CATALOG_LIMIT_REACHED,

  /**
   * The company location could not be found.
   */
  COMPANY_LOCATION_NOT_FOUND,

  /**
   * The arguments `contextsToAdd` and `contextsToRemove` must match existing catalog context type.
   */
  CONTEXT_DRIVER_MISMATCH,

  /**
   * A country catalog cannot be assigned to a price list.
   */
  COUNTRY_CATALOG_PRICE_LIST_ASSIGNMENT,

  /**
   * A country price list cannot be assigned to a catalog.
   */
  COUNTRY_PRICE_LIST_ASSIGNMENT,

  /**
   * The catalog context type is invalid.
   */
  INVALID_CATALOG_CONTEXT_TYPE,

  /**
   * Catalogs and condition types are not compatible with each other.
   */
  CATALOG_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * A market catalog must have an active status.
   */
  MARKET_CATALOG_STATUS,

  /**
   * Market not found.
   */
  MARKET_NOT_FOUND,

  /**
   * The catalog's market and price list currencies do not match.
   */
  MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH,

  /**
   * Market already belongs to another catalog.
   */
  MARKET_TAKEN,

  /**
   * The managed country belongs to another catalog.
   */
  MANAGED_COUNTRY_BELONGS_TO_ANOTHER_CATALOG,

  /**
   * Must provide exactly one context type.
   */
  MUST_PROVIDE_EXACTLY_ONE_CONTEXT_TYPE,

  /**
   * Price list failed to save.
   */
  PRICE_LIST_FAILED_TO_SAVE,

  /**
   * Price list not found.
   */
  PRICE_LIST_NOT_FOUND,

  /**
   * The price list is currently being modified. Please try again later.
   */
  PRICE_LIST_LOCKED,

  /**
   * The catalog context is currently being modified. Please try again later.
   */
  CATALOG_CONTEXT_LOCKED,

  /**
   * Publication not found.
   */
  PUBLICATION_NOT_FOUND,

  /**
   * Must have `contexts_to_add` or `contexts_to_remove` argument.
   */
  REQUIRES_CONTEXTS_TO_ADD_OR_REMOVE,

  /**
   * Can't perform this action on a catalog of this type.
   */
  UNSUPPORTED_CATALOG_ACTION,

  /**
   * Cannot create a catalog for an app.
   */
  CANNOT_CREATE_APP_CATALOG,

  /**
   * Cannot modify a catalog for an app.
   */
  CANNOT_MODIFY_APP_CATALOG,

  /**
   * Cannot delete a catalog for an app.
   */
  CANNOT_DELETE_APP_CATALOG,

  /**
   * Cannot create a catalog for a market.
   */
  CANNOT_CREATE_MARKET_CATALOG,

  /**
   * Cannot modify a catalog for a market.
   */
  CANNOT_MODIFY_MARKET_CATALOG,

  /**
   * Cannot delete a catalog for a market.
   */
  CANNOT_DELETE_MARKET_CATALOG,

  /**
   * Catalogs assigned to company locations can't be set to active with your plan.
   */
  UNPERMITTED_ENTITLEMENTS_DIRECT_CATALOG_ASSIGNMENT,

  /**
   * Managing this catalog is not supported by your plan.
   */
  UNPERMITTED_ENTITLEMENTS_MARKET_CATALOGS,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * Cannot change context to specified type.
   */
  INVALID_CONTEXT_CHANGE
}
