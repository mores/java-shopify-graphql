package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `OrderCancelUserError`.
 */
public enum OrderCancelUserErrorCode {
  /**
   * An order refund was requested but the user does not have the refund_orders permission.
   */
  NO_REFUND_PERMISSION,

  /**
   * An order refund was requested but the user does not have the refund_to_store_credit permission.
   */
  NO_REFUND_TO_STORE_CREDIT_PERMISSION,

  /**
   * A store credit order refund was requested but the expiration date is in the past.
   */
  STORE_CREDIT_REFUND_EXPIRATION_IN_PAST,

  /**
   * A store credit order refund was requested but the order has no customer.
   */
  STORE_CREDIT_REFUND_MISSING_CUSTOMER,

  /**
   * A store credit order refund was requested but the order is a B2B order.
   */
  STORE_CREDIT_REFUND_B2B_NOT_SUPPORTED,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR
}
