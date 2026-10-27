package com.shopify.admin.types;

/**
 * The set of valid sort keys for the Payout query.
 */
public enum PayoutSortKeys {
  /**
   * Sort by the `adjustment_gross` value.
   */
  ADJUSTMENT_GROSS,

  /**
   * Sort by the `advance_gross` value.
   */
  ADVANCE_GROSS,

  /**
   * Sort by the `amount` value.
   */
  AMOUNT,

  /**
   * Sort by the `charge_gross` value.
   */
  CHARGE_GROSS,

  /**
   * Sort by the `duties_gross` value.
   */
  DUTIES_GROSS,

  /**
   * Sort by the `fee_amount` value.
   */
  FEE_AMOUNT,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `issued_at` value.
   */
  ISSUED_AT,

  /**
   * Sort by the `refund_gross` value.
   */
  REFUND_GROSS,

  /**
   * Sort by the `shipping_label_gross` value.
   */
  SHIPPING_LABEL_GROSS,

  /**
   * Sort by the `status` value.
   */
  STATUS
}
