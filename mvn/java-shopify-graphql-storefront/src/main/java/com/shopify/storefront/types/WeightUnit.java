package com.shopify.storefront.types;

/**
 * Units of measurement for weight, supporting both metric and imperial systems. Used by [`ProductVariant`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant)
 * to specify the unit for the variant's weight value.
 */
public enum WeightUnit {
  /**
   * 1 kilogram equals 1000 grams.
   */
  KILOGRAMS,

  /**
   * Metric system unit of mass.
   */
  GRAMS,

  /**
   * 1 pound equals 16 ounces.
   */
  POUNDS,

  /**
   * Imperial system unit of mass.
   */
  OUNCES
}
