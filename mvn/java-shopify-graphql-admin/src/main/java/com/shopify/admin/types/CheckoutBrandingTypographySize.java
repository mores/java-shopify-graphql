package com.shopify.admin.types;

/**
 * Possible choices for the font size.
 *
 * Note that the value in pixels of these settings can be customized with the
 * [typography size](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/CheckoutBrandingFontSizeInput)
 * object. Refer to the [typography tutorial](https://shopify.dev/docs/apps/checkout/styling/customize-typography)
 * for more information.
 */
public enum CheckoutBrandingTypographySize {
  /**
   * The extra small font size. Example: 10px.
   */
  EXTRA_SMALL,

  /**
   * The small font size. Example: 12px.
   */
  SMALL,

  /**
   * The base font size. Example: 14px.
   */
  BASE,

  /**
   * The medium font size. Example: 16px.
   */
  MEDIUM,

  /**
   * The large font size. Example: 19px.
   */
  LARGE,

  /**
   * The extra large font size. Example: 21px.
   */
  EXTRA_LARGE,

  /**
   * The extra extra large font size. Example: 24px.
   */
  EXTRA_EXTRA_LARGE
}
