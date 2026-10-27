package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodUserError`.
 */
public enum CustomerPaymentMethodUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is already taken.
   */
  TAKEN
}
