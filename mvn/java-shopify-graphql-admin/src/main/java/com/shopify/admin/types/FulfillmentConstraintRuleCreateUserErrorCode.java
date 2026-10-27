package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentConstraintRuleCreateUserError`.
 */
public enum FulfillmentConstraintRuleCreateUserErrorCode {
  /**
   * Failed to create fulfillment constraint rule due to invalid input.
   */
  INPUT_INVALID,

  /**
   * No Shopify Function found for provided function_id.
   */
  FUNCTION_NOT_FOUND,

  /**
   * A fulfillment constraint rule already exists for the provided function_id.
   */
  FUNCTION_ALREADY_REGISTERED,

  /**
   * Function does not implement the required interface for this fulfillment constraint rule.
   */
  FUNCTION_DOES_NOT_IMPLEMENT,

  /**
   * Shop must be on a Shopify Plus plan to activate functions from a custom app.
   */
  CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

  /**
   * Function is pending deletion and cannot have new rules created against it.
   */
  FUNCTION_PENDING_DELETION,

  /**
   * Only one of function_id or function_handle can be provided, not both.
   */
  MULTIPLE_FUNCTION_IDENTIFIERS,

  /**
   * Either function_id or function_handle must be provided.
   */
  MISSING_FUNCTION_IDENTIFIER,

  /**
   * Maximum number of fulfillment constraint rules reached. Limit is 10.
   */
  MAXIMUM_FULFILLMENT_CONSTRAINT_RULES_REACHED
}
