package com.shopify.admin.types;

/**
 * The types of behavior to use when updating inventory.
 */
public enum OrderCreateInputsInventoryBehavior {
  /**
   * Do not claim inventory.
   */
  BYPASS,

  /**
   * Ignore the product's inventory policy and claim inventory.
   */
  DECREMENT_IGNORING_POLICY,

  /**
   * Follow the product's inventory policy and claim inventory, if possible.
   */
  DECREMENT_OBEYING_POLICY
}
