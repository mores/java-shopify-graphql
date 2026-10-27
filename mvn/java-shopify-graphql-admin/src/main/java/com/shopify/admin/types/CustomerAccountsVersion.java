package com.shopify.admin.types;

/**
 * The login redirection target for customer accounts.
 */
public enum CustomerAccountsVersion {
  /**
   * The customer is redirected to the classic customer accounts login page.
   */
  CLASSIC,

  /**
   * The customer is redirected to the new customer accounts login page.
   */
  NEW_CUSTOMER_ACCOUNTS
}
