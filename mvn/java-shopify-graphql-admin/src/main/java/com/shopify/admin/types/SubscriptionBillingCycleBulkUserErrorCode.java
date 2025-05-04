package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `SubscriptionBillingCycleBulkUserError`.
 */
public enum SubscriptionBillingCycleBulkUserErrorCode {
  INVALID,

  BLANK,

  END_DATE_IN_THE_FUTURE,

  INVALID_DATE_RANGE,

  START_DATE_BEFORE_END_DATE
}
