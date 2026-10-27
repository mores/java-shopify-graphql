package com.shopify.admin.types;

/**
 * The set of valid sort keys for the UrlRedirect query.
 */
public enum UrlRedirectSortKeys {
  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `path` value.
   */
  PATH,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE
}
