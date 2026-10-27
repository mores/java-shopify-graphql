package com.shopify.admin.types;

/**
 * The status of a transfer.
 */
public enum InventoryTransferStatus {
  /**
   * The inventory transfer has been created but not yet finalized.
   */
  DRAFT,

  /**
   * The inventory transfer has been created, but not yet shipped.
   */
  READY_TO_SHIP,

  /**
   * The inventory transfer is in progress, with a shipment currently underway or received.
   */
  IN_PROGRESS,

  /**
   * The inventory transfer has been completely received at the destination.
   */
  TRANSFERRED,

  /**
   * The inventory transfer has been canceled.
   */
  CANCELED,

  /**
   * Status not included in the current enumeration set.
   */
  OTHER
}
