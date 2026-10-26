package com.shopify.storefront.types;

/**
 * Digital wallet, such as Apple Pay, which can be used for accelerated checkouts.
 */
public enum DigitalWallet {
  /**
   * Apple Pay.
   */
  APPLE_PAY,

  /**
   * Android Pay.
   */
  ANDROID_PAY,

  /**
   * Google Pay.
   */
  GOOGLE_PAY,

  /**
   * Shopify Pay.
   */
  SHOPIFY_PAY
}
