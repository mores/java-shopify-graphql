package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CashManagementReasonCodeDeleteUserError`.
 */
public enum CashManagementReasonCodeDeleteUserErrorCode {
  /**
   * Reason code not found.
   */
  NOT_FOUND,

  /**
   * Database error occurred.
   */
  DATABASE_ERROR,

  /**
   * SYSTEM type reason codes are not deletable.
   */
  NOT_DELETABLE
}
