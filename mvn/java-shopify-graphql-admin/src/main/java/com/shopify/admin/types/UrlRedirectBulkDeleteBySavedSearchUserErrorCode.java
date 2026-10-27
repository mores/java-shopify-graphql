package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `UrlRedirectBulkDeleteBySavedSearchUserError`.
 */
public enum UrlRedirectBulkDeleteBySavedSearchUserErrorCode {
  /**
   * Saved search not found.
   */
  SAVED_SEARCH_NOT_FOUND,

  /**
   * The saved search's query cannot match all entries or be empty.
   */
  INVALID_SAVED_SEARCH_QUERY
}
