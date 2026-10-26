package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ShopResourceFeedbackCreateUserError`.
 */
public enum ShopResourceFeedbackCreateUserErrorCode {
  /**
   * The feedback for a later version of the resource was already accepted.
   */
  OUTDATED_FEEDBACK,

  /**
   * The feedback date cannot be set in the future.
   */
  FEEDBACK_DATE_IN_FUTURE,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND
}
