package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodCreateFromDuplicationDataUserError`.
 */
public enum CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode {
  TOO_MANY_REQUESTS,

  CUSTOMER_DOES_NOT_EXIST,

  INVALID_ENCRYPTED_DUPLICATION_DATA
}
