package com.shopify.admin.types;

/**
 * Error codes for failed bulk operations.
 */
public enum BulkOperationErrorCode {
  /**
   * The provided operation `query` returned access denied due to missing
   * [access scopes](https://shopify.dev/api/usage/access-scopes).
   * Review the requested object permissions and execute the query as a normal non-bulk GraphQL request to see more details.
   */
  ACCESS_DENIED,

  /**
   * The operation resulted in partial or incomplete data due to internal server errors during execution.
   * These errors might be intermittent, so you can try performing the same query again.
   */
  INTERNAL_SERVER_ERROR,

  /**
   * The operation resulted in partial or incomplete data due to query timeouts during execution.
   * In some cases, timeouts can be avoided by modifying your `query` to select fewer fields.
   */
  TIMEOUT
}
