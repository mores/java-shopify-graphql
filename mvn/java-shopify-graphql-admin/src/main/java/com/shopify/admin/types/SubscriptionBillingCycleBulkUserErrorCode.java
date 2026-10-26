package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `SubscriptionBillingCycleBulkUserError`.
 */
public enum SubscriptionBillingCycleBulkUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * End date can't be more than 24 hours in the future.
   */
  END_DATE_IN_THE_FUTURE,

  /**
   * The range between start date and end date shouldn't be more than 1 week.
   */
  INVALID_DATE_RANGE,

  /**
   * Start date should be before end date.
   */
  START_DATE_BEFORE_END_DATE
}
