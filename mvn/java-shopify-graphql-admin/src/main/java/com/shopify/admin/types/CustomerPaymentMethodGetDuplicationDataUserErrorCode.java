package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodGetDuplicationDataUserError`.
 */
public enum CustomerPaymentMethodGetDuplicationDataUserErrorCode {
  PAYMENT_METHOD_DOES_NOT_EXIST,

  INVALID_INSTRUMENT,

  TOO_MANY_REQUESTS,

  CUSTOMER_DOES_NOT_EXIST,

  SAME_SHOP,

  INVALID_ORGANIZATION_SHOP
}
