package com.shopify.admin.types;

/**
 * The status of the customer merge request.
 */
public enum CustomerMergeRequestStatus {
  /**
   * The customer merge request has been requested.
   */
  REQUESTED,

  /**
   * The customer merge request is currently in progress.
   */
  IN_PROGRESS,

  /**
   * The customer merge request has been completed.
   */
  COMPLETED,

  /**
   * The customer merge request has failed.
   */
  FAILED
}
