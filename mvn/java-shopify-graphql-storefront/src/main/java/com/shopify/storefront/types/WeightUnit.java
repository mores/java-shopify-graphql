package com.shopify.storefront.types;

/**
 * Units of measurement for weight, supporting both metric and imperial systems. Used by [`ProductVariant`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant)
 * to specify the unit for the variant's weight value.
 */
public enum WeightUnit {
  KILOGRAMS,

  GRAMS,

  POUNDS,

  OUNCES
}
