package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ShippingLabelPurchaseError`.
 */
public enum ShippingLabelPurchaseErrorCode {
  /**
   * There is another shipping label being purchased for this order.
   */
  JOB_NOT_ENQUEUED,

  /**
   * We are still processing the purchase for this label.
   */
  PURCHASE_IN_PROGRESS,

  /**
   * The shipping label could not be purchased due to invalid information. Please
   * verify the shipping address, package weight and dimensions, and customs
   * details (for international shipments).
   */
  PURCHASE_LABEL_VALIDATION_ERROR,

  /**
   * Kill switch is enabled for this carrier.
   */
  KILL_SWITCH,

  /**
   * The carrier is not available for this label. Please try another carrier.
   */
  CARRIER_NOT_AVAILABLE,

  /**
   * The requested shop's shipping account is disabled. Please contact support.
   */
  DISABLED_SHIPPING_ACCOUNT,

  /**
   * We could not reach the shipping carrier. Please try again in a few minutes.
   */
  CONNECTION_ERROR,

  /**
   * An error occurred while purchasing the label. Please try again.
   */
  TRANSIENT_ERROR,

  /**
   * A non-recoverable error occurred while purchasing the label. Review the shipment details and try again.
   */
  PERMANENT_ERROR,

  /**
   * An unknown error occurred while purchasing the label.
   */
  UNKNOWN_ERROR
}
