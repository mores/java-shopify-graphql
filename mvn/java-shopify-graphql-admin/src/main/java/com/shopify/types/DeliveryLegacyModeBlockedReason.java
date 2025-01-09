package com.shopify.types;

/**
 * Reasons the shop is blocked from converting to full multi-location delivery profiles mode.
 */
public enum DeliveryLegacyModeBlockedReason {
  MULTI_LOCATION_DISABLED,

  NO_LOCATIONS_FULFILLING_ONLINE_ORDERS
}
