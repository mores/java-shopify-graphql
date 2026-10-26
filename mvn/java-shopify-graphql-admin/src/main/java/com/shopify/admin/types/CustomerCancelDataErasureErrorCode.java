package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerCancelDataErasureUserError`.
 */
public enum CustomerCancelDataErasureErrorCode {
  /**
   * Customer does not exist.
   */
  DOES_NOT_EXIST,

  /**
   * Failed to cancel customer data erasure.
   */
  FAILED_TO_CANCEL,

  /**
   * Customer's data is not scheduled for erasure.
   */
  NOT_BEING_ERASED,

  /**
   * Only the original requester can cancel this data erasure.
   */
  UNAUTHORIZED_CANCELLATION
}
