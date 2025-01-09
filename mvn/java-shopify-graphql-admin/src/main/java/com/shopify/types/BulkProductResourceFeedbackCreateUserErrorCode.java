package com.shopify.types;

/**
 * Possible error codes that can be returned by `BulkProductResourceFeedbackCreateUserError`.
 */
public enum BulkProductResourceFeedbackCreateUserErrorCode {
  MAXIMUM_FEEDBACK_LIMIT_EXCEEDED,

  OUTDATED_FEEDBACK,

  PRODUCT_NOT_FOUND,

  INVALID,

  BLANK,

  PRESENT,

  LESS_THAN_OR_EQUAL_TO
}
