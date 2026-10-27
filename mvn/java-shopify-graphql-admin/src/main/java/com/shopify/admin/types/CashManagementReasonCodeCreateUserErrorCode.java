package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CashManagementReasonCodeCreateUserError`.
 */
public enum CashManagementReasonCodeCreateUserErrorCode {
  /**
   * The reason code already exists.
   */
  CODE_ALREADY_EXISTS,

  /**
   * Failed to create cash management reason code.
   */
  NOT_SAVED,

  /**
   * The input value is blank.
   */
  BLANK
}
