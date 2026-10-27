package com.shopify.admin.types;

/**
 * The set of valid sort keys for the File query.
 */
public enum FileSortKeys {
  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `filename` value.
   */
  FILENAME,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `original_upload_size` value.
   */
  ORIGINAL_UPLOAD_SIZE,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT
}
