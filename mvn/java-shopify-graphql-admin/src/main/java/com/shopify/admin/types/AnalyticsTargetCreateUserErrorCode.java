package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `AnalyticsTargetCreateUserError`.
 */
public enum AnalyticsTargetCreateUserErrorCode {
  /**
   * Shopify employees are not permitted to perform this action.
   */
  SHOPIFY_EMPLOYEE_IMPERSONATING,

  /**
   * The provided metric is not valid for analytics targets.
   */
  INVALID_METRIC,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is already taken.
   */
  TAKEN
}
