package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `LocationDeactivateUserError`.
 */
public enum LocationDeactivateUserErrorCode {
  /**
   * Location not found.
   */
  LOCATION_NOT_FOUND,

  /**
   * Location either has a fulfillment service or is the only location with a shipping address.
   */
  PERMANENTLY_BLOCKED_FROM_DEACTIVATION_ERROR,

  /**
   * Location has incoming inventory. The location can be deactivated after the inventory has been received.
   */
  TEMPORARILY_BLOCKED_FROM_DEACTIVATION_ERROR,

  /**
   * Location needs to be removed from Shopify POS for Retail subscription in Point of Sale channel.
   */
  HAS_ACTIVE_RETAIL_SUBSCRIPTIONS,

  /**
   * Destination location is the same as the location to be deactivated.
   */
  DESTINATION_LOCATION_IS_THE_SAME_LOCATION,

  /**
   * Destination location is not found or inactive.
   */
  DESTINATION_LOCATION_NOT_FOUND_OR_INACTIVE,

  /**
   * Destination location is not Shopify managed.
   */
  DESTINATION_LOCATION_NOT_SHOPIFY_MANAGED,

  /**
   * Location could not be deactivated without specifying where to relocate inventory at the location.
   */
  HAS_ACTIVE_INVENTORY_ERROR,

  /**
   * Location could not be deactivated because it has pending orders.
   */
  HAS_FULFILLMENT_ORDERS_ERROR,

  /**
   * Location could not be deactivated because it has incoming inventory quantities from third party
   *         applications.
   */
  HAS_INCOMING_FROM_EXTERNAL_DOCUMENT_SOURCES,

  /**
   * Location could not be deactivated because it has open Shopify Fulfillment Network transfers.
   */
  HAS_INCOMING_MOVEMENTS_ERROR,

  /**
   * Location could not be deactivated because it has open purchase orders.
   */
  HAS_OPEN_PURCHASE_ORDERS_ERROR,

  /**
   * Failed to relocate active inventories to the destination location.
   */
  FAILED_TO_RELOCATE_ACTIVE_INVENTORIES,

  /**
   * Failed to relocate open purchase orders to the destination location.
   */
  FAILED_TO_RELOCATE_OPEN_PURCHASE_ORDERS,

  /**
   * Failed to relocate incoming movements to the destination location.
   */
  FAILED_TO_RELOCATE_INCOMING_MOVEMENTS,

  /**
   * At least one location must fulfill online orders.
   */
  CANNOT_DISABLE_ONLINE_ORDER_FULFILLMENT,

  /**
   * This request is currently in progress, please try again.
   */
  IDEMPOTENCY_CONCURRENT_REQUEST,

  /**
   * The same idempotency key cannot be used with different operation parameters.
   */
  IDEMPOTENCY_KEY_PARAMETER_MISMATCH
}
