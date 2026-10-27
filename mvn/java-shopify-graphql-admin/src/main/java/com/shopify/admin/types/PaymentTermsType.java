package com.shopify.admin.types;

/**
 * The type of a payment terms or a payment terms template.
 */
public enum PaymentTermsType {
  /**
   * The payment terms or payment terms template is due on receipt.
   */
  RECEIPT,

  /**
   * The payment terms or payment terms template is a net type. It's due a number of days after issue.
   */
  NET,

  /**
   * The payment terms or payment terms template is a fixed type. It's due on a specified date.
   */
  FIXED,

  /**
   * The payment terms or payment terms template is due on fulfillment.
   */
  FULFILLMENT,

  /**
   * The type of the payment terms or payment terms template is unknown.
   */
  UNKNOWN
}
