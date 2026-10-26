package com.shopify.admin.types;

/**
 * The source that collected the customer's consent to receive marketing materials.
 */
public enum CustomerConsentCollectedFrom {
  /**
   * The customer consent was collected by Shopify.
   */
  SHOPIFY,

  /**
   * The customer consent was collected outside of Shopify.
   */
  OTHER
}
