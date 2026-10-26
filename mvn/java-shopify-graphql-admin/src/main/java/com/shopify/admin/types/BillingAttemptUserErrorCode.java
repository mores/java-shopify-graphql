package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `BillingAttemptUserError`.
 */
public enum BillingAttemptUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * Subscription contract does not exist.
   */
  CONTRACT_NOT_FOUND,

  /**
   * Origin time cannot be before the contract creation time.
   */
  ORIGIN_TIME_BEFORE_CONTRACT_CREATION,

  /**
   * Billing cycle selector cannot select upcoming billing cycle past limit.
   */
  UPCOMING_CYCLE_LIMIT_EXCEEDED,

  /**
   * Billing cycle selector cannot select billing cycle outside of index range.
   */
  CYCLE_INDEX_OUT_OF_RANGE,

  /**
   * Billing cycle selector cannot select billing cycle outside of start date range.
   */
  CYCLE_START_DATE_OUT_OF_RANGE,

  /**
   * Origin time needs to be within the selected billing cycle's start and end at date.
   */
  ORIGIN_TIME_OUT_OF_RANGE,

  /**
   * Billing cycle charge attempt made more than 24 hours before the billing cycle `billingAttemptExpectedDate`.
   */
  BILLING_CYCLE_CHARGE_BEFORE_EXPECTED_DATE,

  /**
   * Billing cycle must not be skipped.
   */
  BILLING_CYCLE_SKIPPED,

  /**
   * Subscription contract is under review, origin order is high risk and unfulfilled.
   */
  CONTRACT_UNDER_REVIEW,

  /**
   * Subscription contract cannot be billed once terminated.
   */
  CONTRACT_TERMINATED,

  /**
   * Subscription contract cannot be billed if paused.
   */
  CONTRACT_PAUSED,

  /**
   * Billing attempt rate limit exceeded - try later.
   */
  THROTTLED,

  /**
   * Failed to process the billing attempt.
   */
  PROCESSING_FAILED
}
