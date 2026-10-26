package com.shopify.admin.types;

/**
 * The associated catalog's type.
 */
public enum CatalogType {
  /**
   * Not associated to a catalog.
   */
  NONE,

  /**
   * Catalogs belonging to apps.
   */
  APP,

  /**
   * Catalogs belonging to company locations.
   */
  COMPANY_LOCATION,

  /**
   * Catalogs belonging to markets.
   */
  MARKET
}
