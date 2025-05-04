package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ShopResourceFeedbackCreateUserError`.
 */
public enum ShopResourceFeedbackCreateUserErrorCode {
  OUTDATED_FEEDBACK,

  FEEDBACK_DATE_IN_FUTURE,

  INVALID,

  BLANK,

  PRESENT
}
