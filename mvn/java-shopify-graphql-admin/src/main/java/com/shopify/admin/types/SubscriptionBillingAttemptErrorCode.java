package com.shopify.admin.types;

/**
 * The possible error codes associated with making billing attempts. The error codes supplement the
 * `error_message` to provide consistent results and help with dunning management.
 */
public enum SubscriptionBillingAttemptErrorCode {
  /**
   * Payment method was not found.
   */
  PAYMENT_METHOD_NOT_FOUND,

  /**
   * Payment provider is not enabled.
   */
  PAYMENT_PROVIDER_IS_NOT_ENABLED,

  /**
   * Payment method is invalid. Please update or create a new payment method.
   */
  INVALID_PAYMENT_METHOD,

  /**
   * There was an unexpected error during the billing attempt.
   */
  UNEXPECTED_ERROR,

  /**
   * Payment method is expired.
   */
  EXPIRED_PAYMENT_METHOD,

  /**
   * Payment method was declined by processor.
   */
  PAYMENT_METHOD_DECLINED,

  /**
   * There was an error during the payment authentication.
   */
  AUTHENTICATION_ERROR,

  /**
   * Gateway is in test mode and attempted to bill a live payment method.
   */
  TEST_MODE,

  /**
   * Payment method was canceled by buyer.
   */
  BUYER_CANCELED_PAYMENT_METHOD,

  /**
   * Customer was not found.
   */
  CUSTOMER_NOT_FOUND,

  /**
   * Customer is invalid.
   */
  CUSTOMER_INVALID,

  /**
   * The shipping address is either missing or invalid.
   */
  INVALID_SHIPPING_ADDRESS,

  /**
   * The billing agreement ID or the transaction ID for the customer's payment method is invalid.
   */
  INVALID_CUSTOMER_BILLING_AGREEMENT,

  /**
   * A payment has already been made for this invoice.
   */
  INVOICE_ALREADY_PAID,

  /**
   * Payment method cannot be used with the current payment gateway test mode configuration.
   */
  PAYMENT_METHOD_INCOMPATIBLE_WITH_GATEWAY_CONFIG,

  /**
   * The amount is too small.
   */
  AMOUNT_TOO_SMALL,

  /**
   * The amount exceeds the limit for this payment method.
   */
  AMOUNT_TOO_LARGE,

  /**
   * Merchant account configuration error.
   */
  MERCHANT_ACCOUNT_ERROR,

  /**
   * No inventory location found or enabled.
   */
  INVENTORY_ALLOCATIONS_NOT_FOUND,

  /**
   * Not enough inventory found.
   */
  INSUFFICIENT_INVENTORY,

  /**
   * Transient error, try again later.
   */
  TRANSIENT_ERROR,

  /**
   * Insufficient funds.
   */
  INSUFFICIENT_FUNDS,

  /**
   * Purchase Type is not supported.
   */
  PURCHASE_TYPE_NOT_SUPPORTED,

  /**
   * Paypal Error General.
   */
  PAYPAL_ERROR_GENERAL,

  /**
   * Card number was incorrect.
   */
  CARD_NUMBER_INCORRECT,

  /**
   * Fraud was suspected.
   */
  FRAUD_SUSPECTED,

  /**
   * Non-test order limit reached. Use a test payment gateway to place another order.
   */
  NON_TEST_ORDER_LIMIT_REACHED,

  /**
   * Gift cards must have a price greater than zero.
   */
  FREE_GIFT_CARD_NOT_ALLOWED,

  /**
   * Payment method is not specified on subscription contract.
   */
  PAYMENT_METHOD_NOT_SPECIFIED,

  /**
   * The billing address is invalid.
   */
  INVALID_BILLING_ADDRESS,

  /**
   * Authentication failed during payment processing.
   */
  AUTHENTICATION_FAILED,

  /**
   * Additional authentication is required to complete the payment.
   */
  AUTHENTICATION_REQUIRED,

  /**
   * The card issuer requires the cardholder to call them.
   */
  CALL_ISSUER,

  /**
   * The card was declined by the payment processor.
   */
  CARD_DECLINED,

  /**
   * The payment confirmation was rejected.
   */
  CONFIRMATION_REJECTED,

  /**
   * The card issuer declined the transaction with a 'do not honor' response.
   */
  DO_NOT_HONOR,

  /**
   * The transaction was declined due to a merchant-defined rule.
   */
  MERCHANT_RULE,

  /**
   * The off-session payment was rejected and requires customer action.
   */
  OFF_SESSION_REJECTED,

  /**
   * The payment retry was declined.
   */
  RETRY_DECLINED,

  /**
   * The transaction exceeds the cardholder's limit.
   */
  TRANSACTION_LIMIT_EXCEEDED,

  /**
   * The postal/ZIP code provided is incorrect.
   */
  INCORRECT_ZIP,

  /**
   * The transaction amount is invalid for this payment method.
   */
  INVALID_AMOUNT,

  /**
   * The currency is not supported for this payment method.
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
   * The billing address provided is incorrect.
   */
  INCORRECT_ADDRESS,

  /**
   * The card security code entered is incorrect.
   */
  INCORRECT_CVC,

  /**
   * The card number entered is incorrect.
   */
  INCORRECT_NUMBER,

  /**
   * The PIN entered is incorrect.
   */
  INCORRECT_PIN,

  /**
   * The card has expired.
   */
  EXPIRED_CARD,

  /**
   * The expiry date of the card provided is invalid.
   */
  INVALID_EXPIRY_DATE,

  /**
   * The required buyer action has expired.
   */
  EXPIRED_BUYER_ACTION,

  /**
   * A processing error occurred with the payment provider.
   */
  PROCESSING_ERROR,

  /**
   * An exception occurred with the payment provider.
   */
  PAYMENT_PROVIDER_ERROR,

  /**
   * A generic payment error occurred.
   */
  GENERIC_ERROR,

  /**
   * The payment was cancelled.
   */
  CANCELLED_PAYMENT,

  /**
   * The purchase type is invalid for this payment method.
   */
  INVALID_PURCHASE_TYPE,

  /**
   * The payment request is invalid.
   */
  INVALID_REQUEST
}
