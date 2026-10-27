package com.shopify.admin.types;

/**
 * The set of valid sort keys for the Transaction query.
 */
public enum TransactionSortKeys {
  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `expires_at` value.
   */
  EXPIRES_AT
}
