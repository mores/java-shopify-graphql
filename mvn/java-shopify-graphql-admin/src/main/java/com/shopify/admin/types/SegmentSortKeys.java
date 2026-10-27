package com.shopify.admin.types;

/**
 * The set of valid sort keys for the Segment query.
 */
public enum SegmentSortKeys {
  /**
   * Sort by the `creation_date` value.
   */
  CREATION_DATE,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `last_edit_date` value.
   */
  LAST_EDIT_DATE,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE
}
