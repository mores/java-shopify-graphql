package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `AnalyticsTargetsDeleteUserError`.
 */
public enum AnalyticsTargetsDeleteUserErrorCode {
  /**
   * The analytics target was not found.
   */
  NOT_FOUND,

  /**
   * Shopify employees are not permitted to perform this action.
   */
  SHOPIFY_EMPLOYEE_IMPERSONATING,

  /**
   * The input value is invalid.
   */
  INVALID
}
