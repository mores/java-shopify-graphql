package com.shopify.admin.types;

/**
 * A standardized error code, independent of the payment provider.
 */
public enum ShopPayPaymentRequestReceiptProcessingStatusErrorCode {
  /**
   * The card number is incorrect.
   */
  INCORRECT_NUMBER,

  /**
   * The format of the card number is incorrect.
   */
  INVALID_NUMBER,

  /**
   * The format of the expiry date is incorrect.
   */
  INVALID_EXPIRY_DATE,

  /**
   * The format of the CVC is incorrect.
   */
  INVALID_CVC,

  /**
   * The card is expired.
   */
  EXPIRED_CARD,

  /**
   * The CVC does not match the card number.
   */
  INCORRECT_CVC,

  /**
   * The ZIP or postal code does not match the card number.
   */
  INCORRECT_ZIP,

  /**
   * The address does not match the card number.
   */
  INCORRECT_ADDRESS,

  /**
   * The entered PIN is incorrect.
   */
  INCORRECT_PIN,

  /**
   * The amount is too small.
   */
  AMOUNT_TOO_SMALL,

  /**
   * The card was declined.
   */
  CARD_DECLINED,

  /**
   * There was an error while processing the payment.
   */
  PROCESSING_ERROR,

  /**
   * Call the card issuer.
   */
  CALL_ISSUER,

  /**
   * The 3D Secure check failed.
   */
  THREE_D_SECURE_FAILED,

  /**
   * The card issuer has flagged the transaction as potentially fraudulent.
   */
  FRAUD_SUSPECTED,

  /**
   * The card has been reported as lost or stolen, and the card issuer has
   * requested that the merchant keep the card and call the number on the back.
   */
  PICK_UP_CARD,

  /**
   * There is an error in the gateway or merchant configuration.
   */
  CONFIG_ERROR,

  /**
   * A real card was used but the gateway was in test mode.
   */
  TEST_MODE_LIVE_CARD,

  /**
   * The gateway or merchant configuration doesn't support a feature, such as network tokenization.
   */
  UNSUPPORTED_FEATURE,

  /**
   * Too many failed CVV verification attempts.
   */
  CVV_ATTEMPTS_EXCEEDED,

  /**
   * There was an unknown error with processing the payment.
   */
  GENERIC_ERROR,

  /**
   * The payment method is not available in the customer's country.
   */
  INVALID_COUNTRY,

  /**
   * The amount is either too high or too low for the provider.
   */
  INVALID_AMOUNT,

  /**
   * The payment method is momentarily unavailable.
   */
  PAYMENT_METHOD_UNAVAILABLE
}
