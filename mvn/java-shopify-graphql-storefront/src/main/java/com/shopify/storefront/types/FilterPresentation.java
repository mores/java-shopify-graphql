package com.shopify.storefront.types;

/**
 * Defines how to present the filter values, specifies the presentation of the filter.
 */
public enum FilterPresentation {
  /**
   * Image presentation, filter values display an image.
   */
  IMAGE,

  /**
   * Swatch presentation, filter values display color or image patterns.
   */
  SWATCH,

  /**
   * Text presentation, no additional visual display for filter values.
   */
  TEXT
}
