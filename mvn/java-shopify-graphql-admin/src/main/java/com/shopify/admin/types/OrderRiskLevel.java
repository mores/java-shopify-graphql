package com.shopify.admin.types;

/**
 * The likelihood that an order is fraudulent.
 * This enum is deprecated in favor of
 * [RiskAssessmentResult](https://shopify.dev/api/admin-graphql/latest/enums/RiskAssessmentResult)
 * which allows for more granular risk levels, including PENDING and NONE.
 */
public enum OrderRiskLevel {
  LOW,

  MEDIUM,

  HIGH
}
