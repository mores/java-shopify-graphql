package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `SellingPlanGroupUserError`.
 */
public enum SellingPlanGroupUserErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value should be equal to the value allowed.
   */
  EQUAL_TO,

  /**
   * The input value should be greater than the minimum allowed value.
   */
  GREATER_THAN,

  /**
   * The input value should be greater than or equal to the minimum value allowed.
   */
  GREATER_THAN_OR_EQUAL_TO,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value should be less than the maximum value allowed.
   */
  LESS_THAN,

  /**
   * The input value should be less than or equal to the maximum value allowed.
   */
  LESS_THAN_OR_EQUAL_TO,

  /**
   * The input value is not a number.
   */
  NOT_A_NUMBER,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is too big.
   */
  TOO_BIG,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value is the wrong length.
   */
  WRONG_LENGTH,

  /**
   * Exceeded the selling plan limit (31).
   */
  SELLING_PLAN_COUNT_UPPER_BOUND,

  /**
   * Must include at least one selling plan.
   */
  SELLING_PLAN_COUNT_LOWER_BOUND,

  /**
   * Selling plan's billing policy max cycles must be greater than min cycles.
   */
  SELLING_PLAN_MAX_CYCLES_MUST_BE_GREATER_THAN_MIN_CYCLES,

  /**
   * Selling plan's billing and delivery policies anchors must be equal.
   */
  SELLING_PLAN_BILLING_AND_DELIVERY_POLICY_ANCHORS_MUST_BE_EQUAL,

  /**
   * Selling plan's billing cycle must be a multiple of delivery cycle.
   */
  SELLING_PLAN_BILLING_CYCLE_MUST_BE_A_MULTIPLE_OF_DELIVERY_CYCLE,

  /**
   * Selling plan's pricing policies must contain one fixed pricing policy.
   */
  SELLING_PLAN_PRICING_POLICIES_MUST_CONTAIN_A_FIXED_PRICING_POLICY,

  /**
   * Cannot define option2 on this selling plan as there's no label on the parent selling plan group.
   */
  SELLING_PLAN_MISSING_OPTION2_LABEL_ON_PARENT_GROUP,

  /**
   * Cannot define option3 on this selling plan as there's no label on the parent selling plan group.
   */
  SELLING_PLAN_MISSING_OPTION3_LABEL_ON_PARENT_GROUP,

  /**
   * Selling plan's option2 is required because option2 exists.
   */
  SELLING_PLAN_OPTION2_REQUIRED_AS_DEFINED_ON_PARENT_GROUP,

  /**
   * Selling plan's option3 is required because option3 exists.
   */
  SELLING_PLAN_OPTION3_REQUIRED_AS_DEFINED_ON_PARENT_GROUP,

  /**
   * Selling plans can't have more than 2 pricing policies.
   */
  SELLING_PLAN_PRICING_POLICIES_LIMIT,

  /**
   * The selling plan list provided contains 1 or more invalid IDs.
   */
  RESOURCE_LIST_CONTAINS_INVALID_IDS,

  /**
   * The selling plan group list provided is empty.
   */
  RESOURCE_LIST_IS_EMPTY,

  /**
   * Product variant does not exist.
   */
  PRODUCT_VARIANT_DOES_NOT_EXIST,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Selling plan group does not exist.
   */
  GROUP_DOES_NOT_EXIST,

  /**
   * Selling plan group could not be deleted.
   */
  GROUP_COULD_NOT_BE_DELETED,

  /**
   * Could not add the resource to the selling plan group.
   */
  ERROR_ADDING_RESOURCE_TO_GROUP,

  /**
   * Missing delivery policy.
   */
  SELLING_PLAN_DELIVERY_POLICY_MISSING,

  /**
   * Missing billing policy.
   */
  SELLING_PLAN_BILLING_POLICY_MISSING,

  /**
   * Selling plan does not exist.
   */
  PLAN_DOES_NOT_EXIST,

  /**
   * Selling plan ID must be specified to update.
   */
  PLAN_ID_MUST_BE_SPECIFIED_TO_UPDATE,

  /**
   * Only one billing policy type can be defined.
   */
  ONLY_NEED_ONE_BILLING_POLICY_TYPE,

  /**
   * Only one delivery policy type can be defined.
   */
  ONLY_NEED_ONE_DELIVERY_POLICY_TYPE,

  /**
   * Only one pricing policy type can be defined.
   */
  ONLY_NEED_ONE_PRICING_POLICY_TYPE,

  /**
   * Billing and delivery policy types must be the same.
   */
  BILLING_AND_DELIVERY_POLICY_TYPES_MUST_BE_THE_SAME,

  /**
   * Only one pricing policy adjustment value type can be defined.
   */
  ONLY_NEED_ONE_PRICING_POLICY_VALUE,

  /**
   * Pricing policy's adjustment value and adjustment type must match.
   */
  PRICING_POLICY_ADJUSTMENT_VALUE_AND_TYPE_MUST_MATCH,

  /**
   * Cannot have multiple selling plans with the same name.
   */
  SELLING_PLAN_DUPLICATE_NAME,

  /**
   * Cannot have multiple selling plans with the same options.
   */
  SELLING_PLAN_DUPLICATE_OPTIONS,

  /**
   * A fixed selling plan can have at most one pricing policy.
   */
  SELLING_PLAN_FIXED_PRICING_POLICIES_LIMIT,

  /**
   * A fixed billing policy's remaining_balance_charge_exact_time can't be blank
   * when the remaining_balance_charge_trigger is EXACT_TIME.
   */
  REMAINING_BALANCE_CHARGE_EXACT_TIME_REQUIRED,

  /**
   * A fixed billing policy's checkout charge value and type must match.
   */
  CHECKOUT_CHARGE_VALUE_AND_TYPE_MUST_MATCH,

  /**
   * A fixed billing policy's checkout charge can have at most one value.
   */
  ONLY_NEED_ONE_CHECKOUT_CHARGE_VALUE,

  /**
   * A fixed billing policy's remaining_balance_charge_exact_time must not be
   * present when the remaining_balance_charge_trigger isn't EXACT_TIME.
   */
  REMAINING_BALANCE_CHARGE_EXACT_TIME_NOT_ALLOWED,

  /**
   * A fixed billing policy's remaining_balance_charge_time_after_checkout must be
   * present and greater than zero when the remaining_balance_charge_trigger is
   * TIME_AFTER_CHECKOUT.
   */
  REMAINING_BALANCE_CHARGE_TIME_AFTER_CHECKOUT_MUST_BE_GREATER_THAN_ZERO,

  /**
   * A fixed billing policy's remaining_balance_charge_trigger must be
   * NO_REMAINING_BALANCE when the checkout_charge_type is PERCENTAGE and
   * checkout_charge_value is 100.
   */
  REMAINING_BALANCE_CHARGE_TRIGGER_ON_FULL_CHECKOUT,

  /**
   * A fixed billing policy's remaining_balance_charge_trigger can't be
   * NO_REMAINING_BALANCE when the checkout_charge_type is PERCENTAGE and
   * checkout_charge_value is less than 100.
   */
  REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PARTIAL_PERCENTAGE_CHECKOUT_CHARGE,

  /**
   * A fixed billing policy's remaining_balance_charge_trigger can't be
   * NO_REMAINING_BALANCE when the checkout_charge_type is PRICE.
   */
  REMAINING_BALANCE_CHARGE_TRIGGER_NO_REMAINING_BALANCE_ON_PRICE_CHECKOUT_CHARGE,

  /**
   * A fixed billing policy's fulfillment_exact_time can't be blank when the fulfillment_trigger is EXACT_TIME.
   */
  FULFILLMENT_EXACT_TIME_REQUIRED,

  /**
   * A fixed billing policy's fulfillment_exact_time must not be present when the fulfillment_trigger isn't EXACT_TIME.
   */
  FULFILLMENT_EXACT_TIME_NOT_ALLOWED,

  /**
   * A fixed delivery policy's anchors must not be present when the fulfillment_trigger isn't ANCHOR.
   */
  SELLING_PLAN_ANCHORS_NOT_ALLOWED,

  /**
   * A fixed delivery policy's anchors must be present when the fulfillment_trigger is ANCHOR.
   */
  SELLING_PLAN_ANCHORS_REQUIRED,

  /**
   * A fixed delivery policy with an ANCHOR fulfillment_trigger must have exactly one anchor.
   */
  MUST_HAVE_EXACTLY_ONE_ANCHOR,

  /**
   * A selling plan can't have both fixed and recurring billing policies.
   */
  ONLY_ONE_OF_FIXED_OR_RECURRING_BILLING,

  /**
   * A selling plan can't have both fixed and recurring delivery policies.
   */
  ONLY_ONE_OF_FIXED_OR_RECURRING_DELIVERY,

  /**
   * Billing policy's interval is too large.
   */
  BILLING_POLICY_INTERVAL_TOO_LARGE,

  /**
   * Delivery policy's interval is too large.
   */
  DELIVERY_POLICY_INTERVAL_TOO_LARGE,

  /**
   * The input submitted is invalid.
   */
  INVALID_INPUT
}
