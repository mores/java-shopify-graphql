package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `BulkOperationUserError`.
 */
public enum BulkOperationUserErrorCode {
  /**
   * A bulk operation is already in progress.
   */
  OPERATION_IN_PROGRESS,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Bulk operations limit reached. Please try again later.
   */
  LIMIT_REACHED
}
