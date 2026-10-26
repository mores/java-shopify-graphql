package com.shopify.admin.types;

/**
 * Set of possible statuses for an external marketing activity.
 */
public enum MarketingActivityExternalStatus {
  /**
   * This marketing activity is currently running.
   */
  ACTIVE,

  /**
   * This marketing activity has completed running.
   */
  INACTIVE,

  /**
   * This marketing activity is currently not running.
   */
  PAUSED,

  /**
   * This marketing activity is scheduled to run.
   */
  SCHEDULED,

  /**
   * This marketing activity was deleted and it was triggered from outside of Shopify.
   */
  DELETED_EXTERNALLY,

  /**
   * The marketing activity's status is unknown.
   */
  UNDEFINED
}
