package com.shopify.admin.types;

/**
 * Metafield access permissions for the Customer Account API.
 */
public enum MetafieldCustomerAccountAccessInput {
  /**
   * Read and write access.
   */
  READ_WRITE,

  /**
   * Read-only access.
   */
  READ,

  /**
   * No access.
   */
  NONE
}
