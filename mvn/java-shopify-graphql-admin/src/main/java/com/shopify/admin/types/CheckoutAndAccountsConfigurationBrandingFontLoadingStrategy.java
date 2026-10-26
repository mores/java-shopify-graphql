package com.shopify.admin.types;

/**
 * The font loading strategy determines how a font face is displayed after it is
 * loaded or failed to load. For more information:
 * https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face/font-display.
 */
public enum CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy {
  /**
   * The font display strategy is defined by the browser user agent.
   */
  AUTO,

  /**
   * Gives the font face a short block period and an infinite swap period.
   */
  BLOCK,

  /**
   * Gives the font face an extremely small block period and an infinite swap period.
   */
  SWAP,

  /**
   * Gives the font face an extremely small block period and a short swap period.
   */
  FALLBACK,

  /**
   * Gives the font face an extremely small block period and no swap period.
   */
  OPTIONAL
}
