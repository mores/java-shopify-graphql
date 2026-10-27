package com.shopify.admin.types;

/**
 * Represents the status of a mandate payment request.
 */
public enum OrderCreateMandatePaymentStatus {
  /**
   * The mandate payment request has been initiated.
   */
  STARTED,

  /**
   * The mandate payment has been completed successfully.
   */
  SUCCEEDED,

  /**
   * The mandate payment has failed.
   */
  FAILED
}
