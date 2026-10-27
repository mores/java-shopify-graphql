package com.shopify.admin.types;

/**
 * The valid values for the state of a customer's account with a shop.
 */
public enum CustomerState {
  /**
   * The customer declined the email invite to create an account.
   */
  DECLINED,

  /**
   * The customer doesn't have an active account. Customer accounts can be disabled from the Shopify admin at any time.
   */
  DISABLED,

  /**
   * The customer has created an account.
   */
  ENABLED,

  /**
   * The customer has received an email invite to create an account.
   */
  INVITED
}
