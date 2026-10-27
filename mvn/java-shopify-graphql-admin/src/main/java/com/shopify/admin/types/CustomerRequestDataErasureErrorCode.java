package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerRequestDataErasureUserError`.
 */
public enum CustomerRequestDataErasureErrorCode {
  /**
   * Customer does not exist.
   */
  DOES_NOT_EXIST,

  /**
   * Failed to request customer data erasure.
   */
  FAILED_TO_REQUEST
}
