package com.shopify.admin.types;

/**
 * Possible types of app developer.
 */
public enum AppDeveloperType {
  /**
   * Indicates the app developer is Shopify.
   */
  SHOPIFY,

  /**
   * Indicates the app developer is a Partner.
   */
  PARTNER,

  /**
   * Indicates the app developer works directly for a Merchant.
   */
  MERCHANT,

  /**
   * Indicates the app developer is unknown. It is not categorized as any of the other developer types.
   */
  UNKNOWN
}
