package com.shopify.admin.types;

/**
 * The set of valid sort keys for the MetafieldDefinition query.
 */
public enum MetafieldDefinitionSortKeys {
  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `name` value.
   */
  NAME,

  /**
   * Sort by the `pinned_position` value.
   */
  PINNED_POSITION,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE
}
