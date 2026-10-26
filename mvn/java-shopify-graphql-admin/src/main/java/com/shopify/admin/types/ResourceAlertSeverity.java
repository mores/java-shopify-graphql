package com.shopify.admin.types;

/**
 * The possible severity levels for a resource alert.
 */
public enum ResourceAlertSeverity {
  /**
   * Indicates a neutral alert. For example, an accepted dispute.
   */
  DEFAULT,

  /**
   * Indicates an informative alert. For example, an escalated dispute.
   */
  INFO,

  /**
   * Indicates an informative alert. For example, a new dispute.
   */
  WARNING,

  /**
   * Indicates a success alert. For example, a winning a dispute.
   */
  SUCCESS,

  /**
   * Indicates a critical alert. For example, a blocked app.
   */
  CRITICAL,

  ERROR
}
