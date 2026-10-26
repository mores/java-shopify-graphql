package com.shopify.admin.types;

/**
 * Possible risk levels for an order risk assessment.
 */
public enum RiskAssessmentResult {
  /**
   * Indicates a high likelihood that the order is fraudulent.
   */
  HIGH,

  /**
   * Indicates a medium likelihood that the order is fraudulent.
   */
  MEDIUM,

  /**
   * Indicates a low likelihood that the order is fraudulent.
   */
  LOW,

  /**
   * Indicates that the risk assessment will not provide a recommendation for the order.
   */
  NONE,

  /**
   * Indicates that the risk assessment is still pending.
   */
  PENDING
}
