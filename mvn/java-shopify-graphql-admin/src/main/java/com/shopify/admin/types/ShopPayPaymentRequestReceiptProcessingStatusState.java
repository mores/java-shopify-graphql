package com.shopify.admin.types;

/**
 * The state of the payment request receipt.
 */
public enum ShopPayPaymentRequestReceiptProcessingStatusState {
  /**
   * The payment request is ready and queued to be processed.
   */
  READY,

  /**
   * The payment request currently being processed.
   */
  PROCESSING,

  /**
   * The payment request processing failed.
   */
  FAILED,

  /**
   * The payment request processing completed successfully.
   */
  COMPLETED,

  /**
   * The payment request requires action from the buyer.
   */
  ACTION_REQUIRED
}
