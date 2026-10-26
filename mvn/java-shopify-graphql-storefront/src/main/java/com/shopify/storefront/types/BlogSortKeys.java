package com.shopify.storefront.types;

/**
 * The set of valid sort keys for the Blog query.
 */
public enum BlogSortKeys {
  /**
   * Sort by the `handle` value.
   */
  HANDLE,

  /**
   * Sort by the `title` value.
   */
  TITLE,

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
