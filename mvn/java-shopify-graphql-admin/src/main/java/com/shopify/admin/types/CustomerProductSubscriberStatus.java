package com.shopify.admin.types;

/**
 * The possible product subscription states for a customer, as defined by the customer's subscription contracts.
 */
public enum CustomerProductSubscriberStatus {
  /**
   * The customer has at least one active subscription contract.
   */
  ACTIVE,

  /**
   * The customer's last subscription contract was cancelled and there are no other active or paused
   * subscription contracts.
   */
  CANCELLED,

  /**
   * The customer's last subscription contract expired and there are no other active or paused
   * subscription contracts.
   */
  EXPIRED,

  /**
   * The customer's last subscription contract failed and there are no other active or paused
   * subscription contracts.
   */
  FAILED,

  /**
   * The customer has never had a subscription contract.
   */
  NEVER_SUBSCRIBED,

  /**
   * The customer has at least one paused subscription contract and there are no other active
   * subscription contracts.
   */
  PAUSED
}
