package com.shopify.admin.types;

/**
 * Metafield access permissions for the Admin API.
 */
public enum MetafieldAdminAccessInput {
  /**
   * The merchant has read-only access. No other apps have access.
   */
  MERCHANT_READ,

  /**
   * The merchant has read and write access. No other apps have access.
   */
  MERCHANT_READ_WRITE
}
