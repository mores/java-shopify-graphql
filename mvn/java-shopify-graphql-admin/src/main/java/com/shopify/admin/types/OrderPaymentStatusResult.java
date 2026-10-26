package com.shopify.admin.types;

/**
 * The type of a payment status.
 */
public enum OrderPaymentStatusResult {
  /**
   * The payment succeeded.
   */
  SUCCESS,

  /**
   * The payment is authorized.
   */
  AUTHORIZED,

  /**
   * The payment is voided.
   */
  VOIDED,

  /**
   * The payment is refunded.
   */
  REFUNDED,

  /**
   * The payment is captured.
   */
  CAPTURED,

  /**
   * The payment is in purchased status.
   */
  PURCHASED,

  /**
   * There was an error initiating the payment.
   */
  ERROR,

  /**
   * The payment is still being processed.
   */
  PROCESSING,

  /**
   * Redirect required.
   */
  REDIRECT_REQUIRED,

  /**
   * Payment can be retried.
   */
  RETRYABLE,

  /**
   * Status is unknown.
   */
  UNKNOWN,

  /**
   * The payment is awaiting processing.
   */
  INITIATED,

  /**
   * The payment is pending with the provider, and may take a while.
   */
  PENDING,

  /**
   * The payment partially succeeded. Some payment methods were charged but the primary payment method failed.
   */
  PARTIAL_SUCCESS
}
