package com.shopify.admin.types;

/**
 * State of the tax app configuration.
 */
public enum TaxPartnerState {
  /**
   * App is not configured.
   */
  PENDING,

  /**
   * App is configured, but not used for tax calculations.
   */
  READY,

  /**
   * App is configured and to be used for tax calculations.
   */
  ACTIVE
}
