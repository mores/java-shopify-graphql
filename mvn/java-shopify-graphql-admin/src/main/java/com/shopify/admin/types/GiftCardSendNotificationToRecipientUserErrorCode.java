package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `GiftCardSendNotificationToRecipientUserError`.
 */
public enum GiftCardSendNotificationToRecipientUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The recipient could not be found.
   */
  RECIPIENT_NOT_FOUND,

  /**
   * The gift card could not be found.
   */
  GIFT_CARD_NOT_FOUND
}
