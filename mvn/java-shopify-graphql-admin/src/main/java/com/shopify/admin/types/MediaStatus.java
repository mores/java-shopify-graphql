package com.shopify.admin.types;

/**
 * The possible statuses for a media object.
 */
public enum MediaStatus {
  /**
   * Media has been uploaded but not yet processed.
   */
  UPLOADED,

  /**
   * Media is being processed.
   */
  PROCESSING,

  /**
   * Media is ready to be displayed.
   */
  READY,

  /**
   * Media processing has failed.
   */
  FAILED
}
