package com.shopify.storefront.types;

/**
 * The set of valid sort keys for the search query.
 */
public enum SearchSortKeys {
  /**
   * Sort by the `price` value.
   */
  PRICE,

  /**
   * Sort by relevance to the search terms.
   */
  RELEVANCE
}
