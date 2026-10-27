package com.shopify.admin.types;

/**
 * The likelihood that an order is fraudulent.
 * This enum is deprecated in favor of
 * [RiskAssessmentResult](https://shopify.dev/api/admin-graphql/latest/enums/RiskAssessmentResult)
 * which allows for more granular risk levels, including PENDING and NONE.
 */
public enum OrderRiskLevel {
  /**
   * There is a low level of risk that this order is fraudulent.
   */
  LOW,

  /**
   * There is a medium level of risk that this order is fraudulent.
   */
  MEDIUM,

  /**
   * There is a high level of risk that this order is fraudulent.
   */
  HIGH
}
