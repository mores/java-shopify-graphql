package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `OrderRiskAssessmentCreateUserError`.
 */
public enum OrderRiskAssessmentCreateUserErrorCode {
  TOO_MANY_FACTS,

  ORDER_ALREADY_FULFILLED,

  INVALID,

  NOT_FOUND
}
