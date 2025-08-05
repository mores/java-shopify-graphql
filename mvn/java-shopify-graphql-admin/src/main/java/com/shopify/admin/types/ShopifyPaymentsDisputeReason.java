package com.shopify.admin.types;

/**
 * The reason for the dispute provided by the cardholder's bank.
 */
public enum ShopifyPaymentsDisputeReason {
  FRAUDULENT,

  GENERAL,

  UNRECOGNIZED,

  DUPLICATE,

  SUBSCRIPTION_CANCELLED,

  PRODUCT_UNACCEPTABLE,

  PRODUCT_NOT_RECEIVED,

  CREDIT_NOT_PROCESSED,

  INCORRECT_ACCOUNT_DETAILS,

  INSUFFICIENT_FUNDS,

  BANK_CANNOT_PROCESS,

  DEBIT_NOT_AUTHORIZED,

  CUSTOMER_INITIATED,

  NONCOMPLIANT
}
