package com.shopify.admin.types;

/**
 * The type of tax identification field.
 */
public enum ShopifyPaymentsTaxIdentificationType {
  /**
   * The last 4 digits of the SSN.
   */
  SSN_LAST4_DIGITS,

  /**
   * Full SSN.
   */
  FULL_SSN,

  /**
   * Business EIN.
   */
  EIN
}
