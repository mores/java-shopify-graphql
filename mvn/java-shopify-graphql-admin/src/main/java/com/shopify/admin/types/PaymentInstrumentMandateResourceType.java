package com.shopify.admin.types;

/**
 * The type of resource a payment instrument mandate can be associated with.
 */
public enum PaymentInstrumentMandateResourceType {
  /**
   * A subscription contract.
   */
  SUBSCRIPTIONS,

  /**
   * An order.
   */
  ORDERS,

  /**
   * A draft order.
   */
  DRAFT_ORDERS
}
