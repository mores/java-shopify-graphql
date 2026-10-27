package com.shopify.admin.types;

/**
 * The valid values for the bulk operation's type.
 */
public enum BulkOperationType {
  /**
   * The bulk operation is a query.
   */
  QUERY,

  /**
   * The bulk operation is a mutation.
   */
  MUTATION
}
