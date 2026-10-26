package com.shopify.admin.types;

/**
 * The possible content types for a file object.
 */
public enum FileContentType {
  /**
   * A Shopify-hosted image.
   */
  IMAGE,

  /**
   * A Shopify-hosted generic file.
   */
  FILE,

  /**
   * A Shopify-hosted video file. It's recommended to use this type for all video files.
   */
  VIDEO,

  /**
   * An externally hosted video.
   */
  EXTERNAL_VIDEO,

  /**
   * A Shopify-hosted 3D model.
   */
  MODEL_3D
}
