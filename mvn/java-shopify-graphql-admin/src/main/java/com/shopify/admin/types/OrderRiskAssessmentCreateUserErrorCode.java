package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `OrderRiskAssessmentCreateUserError`.
 */
public enum OrderRiskAssessmentCreateUserErrorCode {
  /**
   * More than 20 facts were provided for the order risk assessment.
   */
  TOO_MANY_FACTS,

  /**
   * The order is marked as fulfilled and can no longer accept new order risk assessments.
   */
  ORDER_ALREADY_FULFILLED,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND
}
