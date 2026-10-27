package com.shopify.admin.types;

/**
 * Warning types for media.
 */
public enum MediaWarningCode {
  /**
   * 3D model physical size might be invalid. The dimensions of your model are very
   * small. Consider reviewing your model to ensure they are correct.
   */
  MODEL_SMALL_PHYSICAL_SIZE,

  /**
   * 3D model physical size might be invalid. The dimensions of your model are very
   * large. Consider reviewing your model to ensure they are correct.
   */
  MODEL_LARGE_PHYSICAL_SIZE,

  /**
   * The thumbnail failed to regenerate.Try applying the changes again to regenerate the thumbnail.
   */
  MODEL_PREVIEW_IMAGE_FAIL
}
