package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `SubscriptionDraftUserError`.
 */
public enum SubscriptionDraftErrorCode {
  /**
   * This line has already been removed.
   */
  ALREADY_REMOVED,

  /**
   * Input value is not present.
   */
  PRESENCE,

  /**
   * Subscription draft has been already committed.
   */
  COMMITTED,

  /**
   * Value is not in range.
   */
  NOT_IN_RANGE,

  /**
   * The value is not an integer.
   */
  NOT_AN_INTEGER,

  /**
   * The maximum number of cycles must be greater than the minimum.
   */
  SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES,

  /**
   * The delivery policy interval must be a multiple of the billing policy interval.
   */
  DELIVERY_MUST_BE_MULTIPLE_OF_BILLING,

  /**
   * Next billing date is invalid.
   */
  INVALID_BILLING_DATE,

  /**
   * Note length is too long.
   */
  INVALID_NOTE_LENGTH,

  /**
   * Must have at least one line.
   */
  INVALID_LINES,

  /**
   * Discount must have at least one entitled line.
   */
  NO_ENTITLED_LINES,

  /**
   * The customer doesn't exist.
   */
  CUSTOMER_DOES_NOT_EXIST,

  /**
   * The payment method customer must be the same as the contract customer.
   */
  CUSTOMER_MISMATCH,

  /**
   * The delivery method can't be blank if any lines require shipping.
   */
  DELIVERY_METHOD_REQUIRED,

  /**
   * The local delivery options must be set for local delivery.
   */
  MISSING_LOCAL_DELIVERY_OPTIONS,

  /**
   * The after cycle attribute must be unique between cycle discounts.
   */
  CYCLE_DISCOUNTS_UNIQUE_AFTER_CYCLE,

  /**
   * The adjustment value must the same type as the adjustment type.
   */
  INVALID_ADJUSTMENT_TYPE,

  /**
   * The adjustment value must be either fixed_value or percentage.
   */
  INVALID_ADJUSTMENT_VALUE,

  /**
   * Another operation updated the contract concurrently as the commit was in progress.
   */
  STALE_CONTRACT,

  /**
   * The contract draft has too many lines.
   */
  TOO_MANY_LINES,

  /**
   * The contract draft has too many discounts.
   */
  TOO_MANY_DISCOUNTS,

  /**
   * Currency is not enabled.
   */
  CURRENCY_NOT_ENABLED,

  /**
   * Cannot update a subscription contract with a current or upcoming billing cycle contract edit.
   */
  HAS_FUTURE_EDITS,

  /**
   * Cannot commit a billing cycle contract draft with this mutation. Please use SubscriptionBillingCycleContractDraftCommit.
   */
  BILLING_CYCLE_PRESENT,

  /**
   * Cannot commit a contract draft with this mutation. Please use SubscriptionDraftCommit.
   */
  BILLING_CYCLE_ABSENT,

  /**
   * Delivery policy cannot be updated for billing cycle contract drafts.
   */
  BILLING_CYCLE_CONTRACT_DRAFT_DELIVERY_POLICY_INVALID,

  /**
   * Billing policy cannot be updated for billing cycle contract drafts.
   */
  BILLING_CYCLE_CONTRACT_DRAFT_BILLING_POLICY_INVALID,

  /**
   * Contract draft must be a billing cycle contract draft for contract concatenation.
   */
  CONCATENATION_BILLING_CYCLE_CONTRACT_DRAFT_REQUIRED,

  /**
   * Cannot concatenate a contract draft from subscriptionContractCreate mutation.
   */
  CONCATENATION_UNCOMMITTED_CONTRACT_DRAFT,

  /**
   * Concatenated contracts cannot contain duplicate subscription contracts.
   */
  DUPLICATE_CONCATENATED_CONTRACTS,

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
   * Billing cycle selector requires exactly one of index or date to be provided.
   */
  CYCLE_SELECTOR_VALIDATE_ONE_OF,

  /**
   * Maximum number of concatenated contracts on a billing cycle contract draft exceeded.
   */
  EXCEEDED_MAX_CONCATENATED_CONTRACTS,

  /**
   * Customer is scheduled for redaction or has been redacted.
   */
  CUSTOMER_REDACTED,

  /**
   * Customer payment method is required.
   */
  MISSING_CUSTOMER_PAYMENT_METHOD,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value should be greater than the minimum allowed value.
   */
  GREATER_THAN,

  /**
   * The input value should be greater than or equal to the minimum value allowed.
   */
  GREATER_THAN_OR_EQUAL_TO,

  /**
   * The input value should be less than the maximum value allowed.
   */
  LESS_THAN,

  /**
   * The input value should be less than or equal to the maximum value allowed.
   */
  LESS_THAN_OR_EQUAL_TO,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT
}
