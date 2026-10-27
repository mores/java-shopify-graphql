package com.shopify.admin.types;

/**
 * The set of valid sort keys for the Collection query.
 */
public enum CollectionSortKeys {
  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the `title` value.
   */
  TITLE,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT
}
