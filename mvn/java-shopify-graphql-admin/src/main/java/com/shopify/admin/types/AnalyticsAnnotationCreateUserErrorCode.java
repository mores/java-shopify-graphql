package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `AnalyticsAnnotationCreateUserError`.
 */
public enum AnalyticsAnnotationCreateUserErrorCode {
  /**
   * The maximum number of annotations that an app can have for a shop has been reached.
   */
  LIMIT_REACHED,

  /**
   * Shopify employees are not permitted to perform this action.
   */
  SHOPIFY_EMPLOYEE_IMPERSONATING,

  /**
   * The input value is invalid.
   */
  INVALID
}
