package com.shopify.admin.types;

/**
 * The status of a return.
 */
public enum ReturnStatus {
  /**
   * The return has been canceled.
   */
  CANCELED,

  /**
   * The return has been completed.
   */
  CLOSED,

  /**
   * The return is in progress.
   */
  OPEN,

  /**
   * The return was requested.
   */
  REQUESTED,

  /**
   * The return was declined.
   */
  DECLINED
}
