package com.shopify.admin.types;

/**
 * The set of valid sort keys for the CodeDiscount query.
 */
public enum CodeDiscountSortKeys {
  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `ends_at` value.
   */
  ENDS_AT,

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
   * Sort by the `starts_at` value.
   */
  STARTS_AT,

  /**
   * Sort by the `title` value.
   */
  TITLE,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT
}
