package com.shopify.admin.types;

/**
 * The possible statuses for a media preview image.
 */
public enum MediaPreviewImageStatus {
  /**
   * Preview image is uploaded but not yet processed.
   */
  UPLOADED,

  /**
   * Preview image is being processed.
   */
  PROCESSING,

  /**
   * Preview image is ready to be displayed.
   */
  READY,

  /**
   * Preview image processing has failed.
   */
  FAILED
}
