package com.shopify.admin.types;

/**
 * Filter line items based on processing status.
 */
public enum ReturnProcessingStatusFilterInput {
  /**
   * Only include line items that have been processed.
   */
  PROCESSED,

  /**
   * Only include line items that have some processable quantity.
   */
  PROCESSABLE
}
