package com.shopify.admin.types;

/**
 * The type of resource a payment mandate can be used for.
 */
public enum MandateResourceType {
  CREDENTIAL_ON_FILE,

  CHECKOUT,

  DRAFT_ORDER,

  ORDER,

  SUBSCRIPTIONS
}
