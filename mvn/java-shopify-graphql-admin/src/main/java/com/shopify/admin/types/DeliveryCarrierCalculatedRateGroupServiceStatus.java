package com.shopify.admin.types;

/**
 * Whether a carrier-provided service is included at checkout.
 */
public enum DeliveryCarrierCalculatedRateGroupServiceStatus {
  /**
   * The service is included at checkout.
   */
  INCLUDED,

  /**
   * The service is excluded at checkout.
   */
  EXCLUDED
}
