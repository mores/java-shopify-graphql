package com.shopify.admin.types;

/**
 * Represents how the compare at price will be determined for a price list.
 */
public enum PriceListCompareAtMode {
  /**
   * The compare at price is adjusted based on percentage specified in price list.
   */
  ADJUSTED,

  /**
   * The compare at prices are set to `null` unless explicitly defined by a fixed price value.
   */
  NULLIFY
}
