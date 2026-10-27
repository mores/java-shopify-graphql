package com.shopify.admin.types;

/**
 * The status of an inventory shipment.
 */
public enum InventoryShipmentStatus {
  /**
   * The inventory shipment has been created but not yet shipped.
   */
  DRAFT,

  /**
   * The inventory shipment is currently in transit.
   */
  IN_TRANSIT,

  /**
   * The inventory shipment has been partially received at the destination.
   */
  PARTIALLY_RECEIVED,

  /**
   * The inventory shipment has been completely received at the destination.
   */
  RECEIVED,

  /**
   * Status not included in the current enumeration set.
   */
  OTHER
}
