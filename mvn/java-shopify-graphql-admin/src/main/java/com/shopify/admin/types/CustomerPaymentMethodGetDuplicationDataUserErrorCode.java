package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodGetDuplicationDataUserError`.
 */
public enum CustomerPaymentMethodGetDuplicationDataUserErrorCode {
  /**
   * Payment method doesn't exist.
   */
  PAYMENT_METHOD_DOES_NOT_EXIST,

  /**
   * Invalid payment instrument.
   */
  INVALID_INSTRUMENT,

  /**
   * Too many requests.
   */
  TOO_MANY_REQUESTS,

  /**
   * Customer doesn't exist.
   */
  CUSTOMER_DOES_NOT_EXIST,

  /**
   * Target shop cannot be the same as the source.
   */
  SAME_SHOP,

  /**
   * Must be targeted to another shop in the same organization.
   */
  INVALID_ORGANIZATION_SHOP
}
