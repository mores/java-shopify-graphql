package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FulfillmentConstraintRuleUpdateUserError`.
 */
public enum FulfillmentConstraintRuleUpdateUserErrorCode {
  /**
   * Could not find fulfillment constraint rule for provided id.
   */
  NOT_FOUND,

  /**
   * Unauthorized app scope.
   */
  UNAUTHORIZED_APP_SCOPE
}
