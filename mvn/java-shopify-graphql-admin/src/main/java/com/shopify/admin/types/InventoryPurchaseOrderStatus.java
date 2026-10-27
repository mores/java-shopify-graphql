package com.shopify.admin.types;

/**
 * The possible statuses an inventory purchase order can have.
 */
public enum InventoryPurchaseOrderStatus {
  /**
   * Purchase order is open and not marked as ordered yet.
   */
  DRAFT,

  /**
   * Purchase order is open and marked as ordered.
   */
  ORDERED
}
