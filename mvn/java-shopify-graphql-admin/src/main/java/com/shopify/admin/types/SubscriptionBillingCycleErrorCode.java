package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `SubscriptionBillingCycleUserError`.
 */
public enum SubscriptionBillingCycleErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Can't find the billing cycle.
   */
  CYCLE_NOT_FOUND,

  /**
   * There's no contract or schedule edit associated with the targeted billing cycle(s).
   */
  NO_CYCLE_EDITS,

  /**
   * The index selector is invalid.
   */
  INVALID_CYCLE_INDEX,

  /**
   * The date selector is invalid.
   */
  INVALID_DATE,

  /**
   * Billing cycle schedule edit input provided is empty. Must take in parameters to modify schedule.
   */
  EMPTY_BILLING_CYCLE_EDIT_SCHEDULE_INPUT,

  /**
   * Billing date cannot be set on skipped billing cycle.
   */
  BILLING_DATE_SET_ON_SKIPPED,

  /**
   * Billing date of a cycle cannot be set to a value outside of its billing date range.
   */
  OUT_OF_BOUNDS,

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
   * Billing cycle has incomplete billing attempts in progress.
   */
  INCOMPLETE_BILLING_ATTEMPTS
}
