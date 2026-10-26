package com.shopify.storefront.types;

/**
 * Represents how credit card details are provided for a direct payment.
 */
public enum CartCardSource {
  /**
   * The credit card was provided by a third party and vaulted on their system.
   * Using this value requires a separate permission from Shopify.
   */
  SAVED_CREDIT_CARD
}
