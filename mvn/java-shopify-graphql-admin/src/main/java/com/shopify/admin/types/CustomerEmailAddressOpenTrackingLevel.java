package com.shopify.admin.types;

/**
 * The different levels related to whether a customer has opted in to having their opened emails tracked.
 */
public enum CustomerEmailAddressOpenTrackingLevel {
  /**
   * The customer has not specified whether they want to opt in or out of having their open emails tracked.
   */
  UNKNOWN,

  /**
   * The customer has opted in to having their open emails tracked.
   */
  OPTED_IN,

  /**
   * The customer has opted out of having their open emails tracked.
   */
  OPTED_OUT
}
