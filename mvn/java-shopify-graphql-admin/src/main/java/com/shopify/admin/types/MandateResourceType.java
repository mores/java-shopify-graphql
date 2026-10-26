package com.shopify.admin.types;

/**
 * The type of resource a payment mandate can be used for.
 */
public enum MandateResourceType {
  /**
   * A credential stored on file for merchant and customer initiated transactions.
   */
  CREDENTIAL_ON_FILE,

  /**
   * A credential stored on file for checkout.
   */
  CHECKOUT,

  /**
   * A credential stored on file for a Draft Order.
   */
  DRAFT_ORDER,

  /**
   * A credential stored on file for an Order.
   */
  ORDER,

  /**
   * A credential stored for subscription billing attempts.
   */
  SUBSCRIPTIONS
}
