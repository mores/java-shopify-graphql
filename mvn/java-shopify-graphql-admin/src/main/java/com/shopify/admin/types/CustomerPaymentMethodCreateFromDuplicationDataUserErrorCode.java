package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodCreateFromDuplicationDataUserError`.
 */
public enum CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode {
  /**
   * Too many requests.
   */
  TOO_MANY_REQUESTS,

  /**
   * Customer doesn't exist.
   */
  CUSTOMER_DOES_NOT_EXIST,

  /**
   * Invalid encrypted duplication data.
   */
  INVALID_ENCRYPTED_DUPLICATION_DATA
}
