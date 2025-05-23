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
  EXTRA_SMALL,

  SMALL,

  BASE,

  MEDIUM,

  LARGE,

  EXTRA_LARGE,

  EXTRA_EXTRA_LARGE
}
