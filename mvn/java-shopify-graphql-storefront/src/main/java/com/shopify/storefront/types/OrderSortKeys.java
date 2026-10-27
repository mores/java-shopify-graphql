package com.shopify.storefront.types;

/**
 * The set of valid sort keys for the Order query.
 */
public enum OrderSortKeys {
  /**
   * Sort by the `processed_at` value.
   */
  PROCESSED_AT,

  /**
   * Sort by the `total_price` value.
   */
  TOTAL_PRICE,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE
}
