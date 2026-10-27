package com.shopify.admin.types;

/**
 * Error codes for payment-related billing attempt failures.
 */
public enum SubscriptionBillingAttemptPaymentErrorCode {
  /**
   * Payment method was declined.
   */
  PAYMENT_METHOD_DECLINED,

  /**
   * Payment method has expired.
   */
  EXPIRED_PAYMENT_METHOD,

  /**
   * The payment method has insufficient funds to complete the payment.
   */
  INSUFFICIENT_FUNDS,

  /**
   * There was an error during the authentication.
   */
  AUTHENTICATION_ERROR,

  /**
   * Payment method is invalid.
   */
  INVALID_PAYMENT_METHOD,

  /**
   * The buyer canceled the payment method.
   */
  BUYER_CANCELED_PAYMENT_METHOD,

  /**
   * The customer billing agreement is invalid.
   */
  INVALID_CUSTOMER_BILLING_AGREEMENT,

  /**
   * The transaction amount is too small.
   */
  AMOUNT_TOO_SMALL,

  /**
   * The transaction amount is too large.
   */
  AMOUNT_TOO_LARGE,

  /**
   * The card number is incorrect.
   */
  CARD_NUMBER_INCORRECT,

  /**
   * Fraud was suspected on this transaction.
   */
  FRAUD_SUSPECTED,

  /**
   * The invoice has already been paid.
   */
  INVOICE_ALREADY_PAID,

  /**
   * A test mode error occurred.
   */
  TEST_MODE,

  /**
   * A general PayPal error occurred.
   */
  PAYPAL_ERROR_GENERAL,

  /**
   * The shipping address is invalid.
   */
  INVALID_SHIPPING_ADDRESS,

  /**
   * A transient error occurred, try again later.
   */
  TRANSIENT_ERROR,

  /**
   * Purchase type is not supported.
   */
  PURCHASE_TYPE_NOT_SUPPORTED,

  /**
   * Authentication failed during the payment processing.
   */
  AUTHENTICATION_FAILED,

  /**
   * Additional authentication is required for this payment.
   */
  AUTHENTICATION_REQUIRED,

  /**
   * The card issuer requires the cardholder to call.
   */
  CALL_ISSUER,

  /**
   * The card was declined.
   */
  CARD_DECLINED,

  /**
   * The payment confirmation was rejected.
   */
  CONFIRMATION_REJECTED,

  /**
   * The card issuer returned 'do not honor'. The customer should reach out to their card-issuing bank for more information.
   */
  DO_NOT_HONOR,

  /**
   * The payment was declined due to a merchant rule.
   */
  MERCHANT_RULE,

  /**
   * The off-session payment was rejected.
   */
  OFF_SESSION_REJECTED,

  /**
   * The payment retry was declined.
   */
  RETRY_DECLINED,

  /**
   * The transaction exceeded the limit.
   */
  TRANSACTION_LIMIT_EXCEEDED,

  /**
   * The postal/ZIP code is incorrect.
   */
  INCORRECT_ZIP,

  /**
   * The transaction amount is invalid.
   */
  INVALID_AMOUNT,

  /**
   * The currency is not supported.
   */
  INVALID_CURRENCY,

  /**
   * The card security code is invalid.
   */
  INVALID_CVC,

  /**
   * The card number is invalid.
   */
  INVALID_NUMBER,

  /**
   * The payment method type is not supported.
   */
  PAYMENT_METHOD_UNSUPPORTED,

  /**
   * An exception occurred with the payment provider.
   */
  PAYMENT_PROVIDER_ERROR,

  /**
   * The billing address is incorrect.
   */
  INCORRECT_ADDRESS,

  /**
   * The card security code is incorrect.
   */
  INCORRECT_CVC,

  /**
   * The card number is incorrect.
   */
  INCORRECT_NUMBER,

  /**
   * The PIN is incorrect.
   */
  INCORRECT_PIN,

  /**
   * The card has expired.
   */
  EXPIRED_CARD,

  /**
   * The expiry date is invalid.
   */
  INVALID_EXPIRY_DATE,

  /**
   * The required buyer action has expired.
   */
  EXPIRED_BUYER_ACTION,

  /**
   * A processing error occurred.
   */
  PROCESSING_ERROR,

  /**
   * A generic payment error occurred.
   */
  GENERIC_ERROR,

  /**
   * The payment was cancelled.
   */
  CANCELLED_PAYMENT,

  /**
   * The purchase type is invalid.
   */
  INVALID_PURCHASE_TYPE,

  /**
   * The payment request is invalid.
   */
  INVALID_REQUEST
}
