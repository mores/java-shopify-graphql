package com.shopify.admin.types;

/**
 * The possible line types for a sale record. One of the possible order line types
 * for a sale is an adjustment. Sales adjustments occur when a refund is issued for
 * a line item that is either more or less than the total value of the line item.
 * Examples are restocking fees and goodwill payments. When this happens, Shopify
 * produces a sales agreement with sale records for each line item that is returned
 * or refunded and an additional sale record for the adjustment (for example, a
 * restocking fee). The sales records for the returned or refunded items represent
 * the reversal of the original line item sale value. The additional adjustment
 * sale record represents the difference between the original total value of all
 * line items that were refunded, and the actual amount refunded.
 */
public enum SaleLineType {
  /**
   * A product purchased, returned or exchanged.
   */
  PRODUCT,

  /**
   * A tip added by the customer.
   */
  TIP,

  /**
   * A gift card.
   */
  GIFT_CARD,

  /**
   * A shipping cost.
   */
  SHIPPING,

  /**
   * A duty charge.
   */
  DUTY,

  /**
   * An additional fee.
   */
  ADDITIONAL_FEE,

  /**
   * A fee charge.
   */
  FEE,

  /**
   * An unknown sale line. Represents new types that may be added in future versions.
   */
  UNKNOWN,

  /**
   * A sale adjustment.
   */
  ADJUSTMENT
}
