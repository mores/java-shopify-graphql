package com.shopify.admin.types;

/**
 * The valid values for the inventory policy of a product variant once it is out of stock.
 */
public enum ProductVariantInventoryPolicy {
  /**
   * Customers can't buy this product variant after it's out of stock.
   */
  DENY,

  /**
   * Customers can buy this product variant after it's out of stock.
   */
  CONTINUE
}
