package com.shopify.admin.types;

/**
 * The type of a payment status.
 */
public enum OrderPaymentStatusResult {
  SUCCESS,

  AUTHORIZED,

  VOIDED,

  REFUNDED,

  CAPTURED,

  PURCHASED,

  ERROR,

  PROCESSING,

  REDIRECT_REQUIRED,

  RETRYABLE,

  UNKNOWN,

  INITIATED,

  PENDING
}
