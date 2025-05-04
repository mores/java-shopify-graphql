package com.shopify.admin.types;

/**
 * The RFM (Recency, Frequency, Monetary) group for a customer.
 */
public enum CustomerRfmGroup {
  CHAMPIONS,

  LOYAL,

  ACTIVE,

  NEW,

  PROMISING,

  NEEDS_ATTENTION,

  ALMOST_LOST,

  PREVIOUSLY_LOYAL,

  AT_RISK,

  DORMANT,

  PROSPECTS
}
