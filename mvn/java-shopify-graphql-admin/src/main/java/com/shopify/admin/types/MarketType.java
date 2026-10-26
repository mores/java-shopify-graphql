package com.shopify.admin.types;

/**
 * The market types.
 */
public enum MarketType {
  /**
   * The market does not apply to any visitor.
   */
  NONE,

  /**
   * The market applies to the visitor based on region.
   */
  REGION,

  /**
   * The market applies to the visitor based on the location.
   */
  LOCATION,

  /**
   * The market applies to the visitor based on the company location.
   */
  COMPANY_LOCATION,

  /**
   * The market applies to the visitor based on the channel.
   */
  CHANNEL
}
