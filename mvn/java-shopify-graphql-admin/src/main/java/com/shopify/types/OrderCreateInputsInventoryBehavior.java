package com.shopify.types;

/**
 * The types of behavior to use when updating inventory.
 */
public enum OrderCreateInputsInventoryBehavior {
  BYPASS,

  DECREMENT_IGNORING_POLICY,

  DECREMENT_OBEYING_POLICY
}
