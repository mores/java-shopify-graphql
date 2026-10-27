package com.shopify.admin.types;

/**
 * The possible statuses for a file object.
 */
public enum FileStatus {
  /**
   * File has been uploaded but hasn't been processed.
   */
  UPLOADED,

  /**
   * File is being processed.
   */
  PROCESSING,

  /**
   * File is ready to be displayed.
   */
  READY,

  /**
   * File processing has failed.
   */
  FAILED
}
