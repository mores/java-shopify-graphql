package com.shopify.admin.types;

/**
 * Possible sentiments for a risk fact.
 */
public enum RiskFactSentiment {
  /**
   * A positive contributor that lowers the risk.
   */
  POSITIVE,

  /**
   * A neutral contributor with regard to risk.
   */
  NEUTRAL,

  /**
   * A negative contributor that increases the risk.
   */
  NEGATIVE
}
