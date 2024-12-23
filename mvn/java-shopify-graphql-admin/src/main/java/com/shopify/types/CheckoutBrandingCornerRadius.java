package com.shopify.types;

/**
 * The options for customizing the corner radius of checkout-related objects. Examples include the primary
 * button, the name text fields and the sections within the main area (if they have borders).
 * Refer to this complete [list](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius#fieldswith)
 * for objects with customizable corner radii.
 *
 * The design system defines the corner radius pixel size for each option. Modify the defaults by setting the
 * [designSystem.cornerRadius](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/CheckoutBrandingDesignSystemInput#field-checkoutbrandingdesignsysteminput-cornerradius)
 * input fields.
 */
public enum CheckoutBrandingCornerRadius {
  NONE,

  SMALL,

  BASE,

  LARGE
}
