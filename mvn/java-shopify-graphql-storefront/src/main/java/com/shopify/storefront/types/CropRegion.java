package com.shopify.storefront.types;

/**
 * The part of the image that should remain after cropping.
 */
public enum CropRegion {
  /**
   * Keep the center of the image.
   */
  CENTER,

  /**
   * Keep the top of the image.
   */
  TOP,

  /**
   * Keep the bottom of the image.
   */
  BOTTOM,

  /**
   * Keep the left of the image.
   */
  LEFT,

  /**
   * Keep the right of the image.
   */
  RIGHT
}
