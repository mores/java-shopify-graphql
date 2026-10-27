package com.shopify.admin.types;

/**
 * A standardized error code, independent of the payment provider.
 */
public enum OrderTransactionErrorCode {
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
   * The card security code (CVC/CVV) is incorrect.
   */
  INCORRECT_CVC,

  /**
   * The ZIP or postal code doesn't match the one on file.
   */
  INCORRECT_ZIP,

  /**
   * The address is incorrect.
   */
  INCORRECT_ADDRESS,

  /**
   * The PIN entered is incorrect.
   */
  INCORRECT_PIN,

  /**
   * The card was declined.
   */
  CARD_DECLINED,

  /**
   * There was an error while processing the payment.
   */
  PROCESSING_ERROR,

  /**
   * The issuer declined the transaction, the customer should contact their issuer for more details.
   */
  CALL_ISSUER,

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
   * There was an unknown error with processing the payment.
   */
  GENERIC_ERROR,

  /**
   * The payment method is not available in the customer's country.
   */
  INVALID_COUNTRY,

  /**
   * The amount is invalid.
   */
  INVALID_AMOUNT,

  /**
   * The payment method is momentarily unavailable.
   */
  PAYMENT_METHOD_UNAVAILABLE,

  /**
   * The payment method was invalid.
   */
  AMAZON_PAYMENTS_INVALID_PAYMENT_METHOD,

  /**
   * The maximum amount has been captured.
   */
  AMAZON_PAYMENTS_MAX_AMOUNT_CHARGED,

  /**
   * The maximum amount has been refunded.
   */
  AMAZON_PAYMENTS_MAX_AMOUNT_REFUNDED,

  /**
   * The maximum of 10 authorizations has been captured for an order.
   */
  AMAZON_PAYMENTS_MAX_AUTHORIZATIONS_CAPTURED,

  /**
   * The maximum of 10 refunds has been processed for an order.
   */
  AMAZON_PAYMENTS_MAX_REFUNDS_PROCESSED,

  /**
   * The order was canceled, which canceled all open authorizations.
   */
  AMAZON_PAYMENTS_ORDER_REFERENCE_CANCELED,

  /**
   * The order was not confirmed within three hours.
   */
  AMAZON_PAYMENTS_STALE,

  /**
   * The transaction amount exceeds the maximum amount allowed.
   */
  AMOUNT_TOO_LARGE,

  /**
   * The transaction amount is below the minimum amount allowed.
   */
  AMOUNT_TOO_SMALL,

  /**
   * The 3D Secure authentication failed.
   */
  AUTHENTICATION_FAILED,

  /**
   * The transaction requires 3D Secure authentication but was attempted without authentication.
   */
  AUTHENTICATION_REQUIRED,

  /**
   * The transaction was cancelled.
   */
  CANCELLED_PAYMENT,

  /**
   * The transaction was declined due to suspected card testing activity.
   */
  CARD_TESTING,

  /**
   * The issuer declined the transaction without providing a specific reason.
   */
  DO_NOT_HONOR,

  /**
   * The transaction was declined due to suspected fraudulent activity.
   */
  FRAUD_SUSPECTED,

  /**
   * There are insufficient funds available to complete the transaction.
   */
  INSUFFICIENT_FUNDS,

  /**
   * The currency isn't supported.
   */
  INVALID_CURRENCY,

  /**
   * The payment method is invalid or not found.
   */
  INVALID_PAYMENT_METHOD,

  /**
   * This payment method doesn't support the requested transaction type.
   */
  INVALID_PURCHASE_TYPE,

  /**
   * The transaction couldn't be processed due to an issue with the merchant account.
   */
  MERCHANT_ACCOUNT_ERROR,

  /**
   * The transaction was blocked due to the merchant's custom payment risk rule.
   */
  MERCHANT_RULE,

  /**
   * The payment instrument was declined.
   */
  INSTRUMENT_DECLINED,

  /**
   * The payment method isn't supported.
   */
  PAYMENT_METHOD_UNSUPPORTED,

  /**
   * The transaction couldn't be processed due to an unexpected error with the payment provider.
   */
  PAYMENT_PROVIDER_ERROR,

  /**
   * The transaction retry attempt was declined.
   */
  RETRY_DECLINED,

  /**
   * The payment instrument has exceeded the processing frequency limit.
   */
  TRANSACTION_LIMIT_EXCEEDED,

  /**
   * The authorization has expired.
   */
  AUTHORIZATION_EXPIRED
}
