package com.shopify.admin.types;

/**
 * The method by which the discount's value is allocated onto its entitled lines.
 */
public enum DiscountApplicationAllocationMethod {
  /**
   * The value is spread across all entitled lines.
   */
  ACROSS,

  /**
   * The value is applied onto every entitled line.
   */
  EACH,

  /**
   * The value is specifically applied onto a particular line.
   */
  ONE
}
