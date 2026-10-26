package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `GiftCardSendNotificationToCustomerUserError`.
 */
public enum GiftCardSendNotificationToCustomerUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The customer could not be found.
   */
  CUSTOMER_NOT_FOUND,

  /**
   * The gift card could not be found.
   */
  GIFT_CARD_NOT_FOUND
}
