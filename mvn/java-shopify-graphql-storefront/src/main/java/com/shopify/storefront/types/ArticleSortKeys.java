package com.shopify.storefront.types;

/**
 * The set of valid sort keys for the Article query.
 */
public enum ArticleSortKeys {
  /**
   * Sort by the `title` value.
   */
  TITLE,

  /**
   * Sort by the `blog_title` value.
   */
  BLOG_TITLE,

  /**
   * Sort by the `author` value.
   */
  AUTHOR,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT,

  /**
   * Sort by the `published_at` value.
   */
  PUBLISHED_AT,

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
