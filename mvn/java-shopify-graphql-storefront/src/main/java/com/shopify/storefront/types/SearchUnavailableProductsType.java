package com.shopify.storefront.types;

/**
 * Specifies whether to display results for unavailable products.
 */
public enum SearchUnavailableProductsType {
  /**
   * Show unavailable products in the order that they're found.
   */
  SHOW,

  /**
   * Exclude unavailable products.
   */
  HIDE,

  /**
   * Show unavailable products after all other matching results. This is the default.
   */
  LAST
}
