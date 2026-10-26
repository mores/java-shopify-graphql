package com.shopify.admin.types;

/**
 * The reason for receiving a line item on an inventory shipment.
 */
public enum InventoryShipmentReceiveLineItemReason {
  /**
   * The line item was accepted.
   */
  ACCEPTED,

  /**
   * The line item was rejected.
   */
  REJECTED,

  /**
   * The line item was canceled.
   */
  CANCELED
}
