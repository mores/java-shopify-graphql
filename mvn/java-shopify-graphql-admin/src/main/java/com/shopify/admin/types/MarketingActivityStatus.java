package com.shopify.admin.types;

/**
 * Status helps to identify if this marketing activity has been completed, queued, failed etc.
 */
public enum MarketingActivityStatus {
  /**
   * This marketing activity is currently running.
   */
  ACTIVE,

  /**
   * This marketing activity is permanently unavailable.
   */
  DELETED,

  /**
   * This marketing activity was deleted and it was triggered from outside of Shopify.
   */
  DELETED_EXTERNALLY,

  /**
   * This marketing activity is disconnected and no longer editable.
   */
  DISCONNECTED,

  /**
   * This marketing activity has been edited, but it is not yet created.
   */
  DRAFT,

  /**
   * This marketing activity is unable to run.
   */
  FAILED,

  /**
   * This marketing activity has completed running.
   */
  INACTIVE,

  /**
   * This marketing activity is currently not running.
   */
  PAUSED,

  /**
   * This marketing activity is pending creation on the app's marketing platform.
   */
  PENDING,

  /**
   * This marketing activity is scheduled to run.
   */
  SCHEDULED,

  /**
   * The marketing activity's status is unknown.
   */
  UNDEFINED
}
