package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `BulkProductResourceFeedbackCreateUserError`.
 */
public enum BulkProductResourceFeedbackCreateUserErrorCode {
  /**
   * The operation was attempted on too many feedback objects. The maximum number
   * of feedback objects that you can operate on is 50.
   */
  MAXIMUM_FEEDBACK_LIMIT_EXCEEDED,

  /**
   * The feedback for a later version of this resource was already accepted.
   */
  OUTDATED_FEEDBACK,

  /**
   * The product wasn't found or isn't available to the channel.
   */
  PRODUCT_NOT_FOUND,

  /**
   * The channel was not found or does not belong to this app.
   */
  NOT_FOUND,

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
   * The input value should be less than or equal to the maximum value allowed.
   */
  LESS_THAN_OR_EQUAL_TO
}
