package com.shopify.admin.types;

/**
 * The options for customizing the corner radius of checkout-related objects.
 * Examples include the primary button, the name text fields and the sections
 * within the main area (if they have borders).
 */
public enum CheckoutAndAccountsConfigurationBrandingCornerRadius {
  /**
   * The 0px corner radius (square corners).
   */
  NONE,

  /**
   * The corner radius with a pixel value defined by designTokens.cornerRadius.small.
   */
  SMALL,

  /**
   * The corner radius with a pixel value defined by designTokens.cornerRadius.base.
   */
  BASE,

  /**
   * The corner radius with a pixel value defined by designTokens.cornerRadius.large.
   */
  LARGE
}
