package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `OrderCreateManualPaymentOrderCreateManualPaymentError`.
 */
public enum OrderCreateManualPaymentOrderCreateManualPaymentErrorCode {
  /**
   * Order is not found.
   */
  ORDER_NOT_FOUND,

  /**
   * Amount must be positive.
   */
  AMOUNT_NOT_POSITIVE,

  /**
   * Payment gateway is not found.
   */
  GATEWAY_NOT_FOUND,

  /**
   * Amount exceeds the remaining balance.
   */
  AMOUNT_EXCEEDS_BALANCE,

  /**
   * Order is temporarily unavailable.
   */
  ORDER_IS_TEMPORARILY_UNAVAILABLE,

  /**
   * Indicates that the processedAt field is invalid, such as when it references a future date.
   */
  PROCESSED_AT_INVALID,

  /**
   * The currency of the amount doesn't match the presentment currency of the order.
   */
  CURRENCY_MISMATCH
}
